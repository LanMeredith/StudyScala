package study.sbstraction

/**
 * @package study.sbstraction
 * @createTime 2023/6/3 7:30
 * @author SeedList
 * @Description
 */
class Student extends Human {

  var name: String = "YanMingHe"

  /*
  * 子类对抽象属性进行实现，父类抽象属性可以用var修饰
  * 子类对非抽象属性进行实现，父类非抽象属性只支持val类型，不支持var类型
  * 因为var修饰的为可变变量，子类继承后就可以直接使用，没有必要重写
  * */
  override val age: Int = 23
  sex = "男"

  /**
   * @param condition
   * @return void
   * @author SeedList
   * @createTime 2023/6/3 7:22
   * @Name live
   * @throw
   * @Description
   * 在scala中，方法或属性没有abstract关键字修饰
   * 一个方法或属性，只要没有定义，那么它就是抽象的
   * 声明是指Human这个类声明了一个方法live
   * 没定义是指这个方法目前没有等号或方法体
   * 子类重写非抽象方法的话需要使用override关键字，重写抽象方法的话则不需要
   */
  def live(condition: String): Unit = {
    println(s"My name is ${name} , age is ${age}, sex is ${sex} , at present ${condition}")
  }
}
