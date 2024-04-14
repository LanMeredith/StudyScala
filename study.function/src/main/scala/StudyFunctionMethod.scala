/**
 * @package
 * @createTime 2023/5/30 7:02
 * @author SeedList
 * @Description
 * 在scala中函数与方法有区别
 * （1）核心概念
 * 为完成某一功能的程序语句的集合称为函数
 * 类中的函数称为方法
 * （2）案例实操
 * scala可以在任何语法结构中声明任何的语法
 * 函数没有重载和重写的概念，方法可以进行重载和重写
 * scala中函数可以嵌套定义
 */
object StudyFunctionMethod {
  def main(args: Array[String]): Unit = {
    //    scala中可以在任何语法结构中声明任何的语法
    import java.util.Date
    new Date()

    /*
    * 函数可以声明在任何语法结构中，在类中叫方法
    * 函数不能重载或重写
    * 函数可以嵌套定义
    * */
    def test(): Unit = {
      println("无参数，无返回值函数，声明在main方法中，函数无法重载或重写")

      //      函数可以嵌套定义
      def test_test(): Unit = {
        println("函数可以嵌套定义")
      }

    }

    /*
    * 不能重写函数
    * def test(age:Int):Int = {
    *   println(age)
    * }
    * */
  }

  /**
   * @param
   * @return void 
   * @author SeedList
   * @createTime 2023/5/30 7:06
   * @Name main
   * @throw
   * @Description
   * 方法可以进行重载和重写，程序可以执行
   */
  def main(): Unit = {
    println("重载的方法")
  }
}
