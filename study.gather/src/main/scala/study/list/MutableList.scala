package study.list

import scala.collection.mutable.ListBuffer

/**
 * @package study.list
 * @createTime 2023/6/5 22:38
 * @author SeedList
 * @Description
 * 可变列表
 */
object MutableList {
  def main(args: Array[String]): Unit = {
    //    创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(1, 2, 3, 4)

    //    添加元素
    list1 += 1
    2 +=: list1
    list1.append(3)
    list1.prepend(4)
    println(list1)

    //    合并列表，返回新list
    val list3 = list1 ++ list2
    println(list3)
    //    合并列表，将list2中元素追加到list1
    list1 ++= list2
    println(list1)
    println(list2)
    //    合并列表，将list1中元素追加到list2
    list1 ++=: list2
    println(list2)

    //    修改列表下标为2的元素
    list1(2) = 5
    //    修改列表下标为0的元素
    list1.update(0, 6)
    println(list1)

    //    删除列表下标为1的元素
    list1.remove(1)
    //    从列表下标为4的元素开始往后删两个元素
    list1.remove(4, 2)
    //    删除列表中元素为6（不是索引，是元素）
    list1 -= 6
    println(list1)
  }
}
