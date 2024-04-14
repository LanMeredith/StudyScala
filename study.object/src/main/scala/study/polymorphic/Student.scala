package study.polymorphic

/**
 * @package study.polymorphic
 * @createTime 2023/6/2 15:02
 * @author SeedList
 * @Description
 * 继承Human
 * 相当于要直接调用Human的主构造器
 *
 * 在Student主构造器执行前，会先调用其父类的主构造器
 */
class Student(name: String) extends Human {
  var study: String = _

  println("Student的主构造器调用")

  def this(name: String, age: Int, study: String) {
    this(name)
    println("Student的辅助构造器调用")
    this.age = age
    this.study = study
  }

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/2 15:44
   * @Name printInfo
   * @throw
   * @Description
   * 重写父类方法
   */
  override def printInfo(): Unit = {
    println(s"Student: name = ${name} , age = ${age} , study =${study}")
  }
}
