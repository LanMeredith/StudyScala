/**
 * @package
 * @createTime 2023/5/29 10:49
 * @author SeedList
 * @Description object表示声明一个单例对象（伴生对象），该对象全局只有一个
 */
object HelloWorld {
  /**
   * @param args
   * @return void
   * @author SeedList
   * @createTime 2023/5/29 10:59
   * @Name main
   * @throw
   * @Description
   * main方法：从外部可以直接调用执行的方法
   * 参数：参数名称: 参数类型[泛型]
   * 写法:def 方法名称(参数名称: 参数类型): 返回值类型 = {方法体}
   */
  def main(args: Array[String]): Unit = {
    println("Hello World")
    //    在scala中也可以直接调用java的类库
    System.out.println("My name is Yan MingHe")
  }
}
