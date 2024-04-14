import scala.collection.mutable.ArrayBuffer

/**
 * @package
 * @createTime 2023/5/31 7:21
 * @author SeedList
 * @Description
 * 模拟Python中的Map映射，Filter过滤，Reduce聚合
 */
object StudyCollectionOperation {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(1, 2, 3, 4, 5)

    /*
    * map()应有两个参数，一个是函数f，另一个是列表list
    * 通过函数f依次作用在list每个元素上
    * */
    def map(array: Array[Int], fun: Int => Int): Array[Int] = {
      for (current <- array) yield fun(current)
    }

    //    调用map函数，传入函数为简写式，即对每个元素加一
    val resultMap = map(array, _ + 1)
    //    打印返回结果数组
    for (current <- resultMap) println(current)

    println()

    /*
    * reduce与map类似
    * 不过reduce传入的函数f需要有两个参数
    * reduce将会对列表每个元素进行调用f，并返回最后结果
    * */
    def reduce(array: Array[Int], fun: (Int, Int) => Int): Int = {
      var init: Int = array(0)
      for (i <- 1 until array.length) init = fun(init, array(i))
      init
    }

    //    调用reduce函数，传入函数为简写式，即让每个元素相加求和
    val sum: Int = reduce(array, _ + _)
    println(sum)

    println()

    /*
    * filter函数用传入函数f对每个元素进行判断
    * 返回true或false
    * 根据判断结果过滤掉不符合条件的元素
    * */
    def filter(array: Array[Int], fun: Int => Boolean): ArrayBuffer[Int] = {
      var result: ArrayBuffer[Int] = new ArrayBuffer[Int]()
      for (current <- array) {
        if (fun(current)) {
          result += current
        }
      }
      result
    }

    var resultFilter = filter(array, _ % 2 == 0)
    for (current <- resultFilter) println(current)
  }
}
