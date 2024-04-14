package study.singletonObject

/**
 * @package study.singletonObject
 * @createTime 2023/6/3 7:52
 * @author SeedList
 * @Description
 * 伴生对象
 *
 * scala语言是完全面向对象的语言，所以并没有静态的操作（没有static关键字）
 * 但是为了能够和java语言交互（java中有静态）
 * scala产生了一种特殊的对象来模拟类对象，该对象即为单例对象
 * 如果单例对象名与类名一致，则称该单例对象为这个类的伴生对象
 * 这个类的所有“静态”内容都可以放置在它的伴生对象中声明
 *
 * 单例对象采用object关键字声明
 * 单例对象对应的类称之为伴生类，伴生对象和伴生类的名称应该保持一致
 * 单例对象中的属性和方法都可以通过伴生对象（类名）直接调用访问
 * 必须在同一源文件中定义类和类的伴生对象
 *
 * 类和它的伴生对象可以互相访问对方的私有成员
 */
object Human {
  val school: String = "南昌商学院"

  /**
   * @param name
   * @param age
   * @return study.singletonObject.Human
   * @author SeedList
   * @createTime 2023/6/3 8:10
   * @Name newHuman
   * @throw
   * @Description
   * 当我们不希望通过类调用构造器创建对象时
   * 将构造器私有化后，可以在伴生对象中包装一个返回Human对象的方法
   * 这里推荐使用apply作为该方法
   * 虽然方法名称叫什么都可以实现同样的功能
   * 但在scala中，apply方法可以在被调用时做到更简洁一些
   * 即human = Human("YanMingHe",23)而不是human = Human.apply("YanMingHe",23)
   */
  def apply(name: String, age: Int): Human = {
    new Human(name, age)
  }
}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/3 8:08
 * @Description
 * 当我们不希望通过类直接调用构造器创建对象时
 * 可以用private将构造器私有化
 */
class Human private(val name: String, val age: Int) {
  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/3 7:55
   * @Name printInfo
   * @throw
   * @Description
   * 虽然在Human类中没有直接定义school属性
   * 但是所有的属性和方法都是基于对象去调用的
   * 而我们除了Human类以外，还有Human的伴生对象
   * 所以下面的Human.school的Human不仅表示类，还表示伴生对象
   */
  def printInfo(): Unit = {
    println(s"My name is $name , age is $age , school is ${Human.school}")
  }
}