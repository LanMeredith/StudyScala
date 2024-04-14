package study.map

import scala.collection.mutable

/**
 * @package study.map
 * @createTime 2023/6/6 12:55
 * @author SeedList
 * @Description
 * 可变Map
 */
object MutableMap {
  def main(args: Array[String]): Unit = {
    //    创建map
    val map1 = mutable.Map("a" -> 12, "b" -> 13, "c" -> 1)
    println(map1)
    //    类型和不可变Map不同，不可变Map会根据元素个数其类型末尾有数字符号，可变Map末尾就是HashMap
    println(map1.getClass)

    //    添加元素
    map1.put("d", 7)
    /*
    * 使用+=方法添加元素，需要用到两重小括号，里面的小括号表示键值对
    * 外层小括号是为了方便编译器理解的
    * 如果只要一层小括号，编译器会将里面的键值对认为是两个参数
    * 为了编译器能够准确理解，加上外层小括号表示方法调用，方法参数为键值对
    * */
    map1 += (("e", 123))
    println(map1)

    //    删除元素指定key即可
    map1.remove("e")
    /*
    * 和+=方法不同，
    * +=因为要新增元素，所以用两层括号表示调用方法，方法参数为键值对
    * -=方法则不一样，因为删除元素指定key即可，只有一个参数不会引发歧义，所以连小括号也能省略
    * */
    map1 -= "d"
    println(map1)

    //    修改元素（添加元素和修改元素都可以用update）
    map1.update("s", 123)
    map1.update("a", 321)
    println(map1)

    val map2 = mutable.Map("a" -> 92, "p" -> 13, "y" -> 1)
    //    合并Map，如果key值相同，则map2中的value覆盖掉map1中的value
    map1 ++= map2
    println(map1)
  }
}
