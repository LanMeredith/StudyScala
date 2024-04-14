package study

/**
 * @package study.PackageObject
 * @createTime 2023/6/1 8:13
 * @author SeedList
 * @Description
 * 在scala中可以为每个包定义一个同名的包对象
 * 定义在包对象中的成员，作为其对应包下所有class和object的共享变量，可以被直接访问
 *
 * 包对象名称必须与当前包名完全一致
 * 包对象的定义必须要与包在同一层级下，（嵌套式定义包，那么包对象也要在嵌套式里定义）
 */
package object PackageObject {
  val commonValue = "YanMingHe"

  def commonMethod(): Unit = {
    println(s"I am ${commonValue}")
  }
}
