/**
 * @package
 * @createTime 2023/6/9 11:09
 * @author SeedList
 * @Description
 * 模式匹配类型
 * 在scala中，模式匹配可以匹配所有的字面量，包括字符串、字符、数字、布尔值等等
 * 除了字面量，还可以匹配类型
 */
object MatchTypes {
  def main(args: Array[String]): Unit = {
    /**
     * @param x
     * @return java.lang.String
     * @author SeedList
     * @createTime 2023/6/10 7:57
     * @Name describeConst
     * @throw
     * @Description
     * 匹配常量
     */
    def describeConst(x: Any): String = x match {
      case 1 => "Number one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case 'a' => "Char a"
      case _ => "other"
    }

    println(describeConst("hello"))
    println(describeConst(0.3))
    println()

    /**
     * @param x
     * @return java.lang.String
     * @author SeedList
     * @createTime 2023/6/10 7:57
     * @Name describeType
     * @throw
     * @Description
     * 匹配类型
     */
    def describeType(x: Any): String = x match {
      case i: Int => "Int " + i
      case j: String => "String " + j
      case x: Char => "Char " + x
      case y: Double => "Double " + y
      case z: Boolean => "Boolean " + z
      //        scala中有泛型擦除，判断为List就能匹配成功，不考虑List元素的类型为String
      case list: List[String] => "List[String] " + list
      //        虽然有泛型擦除，但是Array中没有
      case array: Array[int] => "Array[Int] " + array.mkString(" ")
      //        如果对最后分支不对值进行操作，那么使用下划线即可，若要对值进行操作，则需要给一个名称
      case a => "other" + a
    }

    println(describeType(true))
    println(describeType(List("a", "b", "c")))
    println(describeType(List(1, 2, 3, 4, 5)))
    println()

    /*
    * 匹配数组
    * 对数组的匹配，不仅可以匹配数组中的具体数据
    * 还可以根据数组中的数据类型进行匹配
    * */
    for (arr <- List(
      Array(0),
      Array(1, 2, 3),
      Array("hello", 1, 2, 3),
      Array("0", 1),
      Array('1', '2'),
      Array("hello", "world")
    )) {
      var result = arr match {
        case Array(0) => "Array(0)"
        //          将匹配上的元素赋值给xyz
        case Array(x, y, z) => "Array(" + x + "," + y + "," + z + ")"
        case Array(x: String, y: Int) => "Array('0',1)"
        //          因为'0'作为字符在底层是以ASCII码对应的数字存储的，所以数组类型为x:Char,y:Int时不能匹配上
        case Array(x: Char, y: Char) => "Array('1','2')"
        case Array(x: String, y: String) => "Array(\"hello\",\"world\")"
        //          要求以String类型元素开头，剩下元素类型不限，个数不限
        case Array(x: String, _ *) => "Array(\"hello\",1,2,3)"
        case _ => "other"
      }
      println(result)
    }
    println()

    /*
    * 匹配列表
    * 类似于匹配数组
    * */
    for (list <- List(
      List(0),
      List('A', 'a'),
      List("String", "hello", "world"),
      List("String", 1),
      List(true, false),
      List(3.14)
    )) {
      var result = list match {
        case List(x) => "List(x)" + x
        case List(x: String, y: Int) => "List(" + x + "," + y + ")"
        case List(x: Boolean, y: Boolean) => "List(" + x + "," + y + ")"
        case List(x, y) => "List(" + x + "," + y + ")"
        //          要求以String类型元素开头，剩下元素类型不限，个数不限
        case List(x: String, _*) => "List(" + x + ",...)"
        case _ => "other"
      }
      println(result)
    }
    println()

    /*
    * 匹配列表的第二种方式
    * 以下的双冒号写法属于ImmutableList中新增元素的用法
    * 因为是双冒号方法，且没有.
    * 所以写在最右边的是list对象，左边的都是要添加的元素
    * first :: second :: rest意为需要以first与second两个元素开头，剩下的rest是个列表的情况
    * 也就是说list至少需要两个元素，且这两个元素需要和first与second相等
    * */
    val list = List(1, 2, 3, 4, 6)
    list match {
      //        list第一个元素和第二个元素与3和4不匹配
      case 3 :: 4 :: rest => println(s"first:1,second:2,rest:$rest")
      case first :: second :: rest => println(s"first:$first,second:$second,rest:$rest")
      case _ => println("other")
    }
    println()

    /*
    * 匹配元组
    * */
    for (tuple <- List(
      (0, 1),
      (0, "String"),
      (0, "String", 'a'),
      (0, true, 3.14),
      ("Hello", "world")
    )) {
      var result = tuple match {
        /*
        * _可以理解为何case _中的下划线一样的功能
        * 只是表示个占位符
        * 意为剩下的部分我们并不关系
        * 可以是任意个元素
        * 对此在输出时不能使用到_，直接使用将输出地址值
        * */
        case (a, b: Boolean, _) => "" + a + "" + b + ",_"
        case (a: String, b: String) => "" + a + "" + b
        case (0, _) => "0,_"
        case (a, b) => "" + a + " " + b
        case _ => "other"
      }
      println(result)
    }

    /*
    * 模式匹配在变量声明时匹配
    * */
    val (x, y) = (10, "Hello")
    println(s"x:$x,y:$y")

    val List(first, second, _*) = List(1, 2, 3, 4, 5)
    println(s"first: $first, second: $second")

    val fir :: sec :: rest = List(10, 8, 87, 4, 23, 4)
    println(s"fir: $fir, sec: $sec, rest: $rest")
    println()

    /*
    * for推导式中进行模式匹配
    * */
    val listTuple: List[(String, Int)] = List(("Yan", 1), ("Ming", 2), ("He", 3), ("Ming", 4))
    for ((str, i) <- listTuple) {
      println(s"str: $str, i: $i")
    }
    //    不考虑value，只遍历key
    for ((str, _) <- listTuple) {
      println(s"str: $str")
    }
    //    可以指定某个位置的值必须是多少
    for (("Ming", i) <- listTuple) {
      println(s"str: Ming, i: $i")
    }
  }
}
