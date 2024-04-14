package study.function.highLevel

/**
 * @package study.function.highLevel
 * @createTime 2023/6/8 10:52
 * @author SeedList
 * @Description
 */
object StudyMap {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    /*
    * 过滤
    * filter函数用传入函数f对每个元素进行判断
    * 返回true或false
    * 根据判断结果过滤掉不符合条件的元素
    * */
    println(list.filter(_ % 2 == 0))

    /*
    * map转换/映射
    * 通过函数f依次作用在list每个元素上
    * */
    println(list.map(_ + 1))

    /*
    * 扁平化
    * nestedList是嵌套包含了List的List
    * 调用flatten方法可以将其扁平化成一层List
    * */
    println(nestedList.flatten)
    val list1 = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println("调用flatten等同于：" + list1)

    /*
    * 扁平化+映射
    * flatMap相当于先进行map操作，再进行flatten操作
    * 以下代码既是对wordList集合中每个元素按照空格切分，然后扁平化
    * */
    println(wordList.flatMap(_.split(" ")))

    /*
    * 分组
    * 按指定的规则对集合的元素进行分组
    * 分组后得到一个map，组名是key，对应的元素保存为集合作为value
    * */
    println(list.groupBy(_ % 2))
    println(list.groupBy(date => if (date % 2 == 0) "偶数" else "奇数"))

    //    给定一组词汇，按照单词首字母进行分组
    val wordList1 = List("chain", "america", "alice", "canada", "cary", "bob", "japan")
    println(wordList1.groupBy(_.charAt(0)))
  }
}
