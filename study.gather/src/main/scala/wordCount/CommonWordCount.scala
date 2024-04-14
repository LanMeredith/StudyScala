package wordCount

/**
 * @package wordCount
 * @createTime 2023/6/9 9:28
 * @author SeedList
 * @Description
 */
object CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List(
      "Hello",
      "hello world",
      "hello Java",
      "hello hadoop",
      "hello spark",
      "hello spark from scala",
      "spark on hadoop",
      "hive on hadoop",
      "hive on spark"
    )

    //    对字符串进行切分，得到一个打散所有单词的列表
    val wordList: List[Array[String]] = stringList.map(_.split(" "))
    //    将其扁平化成一层list
    val wordCountNew: List[String] = wordList.flatten

    //    相同的单词进行分组
    val groupMap: Map[String, List[String]] = wordCountNew.groupBy(word => word)
    //    对分组之后的list取长度，得到每个单词的个数
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))

    //    将map转换成list，然后排序取前三
    val sortList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2).take(3)

    println(sortList)
  }
}
