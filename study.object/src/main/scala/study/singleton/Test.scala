package study.singleton

/**
 * @package study.singleton
 * @createTime 2023/6/3 8:23
 * @author SeedList
 * @Description
 */
object Test {
  def main(args: Array[String]): Unit = {
    val human1:Human = Human.getInstance()
    val human2:Human = Human.getInstance()

    println(human1 == human2)

    val people1:People = People.getInstance()
    val people2:People = People.getInstance()

    println(people1 == people2)
  }
}
