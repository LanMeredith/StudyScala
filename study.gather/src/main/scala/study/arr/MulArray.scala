package study.arr

/**
 * @package study.arr
 * @createTime 2023/6/5 21:09
 * @author SeedList
 * @Description
 */
object MulArray {
  def main(args: Array[String]): Unit = {
    //    创建二维数组，两行三列
    var arr = Array.ofDim[Int](2, 3)

    arr(1)(2) = 9
    println(arr(1)(2))

    //    打印二维数组
    for (i <- 0 until arr.length; j <- 0 until arr(i).length) {
      println(arr(i)(j))
    }

    //    打印二维数组
    for (i <- arr.indices; j <- arr(i).indices) {
      print(arr(i)(j) + "\t")
      if (j == arr(i).length - 1) println
    }

    //    打印二维数组
    arr.foreach(_.foreach(println))
  }
}
