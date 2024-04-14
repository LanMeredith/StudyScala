package study.tuple

/**
 * @package study.tuple
 * @createTime 2023/6/6 13:19
 * @author SeedList
 * @Description
 * 元组
 * 元组也可以理解为一个容器，可以存放各种相同或不同类型的数据
 * 说简单点，就是将多个无关的数据封装为一个整体，称之为元组
 * notice：一个元组最多只能有22个元素，这是由scala的数据类型决定的
 */
object StudyTuple {
  def main(args: Array[String]): Unit = {
    //    声明元组的方式：(元素1,元素2,元素3,元素4)
    val tuple: (Int, String, Char, Boolean) = (1, "YMH", 'Y', true)

    //    访问元组，按照元素顺序访问，调用方式：_顺序号
    println(tuple._3)

    //    通过索引访问数据
    println(tuple.productElement(0))

    //    通过迭代器访问数据
    for (elem <- tuple.productIterator) {
      print(elem + "\t")
    }

    //    map中的键值对其实就是元组，只不过元组的元素为2，称之为对偶
    val map1 = Map("a" -> 1, "b" -> 2)
    val map2 = Map(("a", 3), ("b", 4))

    println()
    map1.foreach(tuple => {
      println(tuple._1 + "=" + tuple._2)
    })

    //    嵌套元组
    val mulTuple = (12, 0.3, "hello", (23, "scala"), 231)
    //    输出mulTuple元组第四个元素（也是个元素）的第二个元素
    println(mulTuple._4._2)
  }
}
