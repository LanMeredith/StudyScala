package study.checkAndTransform

/**
 * @package study.checkAndTransform
 * @createTime 2023/6/4 9:15
 * @author SeedList
 * @Description
 * obj.isInstanceOf[T]判断obj是不是T类型
 * obj.asInstanceOf[T]将obj强转成T类型
 * classOf获取对象的类名
 */
object Test {
  def main(args: Array[String]): Unit = {
    val human: Human = new Student

    println("human是否为Human类：" + human.isInstanceOf[Human])
    println("human是否为Student类：" + human.isInstanceOf[Student])
    human.printInfo()

    human.asInstanceOf[Student]
    human.printInfo()
  }
}
