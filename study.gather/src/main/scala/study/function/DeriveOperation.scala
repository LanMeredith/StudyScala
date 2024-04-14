package study.function

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @package study.function
 * @createTime 2023/6/8 8:50
 * @author SeedList
 * @Description
 * 集合的衍生操作
 */
object DeriveOperation {
  def main(args: Array[String]): Unit = {
    val list1 = ListBuffer(1, 2, 3, 4, 5, 6)
    val set1 = mutable.Set(1, 2, 3, 4, 5, 6)

    /*
    * 获取集合的头
    * 底层实现实际是用迭代器取出了第一个元素
    * 因为set无序，所以这类集合的头元素是我们所无法预料的
    * */
    println(list1.head)
    println(set1.head)
    println()

    //    获取集合的尾（不是头的就是尾，也就是除了第一个元素是头元素外，其他都是尾）
    println(list1.tail)
    println(set1.tail)
    println()

    //    获取集合的最后一个元素
    println(list1.last)
    println(set1.last)
    println()

    /*
    * 集合的初始元素（不包含最后一个）
    * 经过为两个集合新增元素后再次输出的方法
    * 验证所谓集合初始元素，并非是指该集合创建之初就有的元素
    * 而是指该集合中，除了最后一个元素以外的所有元素
    * */
    println(list1.init)
    println(set1.init)
    list1 += 45
    list1 += 89
    set1 += 45
    set1 += 89
    println(list1.init)
    println(set1.init)
    println()

    /*
    * 反转集合元素
    * set这类无序集合不能反转
    * */
    println(list1.reverse)
    println()

    //    取前n个元素
    println(list1.take(3))
    println(set1.take(3))
    println()

    //    取后n个元素
    println(list1.takeRight(3))
    println(set1.takeRight(3))
    println()

    /*
    * 删除前n个元素
    * 不对原集合做出更改
    * 需要使用新的集合接收返回值
    * */
    println(list1.drop(2))
    println(set1.drop(2))
    var list2 = list1.drop(2)
    println(list2)
    println()

    //    删除后n个元素，与drop一样不对原集合做出更改
    println("list1删除后2两个元素后： " + list1.dropRight(2))
    println("set1删除后2两个元素后： " + set1.dropRight(2))
    println()

    /*
    * 求两个集合之间的并集
    * 不同类型的集合之间不能使用
    * 实际就是将两个集合合并在一起，list1在前list2在后
    * 如果是两个set集合合并，那会去重（set本身就会去除掉重复元素）
    * */
    println("list1.union(list2) : " + list1.union(list2))
    println("list1 ++ list2 : " + list1 ++ list2)
    val set2 = mutable.Set(4, 5, 6, 7, 8, 9)
    println("set1.union(set2) : " + set1.union(set2))
    println()

    //    求两个集合之间的交集，和求并集一样不同类型的集合之间不能使用
    println("list1.intersect(list2) : " + list1.intersect(list2))
    println()

    //    求两个集合之间的差集
    println("list1.diff(list2) : " + list1.diff(list2))
    println()

    /*
    * 拉链
    * 两个集合类型，对应位置的元素分别配对，变成二元组
    * 如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    * */
    println("list1.zip(list2) : " + list1.zip(list2))
    println()

    /*
    * 滑窗
    * 滑窗就是在集合中开一个窗口，窗口中只显示部分数据，方便我们对该部分数据进行操作
    * 并且窗口会滑动，每次滑动后显示出的数据也会不一样
    * sliding(a,b)
    * a表示窗口一次显示的数据量
    * b表示每次滑动多少个数据
    * 如果最后数据不够，那么窗口中仅显示剩余部分
    * 如果a=b，则将其称为滚动窗口
    * */
    println(list1)
    list1.sliding(2, 3).foreach(println)
  }
}
