/**
 * @package
 * @createTime 2023/6/10 15:40
 * @author SeedList
 * @Description
 * 模式匹配对象
 */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("YanMingHe", 23)

    //    针对对象实例的内容进行匹配
    val result = student match {
      case Student("YanMingHe", 23) => "YanMingHe,23"
      case _ => "other"
    }
    println(result)
  }
}

class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  //  必须实现一个unapply方法，用来对对象属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    } else {
      Some(student.name, student.age)
    }
  }
}