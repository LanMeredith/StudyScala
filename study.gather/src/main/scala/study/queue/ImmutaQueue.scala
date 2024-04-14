package study.queue

import scala.collection.immutable.Queue

/**
 * @package study.queue
 * @createTime 2023/6/9 10:38
 * @author SeedList
 * @Description
 * 不可变队列
 */
object ImmutaQueue {
  def main(args: Array[String]): Unit = {
//    创建不可变队列（不可变队列不能通过new的方式创建）
    val queue = Queue("abc", "def", "ghi", "jk")

//    不可变队列入列元素后需要用新队列接收，原队列元素内容不变
    val queue1 = queue.enqueue("ufo")
    println(queue)
    println(queue1)
  }
}
