package study.set

import scala.collection.mutable

/**
 * @package study.set
 * @createTime 2023/6/6 12:22
 * @author SeedList
 * @Description
 * 可变Set
 */
object MutableSet {
  def main(args: Array[String]): Unit = {
    //    因为可变和不可变Set都是Set，在默认创建时为不可变Set，我们需要指定包名为mutable才能创建可变Set
    val set1: mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 3)
    println(set1)

    //    不管是可变Set还是不可变Set，+方法都是返回一个新的Set而对原Set不做更改
    val set2 = set1 + 11
    println(set2)

    //    为set1新增元素
    set1 += 5
    //    用add方法新增元素，可以获取布尔类型返回值，添加成功将返回true
    val flag: Boolean = set1.add(6)
    println(set1)
    println(s"使用add方法添加元素，是否成功：$flag")

    //    删除元素，和+=类似
    set1 -= 5
    //    删除元素，和+类似，将会返回一个新的Set
    val set3 = set1 - 6
    println(set1)
    println(set3)

    val set4: mutable.Set[Int] = mutable.Set(7, 8, 9, 0, 3)
    //    在不可变Set中，++会将两个set合并在一起，无返回值，但是在可变Set中++需要接收返回值
    val set5 = set1 ++ set4
    println(set5)

    //    想要和不可变Set中的++一样，需要使用++=方法
    set1 ++= set4
    println(set1)
  }
}
