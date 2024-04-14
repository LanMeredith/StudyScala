package study.function

/**
 * @package study.function
 * @createTime 2023/6/8 9:37
 * @author SeedList
 * @Description
 * 计算简单函数
 */
object SimpleFigure {
  def main(args: Array[String]): Unit = {
    val list = List(1, -2, 9, -4, 5, 6, 7, 3, 8)

    //    求和
    println("list.sum = " + list.sum)

    //    求乘积
    println("list.product = " + list.product)

    /*
    * 求最大值
    * 如果集合中是元组类型，那么最大值比较的是第一个元素
    * 想要指定这种情况下比较的元素，可以使用maxBy
    * */
    println("list.max = " + list.max)
    val list1 = List(('a', 3), ('e', -21), ('z', 1), ('A', 56))
    println("list1.max = " + list1.max)
    println("list1.maxBy = " + list1.maxBy((tuple: (Char, Int)) => tuple._2))

    //    求最小值
    println("list.min = " + list.min)
    println("list1.minBy = " + list1.minBy(_._2))

    //    排序，返回一个新的集合，从小到大排序
    val list2 = list.sorted
    println("sortedList = " + list2)
    /*
    * 使用sorted从大到小排序
    * 可以先排序再倒序
    * 也可以为sorted传入隐式参数
    * */
    val list3 = list.sorted.reverse
    println("从大到小sortedList = " + list3)
    println(list.sorted(Ordering[Int].reverse))

    //    按元素大小排序
    println("按元素大小排序list.sortBy = " + list.sortBy(x => x))
    println("按元素大小排序list1.sortBy = " + list1.sortBy(_._2))

    //    按元素绝对值大小排序
    println("按元素绝对值大小排序list.sortBy = " + list.sortBy(_.abs))
    println("按元素绝对值大小排序list1.sortBy = " + list1.sortBy(_._2.abs))

    //    按元素大小升序排序
    println("按元素大小升序排序list.sortWith = " + list.sortWith((x, y) => x < y))

    //    按元素大小降序排序（因为参数只出现一次，所以按照顺序用下划线代替，lambda表达式简写为_>_）
    println("按元素大小降序排序list.sortWith = " + list.sortWith(_ > _))
  }
}
