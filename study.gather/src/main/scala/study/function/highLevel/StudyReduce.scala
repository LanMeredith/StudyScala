package study.function.highLevel

/**
 * @package study.function.highLevel
 * @createTime 2023/6/8 11:11
 * @author SeedList
 * @Description
 */
object StudyReduce {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    /*
    * reduce
    * reduce将会对列表每个元素进行调用f，并返回最后结果
    * 底层源码中reduce实际是调用reduceLeft方法，也就是对集合从左到右调用f
    * 但是reduceRight并不是简单的从右到左调用f
    * reduceRight在底层是将集合分成两部分的，第一部分是集合头，第二部分是集合尾（非头即尾）
    * 对第二部分，即集合尾再进行一个reduceRight的递归调用
    *
    * 以list.reduceRight(_ - _)为例
    * 第一步为head=1，tail=2,3,4...,8,9，判断tail不为空
    * 故tail.reduceRight(_ - _)进行递归
    * 第二步为head=2，tail=3,4,...,8,9
    * ...
    * 最后head=9，tail=Empty，返回head，即返回9
    * 倒数第二步，head - 最后一次递归的返回值 = 8 - 9
    * 倒数第三步，head - 倒数第二步递归的返回值 = 7 - (-1)
    * ...
    * 回到第一步，head - 第二步递归的返回值 = 1 - (-4) = 5
    * 等价于(1-(2-(3-(4-(5-(6-(7-(8-9)))))))
    * */
    println(list.reduce(_ + _))
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))

    /*
    * reduceRight在底层是将集合分成两部分的，第一部分是集合头，第二部分是集合尾（非头即尾）
    * 对第二部分，即集合尾再进行一个reduceRight的递归调用
    *
    * 以list.reduceRight(_ - _)为例
    * 第一步为head=1，tail=2,3,4...,8,9，判断tail不为空
    * 故tail.reduceRight(_ - _)进行递归
    * 第二步为head=2，tail=3,4,...,8,9
    * ...
    * 最后head=9，tail=Empty，返回head，即返回9
    * 倒数第二步，head - 最后一次递归的返回值 = 8 - 9
    * 倒数第三步，head - 倒数第二步递归的返回值 = 7 - (-1)
    * ...
    * 回到第一步，head - 第二步递归的返回值 = 1 - (-4) = 5
    * 等价于(1-(2-(3-(4-(5-(6-(7-(8-9)))))))
    * */
    println(list.reduceRight(_ - _))
  }
}
