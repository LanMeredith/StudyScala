package study.characteristic

import study.polymorphic.Pupil

/**
 * @package study.characteristic
 * @createTime 2023/6/3 15:49
 * @author SeedList
 * @Description
 */
object Test {
  def main(args: Array[String]): Unit = {
    val student = new Student("颜铭鹤", 23)
    student.sayHi()
    student.condition()

    pupil.increase()
    pupil.play()
    pupil.diamond()
    pupil.newDiamond()
  }
}
