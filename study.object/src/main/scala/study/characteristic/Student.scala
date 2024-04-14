package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/3 15:41
 * @author SeedList
 * @Description
 */
class Student(name: String, age: Int) extends People(name, age) with Young {
  /*
  * 因为父类People与特质Young中都有isLive，所以需要重写该属性才能被本类顺利调用
  * 又因为在父类中这不是个抽象属性，且是用val修饰的变量
  * 所以本类中需要用override关键字表明它是重写的属性，且修饰符要与父类保持一致
  * */
  override val isLive: String = "Yes"
  var race = "黄种人"

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/3 15:46
   * @Name condition
   * @throw
   * @Description
   * 实现Young特质中的抽象方法
   * 此处虽然IDEA没有报错，但实际上是存在错误的
   * 因为isLive属性为Student的父类People与特质Young共有的
   * 我们必须得在本类中重写isLive属性
   * 重写之后调用时，调用的就是自己的isLive
   */
  def condition(): Unit = {
    println(s"student $name is $age , condition = $isLive")
  }

  override def sayHi(): Unit = {
    super.sayHi()
    println(s"Hello ,my name is $name")
  }

  override def play(): Unit = println("Student playing")
}
