/**
 * @package
 * @createTime 2023/5/29 12:16
 * @author SeedList
 * @Description 学习变量的定义
 */
object StudyVariable {
  def main(args: Array[String]): Unit = {
    //    声明一个变量的通用语法
    var a: Int = 10
    //    声明变量时也可以不指定类型，编译器会自行推导
    var b = 20

    //    类型确定后，就不能修改，说明scala是强数据类型语言
    //    b = "String"

    //    声明变量时，必须要给初始值
    //    var c

    //    用val声明常量，声明后不可修改
    val name: String = "YMH"
    //    name = "123"
  }
}
