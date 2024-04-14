/**
 * @package
 * @createTime 2023/5/29 21:08
 * @author SeedList
 * @Description
 * 在scala中，if else是有返回值的，具体返回值取决于满足条件的代码体的最后一行内容
 * 如果返回值类型不一致，取它们的共同父类
 * 在scala中，java的三元运算符可以用if else代替
 */
object StudyIfElse {
  def main(args: Array[String]): Unit = {
    var condition: String = age(23)
    println(condition)

    var test: Any = testIfElse(100)
    println(test)

    /*
    * 在scala中，java的三元运算符可以用if else代替
    * 如果大括号内的逻辑代码只有一条，可以将其省略
    * 如果省略大括号，则if只对最近的一行逻辑代码起作用
    * */
    condition = if (23 >= 18) "青年" else "少年"
    println(condition)
  }

  /**
   * @param age
   * @return java.lang.String
   * @author SeedList
   * @createTime 2023/5/29 21:14
   * @Name age
   * @throw
   * @Description 在scala中，if else是有返回值的，具体返回值取决于满足条件的代码体的最后一行内容
   */
  def age(age: Int): String = {
    if (age < 18) {
      "少年"
    } else if (age >= 18 && age <= 65) {
      "中年"
    } else {
      "老年"
    }
  }

  /**
   * @param num
   * @return java.lang.Object
   * @author SeedList
   * @createTime 2023/5/29 21:14
   * @Name testIfElse
   * @throw
   * @Description 如果返回值类型不一致，取它们的共同父类
   */
  def testIfElse(num: Int): Any = {
    if (num < 18) {
      "少年"
    } else if (num >= 18 && num <= 65) {
      "中年"
    } else {
      false
    }
  }

//  只有一个if的话，默认else的返回值是Unit
  def testIfElseresult(num:Int):AnyVal = {
    if (num % 2 == 0){
      num
    }
  }
}
