package practice

/**
 * @package practice
 * @createTime 2023/5/30 18:11
 * @author SeedList
 * @Description
 * 定义一个匿名函数，并将它作为值赋给变量fun
 * 函数有三个参数，类型分别为Int，String，Char，返回值类型为 Boolean
 */
object First {
  def main(args: Array[String]): Unit = {
    var fun = (x: Int, str: String, c: Char) => {
      if (x == 0 && str == "" && c == '0') {
        false
      } else {
        true
      }
    }

    println(fun(0, "", '0'))
    println(fun(0, "0", '0'))

    def func(i: Int, str: String, c: Char): Boolean = {
      if (i == 0 && str == "" && c == '0') true else false
    }
  }
}
