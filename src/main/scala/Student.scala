/**
 * @package
 * @createTime 2023/5/29 11:43
 * @author SeedList
 * @Description
 */
class Student(name: String, age: Int) {
  def printlnInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

//引入伴生对象
object Student {
  val school: String = "江西农业大学南昌商学院"

  def main(args: Array[String]): Unit = {
    val ymh = new Student(name = "ymh", age = 23)
    ymh.printlnInfo()
  }
}