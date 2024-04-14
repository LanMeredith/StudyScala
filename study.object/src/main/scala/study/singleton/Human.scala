package study.singleton

/**
 * @package study.singleton
 * @createTime 2023/6/3 8:20
 * @author SeedList
 * @Description
 * 饿汉式单例设计模式
 * 先创建出对象，在任何时候使用时直接获取该对象即可，全局一份
 */
object Human {
  private val human: Human = new Human("YanMingHe", 23)
  def getInstance():Human = {
    human
  }
}


class Human private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"My name is $name , age is $age")
  }
}