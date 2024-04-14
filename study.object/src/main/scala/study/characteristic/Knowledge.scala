package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/4 7:24
 * @author SeedList
 * @Description
 */
trait Knowledge extends Origin {
  var amount: Int = 0

  def increase(): Unit

  def play(): Unit = println("knowledge is playing")

  override def diamond(): Unit = {
    super.diamond()
    println("knowledge")
  }
}
