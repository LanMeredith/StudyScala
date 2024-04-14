/**
 * @package
 * @createTime 2023/5/29 19:51
 * @author SeedList
 * @Description
 * scala运算符本质：
 * scala中其实是没有运算符的，所有运算符都是方法
 * 在scala中，调用对象方法时，可以省略.点
 * 如果函数参数只有一个，又或者没有参数时，()可以省略
 */
object StudyOperator {
  def main(args: Array[String]): Unit = {
    var str1: String = "Hello"
    var str2: String = new String("Hello")

    //    在scala中，==与equals()都是比较字符串的值
    println(str1 == str2)
    println(str1.equals(str2))

    //    java中==用于比较两个字符串的地址值，scala中想要做到这点需要使用eq()
    println(str1.eq(str2))

    var str3: String = null
    var str4: String = " "
    println(isNotEmpty(str3))
    println(isNotEmpty(str4))

    //    标准的加法运算
    var num: Int = 1.+(1)
    //    当调用对象的方法时，.点可以省略
    var num1: Int = 1 + (1)
    //    如果函数参数只有一个时，或者没有参数，()可以省略
    var num2: Int = 1 + 1

    //    不只是运算符，只要是该对象的方法都可以
    println(num2 toString)
  }

  /**
   * @param str
   * @return boolean
   * @author SeedList
   * @createTime 2023/5/29 20:14
   * @Name isNotEmpty
   * @throw
   * @Description
   * 判断传入的字符串是否为空
   * 先判断字符串是否为null（因为String是引用类型，可以为null）
   * 若为null，则短路与直接返回false
   * 若不为null，后续str.trim去除空白字符也不会出现null.trim的情况，不会报空指针异常
   */
  def isNotEmpty(str: String): Boolean = {
    return str != null && !("".equals(str.trim))
  }
}