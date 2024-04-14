package study.queue

import scala.collection.mutable

/**
 * @package study.queue
 * @createTime 2023/6/9 10:33
 * @author SeedList
 * @Description
 * 可变队列
 * 队列是先进先出
 */
object MutableQueue {
  def main(args: Array[String]): Unit = {
    //    创建一个可变队列
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    queue.enqueue("abc", "def", "ghi", "jk")

    println(queue)

    println(queue.dequeue())
    println(queue.dequeue())

    queue.enqueue("new")
    println(queue)
  }
}
