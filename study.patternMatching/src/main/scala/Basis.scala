import scala.io.StdIn

/**
 * @package
 * @createTime 2023/6/9 10:51
 * @author SeedList
 * @Description
 * 基础语法
 * 模式匹配语法中，采用 match 关键字声明，每个分支采用 case 关键字进行声明
 * 当需要匹配时，会从第一个 case分支开始，如果匹配成功，那么执行对应的逻辑代码
 * 如果匹配不成功，继续执行下一个分支进行判断
 * 如果所有 case 都不匹配，那么会执行 case _分支，类似于 Java 中 default 语句
 * 此处下划线并非是通配符，而是占位符，也可以写成case abc，不过通常写成case _
 * 如果对最后分支不对值进行操作，那么使用下划线即可，若要对值进行操作，则需要给一个名称
 *
 * 如果所有case都不匹配，则会执行case _，若无case _则会抛出MatchError
 * 每个case中，不需要使用break，自动中断case
 * match case语句可以匹配任何类型，而不只是字面量
 * =>后面的代码块，直到下一个case语句之前的代码是作为一个整体执行，可以使用{}，也可以不用
 */
object Basis {
  def main(args: Array[String]): Unit = {
    var a: Int = 100
    var b: Int = 20
    var operator: Char = 'd'

    println("请输入operator")
    operator = StdIn.readChar()

    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }

    println(result)
  }
}
