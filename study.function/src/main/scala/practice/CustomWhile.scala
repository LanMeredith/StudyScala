package practice

/**
 * @package practice
 * @createTime 2023/5/31 20:46
 * @author SeedList
 * @Description
 * 自定义while
 */
object CustomWhile {
  def main(args: Array[String]): Unit = {
    /**
     * @param condition
     * @param fun
     * @return scala.Function1<scala.runtime.BoxedUnit,scala.runtime.BoxedUnit>
     * @author SeedList
     * @createTime 2023/5/31 21:01
     * @Name myWhile
     * @throw
     * @Description
     * 传名参数，函数柯里化
     * 第一个参数是要求返回值Boolean的代码块
     * 第二个参数要求返回值Unit的代码块
     */
    def myWhile(condition: => Boolean)(fun: => Unit): Unit = {
      if (condition) {
        //        用到fun参数将会执行一遍代码块
        fun
        //        递归
        myWhile(condition)(fun)
      }
    }

    //    condition参数因为只有一行代码所以省略了大括号，fun参数也可以省略圆括号，直接写大括号
    var i: Int = 1
    myWhile(i < 10)({
      println(i)
      i += 1
    })
  }
}
