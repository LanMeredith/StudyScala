package study.function

/**
 * @package study.function
 * @createTime 2023/6/8 10:33
 * @author SeedList
 * @Description
 * 计算高级函数
 */
object AdvancedFigure {
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
    * 转换/映射
    * 通过函数f依次作用在list每个元素上
    * */
    println(list.map(_ + 1))

    /*
    * 扁平化
    * nestedList是嵌套包含了List的List
    * 调用flatten方法可以将其扁平化成一层List
    * */
    println(nestedList.flatten)

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

    /*
    * reduce
    * reduce将会对列表每个元素进行调用f，并返回最后结果
    * 底层源码中reduce实际是调用reduceLeft方法，也就是对集合从左到右调用f
    * reduceRight则是从右到左调用f
    * */
    println(list.reduce(_ + _))
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ - _))

    /*
    * fold
    * */
    println(list.fold(1)(_ - _))
  }
}
