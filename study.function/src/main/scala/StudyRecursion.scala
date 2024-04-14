import scala.annotation.tailrec

/**
 * @package
 * @createTime 2023/5/31 19:43
 * @author SeedList
 * @Description
 * scala中的递归，必须声明函数返回值类型
 */
object StudyRecursion {
  def main(args: Array[String]): Unit = {
    /**
     * @param result
     * @return int
     * @author SeedList
     * @createTime 2023/5/31 19:45
     * @Name factorial
     * @throw
     * @Description
     * 通过递归实现阶乘
     *
     * 这种方式相当于
     * 5 * factorial(4)
     * 5 * 4 * factorial(3)
     * 5 * 4 * 3 * factorial(2)
     * 5 * 4 * 3 * 2 * factorial(1)
     * 120
     */
    def factorial(result: Int): Int = {
      if (result == 1) 1 else result * factorial(result - 1)
    }

    println(factorial(5))

    /**
     * @param i
     * @return int
     * @author SeedList
     * @createTime 2023/5/31 19:51
     * @Name tailRecursion
     * @throw
     * @Description
     * 尾递归的实现
     * 在传统的递归中，通常是先执行递归调用，然后获取递归调用的返回值并计算结果
     * 在每次递归调用返回前，不会得到计算结果
     * 这样的方式有两个缺点：
     * 效率低，占内存
     * 如果递归链过长，可能会statck overflow
     *
     * 如果函数在尾位置调用自身（或是一个尾调用本身的其它函数等），则称这种情况为尾递归
     * 这种方式有两个好处：
     * 在尾部调用的是函数自身
     * 可通过优化，使得计算仅占用常量栈空间
     *
     * 下例中loop函数即为尾调用
     * （尾调用不是单纯的调用位置在尾部，而是除了调用自身以外，无需等待其返回值）
     * 同样是计算阶乘
     * 如果值为一的话，说明已经算完了，直接返回结果即可
     * 如果值不为一的话，说明还没算完，需要调用自身
     * 传入参数为下一个数，和当前计算结果
     *
     * 这种方式相当于从后往前计算
     * loop(5, 1)
     * loop(4, 1 * 5)
     * loop(3, 5 * 4)
     * loop(2, 20 * 3)
     * loop(1, 60 * 1)
     * 120
     * 整个内存中相当于只有一个loop函数在做循环，内存消耗更低
     *
     * 在尾递归函数前加上@tailrec注解可以表明我们写的是一个尾递归
     * 在java中是没有尾递归的
     */
    def tailRecursion(i: Int): Int = {
      @tailrec
      def loop(n: Int, currentResult: Int): Int = {
        if (n == 1) return currentResult else loop(n - 1, currentResult * n)
      }

      loop(i, 1)
    }

    println(tailRecursion(5))
  }
}
