import scala.beans.BeanProperty

/**
 * @package
 * @createTime 2023/6/1 8:50
 * @author SeedList
 * @Description
 */
object StudyClass {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.age)
    student.setAge(23)
    println(student.getAge)
  }
}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/1 8:51
 * @Description
 * 在scala中默认就是public属性
 * 我们不能手动添加public关键字，若添加则报错
 * 不过如果要声明为private属性时，可以手动添加private
 */
class Student {
  //  定义属性
  private var name = "YanMingHe"

  //  为了和java bean规范统一，scala提供了@BeanProperty注解，生成java中对应的set、get方法
  @BeanProperty
  //  下划线表示当前值为空
  var age: Int = _
}
