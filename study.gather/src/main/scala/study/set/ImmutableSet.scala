package study.set

/**
 * @package study.set
 * @createTime 2023/6/5 22:52
 * @author SeedList
 * @Description
 * 不可变Set
 */
object ImmutableSet {
  def main(args: Array[String]): Unit = {
    //    创建Set，底层是个特质，所以不能new，Set中重复数据会被去除
    val set1 = Set(1, 2, 3, 4, 4)
    println(set1)

//    添加元素（因为无序，所以添加元素不关心加在开头还是加在末尾）
    val set2 = set1.+(5)
    val set3 = set2 + 6
    println(set2)
    println(set3)

//    合并Set
    val set4 = set1 ++ set2
//    因为相同数据去重了，所以set1合并set2元素并没有多很多
    println(set4)

//    删除元素（Set无序，所以这里是直接删除元素，而不是根据下标删除）
    val set5 = set1 - 4
    println(set5)
  }
}
