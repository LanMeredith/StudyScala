package study.characteristic.traitSelfType

/**
 * @package study.characteristic.traitSelfType
 * @createTime 2023/6/4 9:11
 * @author SeedList
 * @Description
 */
object Test {
  def main(args: Array[String]): Unit = {
    val registerUser = new RegisterUser("root","study")
    registerUser.insert()
  }
}
