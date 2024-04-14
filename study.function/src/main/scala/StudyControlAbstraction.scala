/**
 * @package
 * @createTime 2023/5/31 20:24
 * @author SeedList
 * @Description
 * 控制抽象
 * 值调用
 * 名调用
 */
object StudyControlAbstraction {
  def main(args: Array[String]): Unit = {
    /**
     * @param a
     * @return void
     * @author SeedList
     * @createTime 2023/5/31 20:27
     * @Name fun
     * @throw
     * @Description
     * 传值参数（值调用）
     */
    def fun(a: Int): Int = {
      println(a)
      a
    }

    /**
     * @param i
     * @return void
     * @author SeedList
     * @createTime 2023/5/31 20:31
     * @Name funName
     * @throw
     * @Description
     * 传名参数（名调用）
     * 类似于匿名函数的写法
     * 在匿名函数中，输入参数为Int类型，返回结果为Int类型的函数可以写作：Int => Int
     * 而在这里的 => Int也类似
     * 可以理解为没有输入参数，但有返回值的代码块
     *
     * funName()函数所需的参数不再是某个值，而是一段代码块
     * 参数类型为=> Int表示其为一段返回值为Int类型的代码块
     * 这样的话，每一次使用到参数i，代码块中的程序就会跑一遍
     *
     * notice：传名参数需要手动在: =>冒号和等号中间打空格
     */
    def funName(i: => Int): Unit = {
      println("传名参数")
      println(s"i = ${i}")
    }

    //    fun(12)作为参数，名传递给funName函数，首先执行funName函数代码，当调用参数i时，执行fun(12)函数代码
    funName(fun(12))
    //    23也是一段代码块，只不过函数只有一行的时候将大括号省略了
    funName(23)
    //    直接写个匿名代码块也可以
    funName({
      println("传名参数也可以直接写匿名代码块")
      23
    })
    //    如果是传递代码块，小括号可以省略
    funName {
      println("传名参数也可以直接写匿名代码块")
      23
    }
  }
}
