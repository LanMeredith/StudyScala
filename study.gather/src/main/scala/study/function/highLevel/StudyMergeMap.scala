package study.function.highLevel

import scala.collection.mutable

/**
 * @package study.function.highLevel
 * @createTime 2023/6/9 8:50
 * @author SeedList
 * @Description
 */
object StudyMergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "c" -> 21, "p" -> 32)
    val map2 = mutable.Map("a" -> 12, "c" -> 1, "p" -> 132, "d" -> 12)

    //    得到的结果中，如果map1和map2有相同的key，则用map2的value覆盖map1的value
    println(map1 ++ map2)

    /*
    * 使用++方法导致的覆盖不一定就是我们想要的效果
    * 我们希望两个map统计完成后，合并在一起，相同的key可以让value相加，而不是以一个覆盖另一个
    * 想要完成这项操作，我们可以以一个map为基准
    * 对另一个map循环遍历，当有相同key时，让其value相加
    *
    * 以map2为基准，那就要对map1进行操作
    * 又因为fold要求聚合状态和当前数据类型要求一致（即初始值与当前数据类型要求一致）
    * 而在本例中，我们以map2为基准，即map2为初始值
    * 属于mutable.Map类型，而参与计算的当前数据类型来自于map1，属于对偶（二元组）
    * 类型不一致，不能使用fold方法，而应该调用foldLeft方法
    *
    * mergedMap参数是以map2为基础，经过f得来的
    * kv参数则是来自于map1的对偶
    * mergedMap.getOrElse(key, 0)获取与kv相同的key的value
    * 如果mergedMap中没有这个key，则根据getOrElse方法，返回结果为0
    * 用返回结果与value相加，这个value就是map1中的value
    * 相加结果也就是两个map相同key合并的结果，将其赋值给mergedMap(key)，也就是map2中的key
    * 最后将mergedMap返回即可
    *
    * 根据最终返回值为mutable.Map可见得是map2更新之后的map
    * */
    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      })

    println(stringToInt)
  }
}
