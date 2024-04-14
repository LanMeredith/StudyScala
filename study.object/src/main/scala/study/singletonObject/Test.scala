package study.singletonObject

/**
 * @package study.singletonObject
 * @createTime 2023/6/3 8:04
 * @author SeedList
 * @Description
 */
object Test {
  def main(args: Array[String]): Unit = {
//    实际是调用了伴生对象的apply方法
    val human: Human = Human("颜铭鹤", 23)
    human.printInfo()
  }
}
