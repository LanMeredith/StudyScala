package study.anonymous

/**
 * @package study.anonymous
 * @createTime 2023/6/3 7:43
 * @author SeedList
 * @Description
 * 匿名子类
 */
object Test {
  def main(args: Array[String]): Unit = {
    val person: People = new People {
      override var name: String = "YanMingHe"

      override def eat(): Unit = {
        println(s"${name} eat dinner")
      }
    }

    person.eat()
  }
}
