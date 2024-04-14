package study.arr

/**
 * @package study.array
 * @createTime 2023/6/4 13:57
 * @author SeedList
 * @Description
 * 不可变数组
 * 不可变不是指数组元素不可变，而是指其对象不可变
 */
object ImmutableArray {
  def main(args: Array[String]): Unit = {
    //    创建数组，需要声明数组长度
    var arr1 = new Array[Int](5)

    //    直接调用Array的伴生对象的apply方法，并且赋初始值
    var arr2 = Array(1, 2, 3, 4, 5)

    //    访问元素
    println(arr2(1))

    //    给指定元素赋值，默认为0
    arr1(0) = 23
    println(arr1(0))
    println()

    //    循环打印数组元素
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }

    println()

    //    arr2.indices等同于0 until arr2.length
    for (i <- arr2.indices) {
      println(arr2(i))
    }

    println()

    //    直接遍历所有元素，增强for循环
    for (elem <- arr2) {
      println(elem)
    }

    println()

    /*
    * 调用foreach方法（如果要传入的函数是一个函数体，而不是调用，则可以直接传入函数名称）
    * 以下写法等同于
    * arr2.foreach((elem:Int) => {println(elem)})
    * 函数体只有一行可以省略大括号
    * 只有一个参数，可以省略圆括号
    * 参数只调用一次，可以省略参数用下划线代替
    * arr2.foreach(println(_))
    * 传入参数是一个函数体，而不是调用，可以直接传入函数名称
    * arr2.foreach(println)
    * */
    arr2.foreach(println)

    println()

    //      迭代器
    val iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next())
    }

    println()

    //    把所有元素转换成一个String字符串，每个元素之间用“--”分隔开
    println(arr2.mkString("--"))

    /*
    * 添加元素（原数组不变，返回一个新的数组）
    * :+是通过隐式转换得到的方法
    * 在底层new了一个新数组，并且数组长度加一
    * 传入参数作为新元素追加到数组末尾
    * */
    val arr3 = arr1.:+(123)
    println(arr3.mkString(" "))

    //    和:+类似，不过这个方法是将新元素追加到最前面
    val arr4 = arr2.+:(123)
    println(arr4.mkString(" "))

    //    :+也是方法，所以点是可以省略的
    val arr5 = arr1 :+ 123
    //    以冒号结尾的方法，如果要省略点的话，对象应该写在右边（冒号对着对象）
    val arr6 = 21342 +: 890 +: arr1 :+ 213
    println("arr5 = " + arr5.mkString(" "))
    println("arr6 = " + arr6.mkString(" "))
  }
}
