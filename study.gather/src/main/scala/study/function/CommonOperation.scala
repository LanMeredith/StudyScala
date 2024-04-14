package study.function

/**
 * @package study.function
 * @createTime 2023/6/6 19:18
 * @author SeedList
 * @Description
 * 集合的通用属性和操作
 */
object CommonOperation {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6)
    val set1 = Set(1, 2, 3, 4, 5, 6)

    /*
    * 获取集合长度
    * length方法是LinearSeqOptimized特质中的，所以只要是线性集合都可以获取length
    * 但是有些集合没有长度概念
    * 所以要调用TraversableOnce特质中的size方法，获取集合的大小
    * */
    println(list1.length)
    println(list1.size)
    println(set1.size)

    println()
    //    循环遍历
    for (elem <- list1) {
      println(elem)
    }

    println()
    //    增强for循环
    set1.foreach(println)

    println()
    //    迭代器
    for (elem <- list1.indices) println(elem)

    //    生成字符串
    println(list1)
    println(set1)
    println(list1.mkString(","))

    println()
    //    是否包含指定元素
    println(list1.contains(4))
    println(set1.contains(4))
  }
}
