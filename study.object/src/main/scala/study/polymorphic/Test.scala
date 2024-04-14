package study.polymorphic

/**
 * @package study.polymorphic
 * @createTime 2023/6/2 15:15
 * @author SeedList
 * @Description
 */
object Test {
  def main(args: Array[String]): Unit = {
    val human = new Human("YanMingHe", 23)
    human.printInfo()
//    humanPrintInfo()会根据传入的对象，动态调用相应的方法
    human.humanPrintInfo(human)

    println()

    val student = new Student("颜铭鹤", 23, "大学")
    student.printInfo()
    human.humanPrintInfo(student)

    println()

    val pupil = new Pupil("YMH", 23, "小学", 100)
    pupil.printInfo()
    human.humanPrintInfo(pupil)
  }
}
