package study.polymorphic

/**
 * @package study.polymorphic
 * @createTime 2023/6/2 15:12
 * @author SeedList
 * @Description
 * 如果父类的主构造器要求传入参数
 * 那么子类的主构造器至少要传入相应的参数
 *
 * name、age、study都是继承自Studnet类的属性，所以不用加修饰符，只要声明变量类型即可
 * grade是Pupil类自己新增的属性，需要加修饰符，否则就只能是个局部变量
 *
 * 在创建对象时，先去调用Pupil类的父类的主构造器
 * 又因为其父类Student的父类是Human，所以要先调用Human的主构造器
 * 故而主构造器的先后调用顺序是Human、Student、Pupil
 */
class Pupil(name: String, age: Int, study: String, var grade: Int) extends Student(name) {
  println("Pupil的主构造器调用")

  override def printInfo(): Unit = {
    println(s"Pupil: name = ${name} , age = ${age} , study = ${study} , grade = ${grade}")
  }
}
