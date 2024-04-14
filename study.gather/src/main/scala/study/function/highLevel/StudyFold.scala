package study.function.highLevel

/**
 * @package study.function.highLevel
 * @createTime 2023/6/9 7:28
 * @author SeedList
 * @Description
 */
object StudyFold {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    /*
    * fold方法使用了函数柯里化，存在两个参数列表
    * 第一个参数列表为：零值（初始值，表示聚合的初始状态）
    * 第二个参数列表为：简化规则，即函数f
    * 该函数f涉及两个参数，第一个参数表示当前聚合的状态，第二个参数为当前新进的参数，返回值为聚合结果
    * 两个参数要求类型一致
    * f中的两个参数，第一个参数是在初始值的基础上经过f得来的
    * 第二个参数来自于list
    *
    * 在底层，fold方法其实是foldLeft方法
    * 逻辑为将零值（也就是fold的第一个参数，初始值）与列表的第一个参数作为两个参数传入f
    * 得出的结果作为新的零值返回，与列表的第二个参数作为两个参数传入f
    * 直到最后，返回最终的结果
    * */
    println(list.fold(10)(_ + _))

    /*
    * 在底层，fold方法其实是foldLeft方法
    * 逻辑为将零值（也就是fold的第一个参数，初始值）与列表的第一个参数作为两个参数传入f
    * 得出的结果作为新的零值返回，与列表的第二个参数作为两个参数传入f
    * 直到最后，返回最终的结果
    *
    * 不过fold和foldLeft还是有所区别的
    * foldLeft中聚合操作需要的两个参数，聚合状态和当前数据元素的类型可以不相同
    * */
    println(list.foldLeft(10)(_ - _))

    /*
    * 和reduce类似，foldRight并不是将零值与列表最后一个值作为两个参数传入f
    * 而是将列表最后一个值与零值作为两个参数传入f
    * 以list.foldRight(10)(_ - _)为例
    * 在底层先是将list元素翻转成9,8,...,2,1
    * 然后调用foldLeft，不过传入的参数是让列表元素做f的第一个参数，零值做f的第二个参数
    * 等价于(9-(8-(7-(6-(5-(4-(3-(2-(1-10)))))))))
    * */
    println(list.foldRight(10)(_ - _))
  }
}
