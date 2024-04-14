package study.constructor

/**
 * @package study.constructor
 * @createTime 2023/6/2 14:22
 * @author SeedList
 * @Description
 */
object TestConstructor {
  def main(args: Array[String]): Unit = {
    //    在Human类中，主构造器就是无参的
    var human: Human = new Human()
    human.human()

    println()

    //    与java中的概念不同，scala中只有一个主构造器，其余的都是要直接或间接调用主构造器的辅助构造器
    human = new Human("YanMingHe")
    human.human()

    println()

    human = new Human("YanMingHe", 23)
    human.human()

    println()

    //    调用无参的主构造器创建对象，我们可以通过对象.属性的方式设置其值
    val nullParams = new NullParams
    nullParams.name = "alice"
    nullParams.age = 21
    println(s"nullParams: name = ${nullParams.name} , age = ${nullParams.age}")

    //    给主构造器传参，直接定义出属性会更方便
    val varParams = new VarParams("Ymh", 23)
    println(s"varParams: name = ${varParams.name} , age = ${varParams.age}")
    //    在varParams类中，name和age都是用var修饰的，所以在定义过后可以更改
    varParams.age = 21
    println(s"varParams: name = ${varParams.name} , age = ${varParams.age}")

    val valParams = new ValParams("YMH", 23)
    println(s"valParams: name = ${valParams.name} , age = ${valParams.age}")
    //    在valParams类中，name和age都是val修饰的，所以定义过后就不能再修改了
    //    valParams.age = 21

    val withoutModifier = new WithoutModifier("YanMingHe", 23)
    /*
    * 没法通过对象.属性的方式访问，因为主构造器中，name与age没有任何修饰符，这两个参数只是一个局部变量
    * println(s"withoutModifier: name = ${withoutModifier.name} , age = ${withoutModifier.age}")
    * 想要调用传入的参数的话，那就只能在WithoutModifier类中编写方法调用
    * */
    withoutModifier.printlnInof()
  }
}
