package wordCount

/**
 * @package wordCount
 * @createTime 2023/6/9 9:43
 * @author SeedList
 * @Description
 */
object ComplexWordCount {
  def main(args: Array[String]): Unit = {
    //    相对于普通wordCount，复杂wordCount中每一个句子都附带有已经统计出的，该句子出现的次数
    val stringList: List[(String, Int)] = List(
      ("YanMingHe", 10),
      ("hello world", 4),
      ("study Java", 2),
      ("hello hadoop", 5),
      ("study spark", 2),
      ("hello spark from scala", 23),
      ("spark on hadoop", 1),
      ("hive on hadoop", 4),
      ("hive on spark", 3)
    )

    /*
    * 思路一：
    * 直接展开为普通版本
    * 然后按照普通版本操作即可
    * 对字符串进行切分，得到一个打散所有单词的列表
    * 将其扁平化成一层list
    * 相同的单词进行分组
    * 对分组之后的list取长度，得到每个单词的个数
    * 将map转换成list，然后排序取前三
    * */
    val newStringList = stringList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )
    val sortList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(sortList)

    /*
    * 思路二：
    * 直接基于预统计的结果进行转换
    * 先将预统计的每个句子按照空格切分
    * 预统计的句子是key，所以对key按照空格切分
    * 然后再对切分出来的新key组合起value
    * 得到一个新的二元组列表
    * 再对二元组列表按照单词进行分组
    * */

    //    将字符串打散为单词，并结合对应的个数，包装成元组
    val preCountList: List[(String, Int)] = stringList.flatMap(
      kv => {
        //        将预统计的句子按照空格切分
        val strings: Array[String] = kv._1.split(" ")
        //        将切分结果与value组合起新的元组
        strings.map(word => (word, kv._2))
      }
    )

    //    对二元组按照单词进行分组
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)

    /*
    * 叠加每个单词预统计的个数值
    * mapValues对map中的value进行操作
    * preCountMap中的value是List[(String, Int)]类型
    * */
    val countMap: Map[String, Int] = preCountMap.mapValues(
      tupleList => tupleList.map(_._2).sum
    )

    //    转换成list，排序取前三
    val countList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2) take (3)
    println(countList)
  }
}
