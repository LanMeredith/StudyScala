package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/3 15:23
 * @author SeedList
 * @Description
 * 特质
 *
 * 在scala中，采用特质trait来代替接口的概念
 * 也就是说多个类具有相同的特质（特征）时，就可以将这个特质独立出来
 * 采用关键字trait声明
 * scala中trait中的既可以有抽象属性和方法，也可以有具体的属性和方法
 * 这种感觉类似于java中的抽象类，同时也像接口一样，一个类可以同时混入多个特质
 * 在java中接口里的所有方法都是抽象方法，接口中的所有属性都是常量
 * 抽象类中可以包含非抽象方法，但是接口不行
 * 而在scala中，可以在特质trait里声明抽象和非抽象属性，声明抽象和非抽象方法
 *
 * scala引入trait，第一可以代替java的接口，第二也是对单继承机制的补充
 * 所有的java接口都可以当成scala特质使用
 *
 * 特质与抽象类的区别
 * 优先使用特质，一个类扩展多个特质是很方便的，但却只能扩展一个抽象类
 * 如果需要构造函数参数，则需要使用抽象类。
 * 因为抽象类可以定义带参数的构造函数，而特质不行（有无参构造）
 *
 * 说明：
 * 类和特质的关系：使用继承的关系
 * 当一个类去继承特质时，第一个连接词是extends，后面是with
 * 如果一个类同时继承特质与父类，那么父类应该写在extends后面
 *
 * 使用extends混入特质：
 * className extends superName with traitName1 with traitName2...
 * className extends traitName1 with traitName2 ...
 *
 * 动态混入：可以灵活的扩展类的功能
 * 动态混入可以在创建对象时混入该特质，而无需使类混入该特质
 * 如果混入的trait中有未实现的方法，则需要实现
 */
trait Young extends Origin {
  //  声明抽象和非抽象属性
  var race: String
  val isLive: String = "No"

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/3 15:37
   * @Name play
   * @throw
   * @Description
   * 定义一个非抽象方法
   */
  def play(): Unit = {
    println("young man is playing")
  }

  def condition(): Unit

  override def diamond(): Unit = {
    super.diamond()
    println("young")
  }
}
