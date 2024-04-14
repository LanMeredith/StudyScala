package study.polymorphic

/**
 * @package study.polymorphic
 * @createTime 2023/6/2 14:59
 * @author SeedList
 * @Description
 * scala中属性和方法都是动态绑定，而java中只有方法是动态绑定
 */
class Human {
  var name: String = _
  var age: Int = _

  println("Human的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("Human的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Human: name = ${name} , age = ${age}")
  }

  def humanPrintInfo(human: Human): Unit = {
    human.printInfo()
  }
}
