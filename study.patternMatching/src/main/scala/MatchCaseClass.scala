/**
 * @package
 * @createTime 2023/6/10 15:47
 * @author SeedList
 * @Description
 */
object MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val singer = new Singer("YanMingHe", 23)

    //    针对对象实例的内容进行匹配
    val result = singer match {
      case Singer("YanMingHe", 23) => "YanMingHe,23"
      case _ => "other"
    }
    println(result)
  }
}


/**
 * @author SeedList
 * @package
 * @createTime 2023/6/10 15:48
 * @Description
 * 使用case定义样例类
 * 样例类默认实现了伴生对象以及apply和unapply方法
 * 同时样例类主构造器中所有参数默认为属性，默认有val声明
 * （通常情况下需要使用val或var声明为属性，若无声明则为参数）
 * 有关构造器参数部分可以在study.object模块下的src/main/scala/study/constructor/Human.scala中查看
 */
case class Singer(name: String, age: Int)