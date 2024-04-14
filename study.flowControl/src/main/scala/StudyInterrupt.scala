import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

/**
 * @package
 * @createTime 2023/5/29 21:56
 * @author SeedList
 * @Description
 * 在scala中没有break和continue关键字
 * 可以使用breakable控制结构来实现break和continue功能
 */
object StudyInterrupt {
  def main(args: Array[String]): Unit = {
    /*
    * 采用抛出异常的方式退出循环
    * */
    try {
      for (i <- 1 to 10) {
        println(i)
        if (i == 5) throw new RuntimeException
      }
    } catch {
      case e =>
    }
    println("循环结束")

    /*
    * 使用scala自带的函数结束循环
    * */
    Breaks.breakable(
      for (i <- 1 to 10) {
        println(i)
        if (i == 5) Breaks.break()
      }
    )
    println("循环结束")

    //    也可以对Breaks.breakable进行省略
    breakable(
    for (i <- 1 to 10) {
      println(i)
      if (i == 5) break
    }
    )
    println("循环结束")
  }
}
