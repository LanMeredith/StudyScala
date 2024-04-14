package study.list

/**
 * @package study.list
 * @createTime 2023/6/5 21:42
 * @author SeedList
 * @Description
 * 不可变列表
 */
object ImmutableList {
  def main(args: Array[String]): Unit = {
    //    创建list（只能通过List.apply方法创建对象，不能直接new（List底层是抽象方法）
    val list1 = List(1, 2, 3, 4)
    println(list1)

    /*
    * 虽然list是LinearSeq
    * 但是为了方便，我们可以使用list(1)的方式来访问输出列表中下标为1的元素
    * 不过这种方式只限于查找，不能用于更改列表元素
    * */
    println(list1(1))
    //    list1(1) = 0

    //    遍历列表
    list1.foreach(println)

    //    添加元素，方式和数组类似
    val list2 = 5634 +: list1
    val list3 = list1 :+ 123
    println(list2)
    println(list3)

    //    将新元素添加在列表前面
    val list4 = list2.::(23)
    println(list4)

    //    双冒号通常是用来创造新的列表
    val list5 = Nil.::(23)
    println(list5)

    /*
    * 双冒号的方式好处在于创建对象时，直接写要添加的数，最后跟上::Nil即可
    * */
    val list6 = 1 :: 2 :: 3 :: Nil
    println(list6)

    /*
    * 这是为list2追加一个list类型的元素
    * 而不是将list1中的元素取出来追加给list2
    * */
    val list7 = list1 :: list2
    println(list7)

    /*
    * 想要将list1中的元素取出来追加给list2
    * 我们可以使用 ::: 或者 ++ 方法
    * */
    val list8 = list1 ::: list2
    val list9 = list1 ++ list2
    println(list8)
    println(list9)
  }
}
