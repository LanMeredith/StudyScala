/**
 * @package
 * @createTime 2023/5/30 16:39
 * @author SeedList
 * @Description
 * 匿名函数也就是没有名字的函数
 * 匿名函数的简化原则
 * 参数的类型可以省略，会根据形参进行自动推导
 * 类型省略后，如果只有一个参数，则圆括号可以省略
 * 没有参数或参数超过一个则不能省略圆括号
 * 匿名函数如果只有一行，则可以省略大括号
 * 如果参数只出现一次，则参数省略且后面的参数可以使用_下划线代替
 */
object StudyAnonymousFunction {
  def main(args: Array[String]): Unit = {
    def funParam(fun: String => Unit): Unit = {
      println("这是一个以函数作为参数的函数")
      fun("颜铭鹤")
    }

    def funTest(name: String): Unit = {
      println(name + "123")
    }

    //    参数的类型可以省略
    funParam((name) => {
      println(s"${name}")
    })

    //    类型省略后，如果只有一个参数，则圆括号可以省略。没有参数或参数超过一个则不能省略圆括号
    funParam(name => {
      println(name)
    })

    //    匿名函数如果只有一行，则可以省略大括号
    funParam(name => println(name))

    //    如果参数只出现一次，则参数省略且后面的参数可以使用_下划线代替
    funParam(println(_))

    //    如果要传入的函数是一个函数体，而不是调用，则可以直接传入函数名称
    funParam(println)
    funParam(funTest)

    /*
    * 传递的函数有两个参数
    * */
    def add(x: Int, y: Int, fun: (Int, Int) => Int): Int = {
      fun(x, y)
    }

    //    两个参数的匿名函数标准写法
    println(add(3, 8, (x: Int, y: Int) => {
      x + y
    }))

    //    参数的类型可以省略，会自动推导
    println(add(1, 2, (x, y) => {
      x + y
    }))

    //    如果只有一行，大括号可以省略
    println(add(1, 3, (x, y) => x + y))

    /*
    * 如果参数只出现一次，则参数省略且后面参数可以用_下划线代替
    * 下划线顺序与参数顺序一致
    * */
    println(add(1, 5, _ + _))
  }
}
