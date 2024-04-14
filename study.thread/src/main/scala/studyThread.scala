import scala.collection.parallel.immutable.ParSeq

/**
 * @package
 * @createTime 2023/6/9 10:47
 * @author SeedList
 * @Description
 */
object studyThread {
  def main(args: Array[String]): Unit = {
//    par使其以并行运行
    val results: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(results)
  }
}
