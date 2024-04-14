/**
 * @package
 * @createTime 2023/6/9 11:02
 * @author SeedList
 * @Description
 * 如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
 */
object Protect {
  def main(args: Array[String]): Unit = {
    /**
     * @param x
     * @return java.lang.Object
     * @author SeedList
     * @createTime 2023/6/9 11:05
     * @Name abs
     * @throw
     * @Description
     * abs方法的返回值就是x
     * 我们对x增加一个模式匹配
     * 并且对模式匹配增加条件守卫
     * 符合条件的值，进入到模式匹配的代码块中
     */
    def abs(x: Int) = x match {
      //        如果i>=0则进入代码块直接返回i
      case i: Int if i >= 0 => i
      //        如果j<0则进入代码块返回-j
      case j: Int if j < 0 => -j
      case _ => "type illegal"
    }

    println(abs(-5))
  }
}
