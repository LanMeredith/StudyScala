package practice

/**
 * @package practice
 * @createTime 2023/5/30 18:35
 * @author SeedList
 * @Description
 * 定义一个函数 func，它接收一个 Int 类型的参数
 * 返回一个函数（记作 f1）
 * 它返回的函数 f1，接收一个 String 类型的参数
 * 同样返回一个函数（记作 f2）
 * 函数 f2 接收一个 Char 类型的参数
 * 返回一个 Boolean 的值
 * 要求调用函数  func(0) (“”) (‘0’)得到返回值为  false，其它情况均返回  true
 */
object Second {
  def main(args: Array[String]): Unit = {
    def func(i: Int) = {
      def f1(str: String) = {
        def f2(c: Char): Boolean = {
          if (i == 0 && str == "" && c == '0') {
            false
          }
          else {
            true
          }
        }

        f2 _
      }

      f1 _
    }

    println(func(0)("")('0'))
    println(func(0)("")('a'))

    /*
    * 简写
    * fun1后小括号内写的是最外层函数的形参
    * 返回值是String => (Char => Boolean)表示返回的是一个函数
    * 返回的函数，其参数是String类型，其中嵌套了又一个返回函数，是Char类型参数，Boolean类型返回值
    * 在函数体中，因为前面已经声明了参数类型，所以后续可以不用赘述
    * 函数体内容可以视为lambda表达式
    * str => (c => if (i == 0 && str == "" && c == '0') true else false)
    * 参数只有一个可以省略圆括号
    * 参数类型可以省略，会根据形参自动推导
    * 参数只有一行可以省略大括号
    * */
    def fun1(i: Int): String => (Char => Boolean) = {
      str => c => if (i == 0 && str == "" && c == '0') true else false
    }

    /*
    * 柯里化
    * 把一个参数列表的多个参数，变成多个参数列表
    * 这样实际上是有三层函数嵌套的
    * */
    def func2(i: Int)(str: String)(c: Char): Boolean = {
      if (i == 0 && str == "" && c == '0') true else false
    }
  }
}
