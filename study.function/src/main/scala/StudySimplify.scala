/**
 * @package
 * @createTime 2023/5/30 7:27
 * @author SeedList
 * @Description
 * 函数至简原则
 * return可以省略，scala会使用函数最后一行代码作为返回值
 * 如果函数体只有一行代码，可以省略花括号
 * 返回值类型如果可以推断出来，可以省略（冒号与返回值类型一并省略）
 * 如果有return，则不能省略返回值类型，必须指定
 * 如果函数声明返回值类型为Unit，那么即便有return也不起作用
 * scala如果期望无返回值类型，可以省略等号（将无返回值的函数称之为过程）
 * 如果函数无参，但声明了参数列表，那么调用时，小括号可加可不加（所谓参数列表就是函数名后的小括号）
 * 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
 * 如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
 */
object StudySimplify {
  def main(args: Array[String]): Unit = {
    //    return可以省略，scala会使用函数最后一行代码作为返回值
    def test1(str: String): String = {
      str + " World"
    }

    val test1result = test1("Hello")
    println(test1result)

    //    如果函数体只有一行代码，可以省略花括号
    def test2(str: String): String = str + "World"

    //    返回值类型如果可以推断出来，可以省略（冒号与返回值类型一并省略）
    def test3(str: String) = str + "World"

    //    scala如果期望无返回值类型，可以省略等号（将无返回值的函数称之为过程）
    def test4() {
      "Hello World"
    }
    //    打印结果为()，是因为Unit只有一个对象，就是()
    println(test4())

    //    如果函数无参，但声明了参数列表，那么调用时，小括号可加可不加（所谓参数列表就是函数名后的小括号）
    def test5() = "Hello World"

    println(test5())
    println(test5)

    //    如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def test6 = "Hello World YMH"

    println(test6)
    /*
    * 如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略，也就是匿名函数，lambda表达式
    * lambda不能声明返回值类型
    * 需要注意的是这种lambda直接写出来后，会出现后续代码无法执行的情况
    * */
    (name: String) => {
      println(name)
    }

      () => {
        println("Hello World")
      }

        /*
        * 对lambda表达式后接.var自动生成赋值
        * 可见var function:String => Unit
        * function是变量名
        * String => Unit表示以String作为参数，Unit作为返回值类型的函数
        * */
        val function: String => Unit = (name: String) => {
          println(name)
        }
  }
}
