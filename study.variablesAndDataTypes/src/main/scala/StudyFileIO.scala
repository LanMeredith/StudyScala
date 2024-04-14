import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * @package
 * @createTime 2023/5/29 15:48
 * @author SeedList
 * @Description 从文件中读取数据
 */
object StudyFileIO {
  def main(args: Array[String]): Unit = {
//    从文件中读取数据
    Source.fromFile("D:\\JAVA_IDEA\\IO\\studyScalaFileIO.txt").foreach(print)

//    将数据写入文件（scala中没有写入文件的方法，需要调用java的类库）
    val writer = new PrintWriter(new File("D:\\JAVA_IDEA\\IO\\studyScalaFileIO.txt"))
    writer.write("My name is Yan MingHe")
    writer.close()
  }
}
