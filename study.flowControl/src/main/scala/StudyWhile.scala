/**
 * @package
 * @createTime 2023/5/29 21:52
 * @author SeedList
 * @Description
 * scala中while、do while用法与java相同
 * 与for不同，while无返回值，即while返回结果为Unit
 * 因为while中没有返回值
 * 所以当要用该语句来计算并返回结果时，就不可避免的使用变量
 * 而变量需要声明在while循环的外部
 * 那么就等同于循环的内部对外部的变量造成了影响
 * 所以不推荐使用，而是推荐使用 for 循环
 */
object StudyWhile {
  def main(args: Array[String]): Unit = {
    var num: Int = 1
    while (num < 10) {
      print(num + "\t")
      num += 2
    }
  }
}
