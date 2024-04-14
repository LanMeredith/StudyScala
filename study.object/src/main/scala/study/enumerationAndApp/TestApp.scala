package study.enumerationAndApp

/**
 * @package study.enumerationAndApp
 * @createTime 2023/6/4 9:45
 * @author SeedList
 * @Description
 * 应用类必须定义为object
 * 需要继承APP类
 */
object TestApp extends App {
  println(WorkDay.FRIDAY)

  /*
  * 使用type关键字
  * 可以定义新的数据类型名称，本质就是类型的一个别名
  * */
  type myString = String
  val str: myString = "Hello"
  println(str)
}
