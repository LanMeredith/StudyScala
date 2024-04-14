/**
 * @package
 * @createTime 2023/6/10 16:01
 * @author SeedList
 * @Description
 * 偏函数
 */
object PartialFunction {
  def main(args: Array[String]): Unit = {
    val list = List(("Yan", 1), ("Ming", 2), ("He", 3), ("Ming", 4))

    //    map转换，实现key不变，value乘2
    val newList1 = list.map(kv => (kv._1, kv._2 * 2))
    println(newList1)

    //    利用模式匹配完成value乘2
    val newList2 = list.map(
      kv => {
        kv match {
          case (k, v) => (k, v * 2)
        }
      }
    )
    println(newList2)

    //    省略lambda表达式的写法，进行简化
    val newList3 = list.map {
      case (k, v) => (k, v * 2)
    }
    println(newList3)

    /*
    * 偏函数实现求绝对值
    * */
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case x if x == 0 => 0
    }

    //    将三个偏函数作为一个部分组合起了一个完整的函数，再把x传入就可以得到返回值了
    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(0))
    println(abs(1))
    println(abs(-1))
  }
}
