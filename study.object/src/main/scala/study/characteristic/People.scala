package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/3 15:38
 * @author SeedList
 * @Description
 */
class People(val name: String, val age: Int) {
  val isLive: String = "Yes"

  def sayHi(): Unit = {
    println("hello form " + name)
  }
}
