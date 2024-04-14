/**
 * @package
 * @createTime 2023/5/30 15:59
 * @author SeedList
 * @Description
 * 高阶函数部分
 */
object StudyHigherFunction {
  def main(args: Array[String]): Unit = {
    def fun() = println("Hello World")

    def met() = "hello world"

    /*
    * 函数可以作为值进行传递
    * 这里由fun传递给f的值为Unit
    * 由met传递给m的值为String类型的"hello world"
    * 即函数的返回值将作为值进行传递
    * 在函数作为值传递时，函数体内代码会执行一遍
    * */
    val f = fun
    println(f)
    val m = met
    println(m)

    /*
    * 在调用的函数后面加上下划线，相当于把函数当成一个整体传递给变量
    * 在这个过程中，函数体内代码不会执行
    * 在变量后加上小括号，就相当于调用该函数
    * */
    val f1 = fun _
    println(f1)
    val m1 = met _
    println(m1)
    f1()

    /*
    * 如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给变量
    * 在此过程中，同样不会执行函数体内代码
    * 变量名后加小括号，相当于调用该函数
    * */
    val f2: () => Unit = fun
    val m2: () => String = met
    f2()

    /*
    * 函数也可以作为返回值
    * 此返回值就相当于  变量 = fun2 _
    * */
    def fun1() = {
      def fun2() = {
        "Hello World fun2"
      }
      fun2 _
    }

    val f3 = fun1()
    println(s"f3 = ${f3}")
//    因为fun1的返回值仍然为函数，所以变量f3可以作为函数继续调用
    println(f3())
//    简写
    println(fun1()())

    /*
    * 如果将lambda表达式赋值给变量
    * 相当于将整个函数当成一个整体传递给变量
    * */
    val anonymous = (name: String) => {
      println("Hello World " + name)
    }

    println(anonymous)

    /*
    * 我们可以将函数作为参数进行传递
    * funParam是当前函数的名称
    * fun是参数名称，参数类型是String => Unit
    * 可以参考StudySimplify.scala中的笔记
    * String => Unit表示一个以String作为参数，Unit作为返回值的函数
    * (fun: String => Unit)即为函数参数
    * */
    def funParam(fun: String => Unit): Unit = {
      println("这是一个以函数作为参数的函数")
      fun("颜铭鹤")
    }

    funParam(anonymous)
    //    不止可以传入一个已经定义好的函数，还可以传入一个匿名函数
    funParam((name: String) => {
      println(s"I Love you ${name}")
    })


  }
}
