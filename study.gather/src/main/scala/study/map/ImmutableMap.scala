package study.map

/**
 * @package study.map
 * @createTime 2023/6/6 12:34
 * @author SeedList
 * @Description
 * 不可变Map
 */
object ImmutableMap {
  def main(args: Array[String]): Unit = {
    //    和Set一样，底层是个特征，所以不能直接new，需要调用伴生对象的apply方法
    val map1: Map[String, Int] = Map("a" -> 12, "b" -> 13, "c" -> 1)
    println(map1)
    //    scala.collection.immutable.Map$Map3保存了三个元素的Map
    println(map1.getClass)

    //    遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))

    //    取map中所有的key或value
    for (key <- map1.keys) {
      println(s"$key -> ${map1.get(key)}")
    }

    /*
    * 访问指定key的value
    * 发现其返回值为Some
    * 是因为get方法在底层返回的是Option类型
    * 这么做是为了避免出现空指针异常问题
    * Option有两个子类，分别为Some和None
    * 如果出现空指针，那就返回None，如果不是空指针，则返回Some
    * 如果想要获取到其值，可以再调用get
    * 这一get是Some类型中的方法，返回value的值
    *
    * 不过这种写法不够安全
    * 因为在调用get获取value值之前，我们并不知道map.get()返回的是None还是Some
    * 所以此处更推荐使用getOrElse方法
    * 如果key有对应的value，则返回其值
    * 如果是空指针，则返回一个默认的值
    *
    * 如果想要查不到直接抛出异常，可以这么写：println(map1("a"))
    * */
    println(map1.get("a").get)
    println(map1.getOrElse("a", 0))
    println(map1.getOrElse("f", 0))

    val map2: Map[String, Int] = Map("y" -> 12, "a" -> 23, "h" -> 1)
//    合并map，使用++方法将返回一个新的map
    val map3 = map1 ++ map2
    println(map3)
    println(map3.getClass)
  }
}
