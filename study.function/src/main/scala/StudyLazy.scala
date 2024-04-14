/**
 * @package
 * @createTime 2023/5/31 21:06
 * @author SeedList
 * @Description
 * 惰性加载（懒加载）
 * 当函数的返回值被声明为lazy时
 * 函数的执行将会被推出
 * 直到我们首次对此取值
 * 该函数才会执行
 * 这种函数我们称之为惰性函数
 *
 * 被lazy修饰的变量初始化的时机是在第一次使用此变量时才会完成赋值
 * 并且仅在第一次调用时才会计算值，即值只会被计算一次，赋值一次，在之后不能被更改了
 * 所以lazy修饰的变量必须同时是val修饰的不可变变量
 */
object StudyLazy {
  def main(args: Array[String]): Unit = {
    def sum(x: Int)(y: Int): Int = {
      println("sum函数开始执行")
      x + y
    }

    //    lazy修饰的变量必须同时是val修饰的不可变变量
    lazy val result = sum(23)(23)
    println("此时sum函数还没有开始执行")
    println(s"在执行这行代码之前，因为本行代码调用了result参数，所以先进行计算，然后再执行此行代码\nresult = ${result}")
    println(s"计算出结果后，再次调用result参数也不会再次调用了\nresult = ${result}")
  }
}
