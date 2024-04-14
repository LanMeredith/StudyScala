/**
 * @package
 * @createTime 2023/5/29 12:30
 * @author SeedList
 * @Description 学习字符串输出
 */
object StudyPrintString {
  def main(args: Array[String]): Unit = {
    var name: String = "YMH"
    var age: Int = 23

    //    字符串，通过+号连接
    println(name + " " + age)
    println(name + age)

    //    用于将一个字符串复制多次并拼接
    println(name * 3)

    //    使用占位符，通过百分号传值
    printf("%s,%d\n", name, age)

    //    字符串模板（插值字符串），s""表示模板，通过$获取变量值，用花括号括起来
    println(s"${age}岁的${name}在江西农业大学南昌商学院上学")

    var num: Double = 3.14
    //    格式化模板字符串，2.2f中f表示当前是一个浮点值类型，第一个2表示整个数的长度为2，不够需要补空格，第二个2表示小数部分长度为2
    println(f"The num is ${num}%2.2f")
    //    使用raw的话，只会将变量填入，然后按原始模样输出，不遵循模板
    println(raw"The num is ${num}%2.2f")

    //    三引号表示字符串，保持多行字符串的原格式输出
    var sql =
      s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}
         |and
         |  age = ${age}
         |""".stripMargin
    println(sql)
  }
}
