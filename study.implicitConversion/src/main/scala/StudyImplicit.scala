/**
 * @package
 * @createTime 2023/6/10 19:50
 * @author SeedList
 * @Description
 * 当编译器第一次编译失败的时候，会在当前环境中查找能让代码编译通过的方法
 * 用于将类型进行转换，实现二次编译
 */
object StudyImplicit {
  def main(args: Array[String]): Unit = {
    /**
     * @param num
     * @return MyRichInt 
     * @author SeedList
     * @createTime 2023/6/10 19:54
     * @Name converter
     * @throw
     * @Description
     * 隐式函数
     * 隐式转换可以在不许更改任何代码的情况下，扩展某个类的功能
     * 使用implicit关键字声明的函数称之为隐式函数
     * 当想要调用对象功能时，如果编译错误
     * 那么编译器会尝试在当前作用域范围内查找能调用对应功能的转换规则，这个调用过程是由编译器完成的
     * 所以称之为隐式转换，也称之为自动转换
     */
    implicit def converter(num: Int): MyRichInt = new MyRichInt(num)

    println(12.myMax(15))

    //    隐式类
    println(18.myMin2(23))

    /**
     * @param name
     * @return void 
     * @author SeedList
     * @createTime 2023/6/10 20:06
     * @Name sayHello
     * @throw
     * @Description
     * 隐式参数
     * 普通方法或函数中的参数可以通过implicit关键字声明为隐式参数
     * 调用该方法时就可以传入该参数
     * 编译器会在相应的作用域内寻找符合条件的隐式值
     * 说明：
     * 同一个作用域中，相同类型的隐式值只能有一个
     * 编译器按照隐式参数的类型去寻找对应类型的隐式值，与隐式值的名称无关（所以不能有两个相同类型的隐式值）
     * 隐式参数优先于默认参数
     *
     * 方法的参数声明为隐式参数后，其底层是以柯里化去表达的
     * sayHello(implicit name: String = "YMH")实际是sayHello()(implicit name: String = "YMH")
     * 在这种情况下，sayHello相当于一个空参的方法
     * 如果是sayHello(implicit name: String = "YMH")这种写法
     * 便是方法空参省略了小括号，调用时也应该省略小括号
     * 如果是sayHello()(implicit name: String = "YMH")这种写法
     * 便是方法空参没有省略小括号，调用时可加小括号，也可不加
     * 关于空参省略小括号的部分内容可见study.function模块下src/main/scala/StudySimplify.scala
     */
    def sayHello(implicit name: String = "YMH"): Unit = {
      println("hello " + name)
    }

    implicit val str: String = "YanMingHe"
    sayHello

    implicit val age: Int = 18


    /**
     * @param
     * @return void
     * @author SeedList
     * @createTime 2023/6/10 20:18
     * @Name hiAge
     * @throw
     * @Description
     * 简便写法
     * 因为隐式值的匹配只在乎类型，而不在乎名称，所以可以将参数名称省略
     * 没有参数名称，用implicitly[Int]来表示需要一个Int类型的隐式值
     * 需要注意的是，如果方法中隐式参数有名称，那么隐式值只要在作用域范围内定义即可
     * 而没有名称的简便写法，必须将隐式值定义在方法之前
     */
    def hiAge(): Unit = {
      println("hi " + implicitly[Int])
    }

    hiAge()
  }

  /**
   * @author SeedList
   * @package
   * @createTime 2023/6/10 19:59
   * @Description
   * 隐式类
   * 隐式类所带有的构造参数有且只能有一个
   * 隐式类必须被定义在类或伴生对象或包对象里，即隐式类不能是顶级的
   */
  implicit class MyRichInt2(val self: Int) {
    //  自定义比较大小的方法
    def myMax2(n: Int): Int = if (n < self) self else n

    def myMin2(n: Int): Int = if (n > self) self else n
  }

}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/10 19:52
 * @Description
 * 自定义类
 */
class MyRichInt(val self: Int) {
  //  自定义比较大小的方法
  def myMax(n: Int): Int = if (n < self) self else n

  def myMin(n: Int): Int = if (n > self) self else n
}