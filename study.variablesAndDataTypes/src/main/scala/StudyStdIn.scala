import scala.io.StdIn

/**
 * @package
 * @createTime 2023/5/29 15:43
 * @author SeedList
 * @Description 控制台标准输入
 */
object StudyStdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的大名：")
    var name: String = StdIn.readLine()
    println("请输入您的年龄：")
    var age: Int = StdIn.readInt()
    println(s"${name}今年${age}")
  }
}
