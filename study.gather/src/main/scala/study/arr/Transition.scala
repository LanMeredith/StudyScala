package study.arr

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @package study.arr
 * @createTime 2023/6/5 21:02
 * @author SeedList
 * @Description
 * 可变数组与不可变数组的转换
 */
object Transition {
  def main(args: Array[String]): Unit = {
    val arrBuffer = ArrayBuffer(123, 456, 789, 0)
    //    可变数组转不可变数组
    val arr: Array[Int] = arrBuffer.toArray
    //    打印出地址值，说明这是个不可变数组
    println(arr)
    println(arr.mkString(","))

    //    不可变数组转可变数组
    val newArrBuffer: mutable.Buffer[Int] = arr.toBuffer
    println(newArrBuffer)
  }
}
