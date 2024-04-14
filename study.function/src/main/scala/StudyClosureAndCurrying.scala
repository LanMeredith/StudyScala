/**
 * @package
 * @createTime 2023/5/31 13:26
 * @author SeedList
 * @Description
 * 闭包
 * 如果一个函数，访问到了它的外部（局部）变量的值，那么这个函数和它所处的环境，称为闭包
 * 函数柯里化
 * 把一个参数列表的多个参数，变成多个参数列表
 */
object StudyClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    /**
     * @param i
     * @return scala.Function1<java.lang.String,scala.Function1<java.lang.Object,java.lang.Object>>
     * @author SeedList
     * @createTime 2023/5/31 13:31
     * @Name func
     * @throw
     * @Description
     * 内层函数在判断时用到了外部定义声明出来的参数
     * 这个函数和它所处的环境，称为闭包
     */
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

    //    柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
  }
}
