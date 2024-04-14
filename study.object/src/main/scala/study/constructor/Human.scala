package study.constructor

/**
 * @package study.constructor
 * @createTime 2023/6/2 14:20
 * @author SeedList
 * @Description
 * scala中类的构造器包括：主构造器和辅助构造器
 * class 类名(参数列表){}这就是主构造器
 * 在类体中定义def this(形参列表){}这是辅助构造器
 *
 * 辅助构造器，函数名称为this，可以有多个，编辑器通过参数的个数与类型来进行区分
 * 辅助构造器不能直接构建对象，必须直接或间接调用主构造器
 * 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
 *
 * java中构造器是和类名相同的方法
 * scala中，this才是构造器，同名方法只是个普通方法
 *
 * scala类中的主构造器的形参包括三种类型：未使用任何修饰、var、val
 * 未使用任何修饰符修饰，这个参数就是一个局部变量
 * var修饰参数，作为类的成员属性使用，可以修改
 * val修饰参数，作为类只读属性使用，不能修改
 */
class Human {
  var name: String = _
  var age: Int = _

  println("主构造方法被调用")

  /**
   * @param name
   * @return
   * @author SeedList
   * @createTime 2023/6/1 9:37
   * @Name Human
   * @throw
   * @Description
   * 主构造器空参，那么辅助构造器就要有参数
   * 在辅助构造器中需要直接或间接调用主构造器，即this()（主构造器空参）
   */
  def this(name: String) {
    this()
    println("辅助构造器方法一调用")
    this.name = name
  }

  /**
   * @param name
   * @param age
   * @return
   * @author SeedList
   * @createTime 2023/6/1 9:41
   * @Name Human
   * @throw
   * @Description
   * 在此辅助构造器中，直接调用了this(name:String)这个辅助构造器
   * 而该辅助构造器又直接的调用了this()这个主构造器
   * 所以，相当于这个辅助构造器间接的调用了主构造器
   */
  def this(name: String, age: Int) {
    this(name)
    println("辅助构造器方法二调用")
    this.age = age
  }

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/1 9:46
   * @Name human
   * @throw
   * @Description
   * 此方法虽然与类同名，但实际上只是一个普通方法
   */
  def human(): Unit = {
    println(s"name = $name age = $age")
  }
}
