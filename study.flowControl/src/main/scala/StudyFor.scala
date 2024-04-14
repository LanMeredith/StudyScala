/**
 * @package
 * @createTime 2023/5/29 21:17
 * @author SeedList
 * @Description
 */
object StudyFor {
  def main(args: Array[String]): Unit = {
    /*
    * 范围数据循环（to）
    * i表示循环的变量，<-规定to
    * i从1开始到3结束，包含3，前后闭合
    * to其实也是方法
    * scala的隐式转换将Int转换为RichInt，调用to方法得到返回结果为Range.Inclusive
    * Inclusive是Range的内部类，继承了Range
    * 在其中重新声明了isInclusive参数的值为true
    * 该参数控制是否为包含3
    * */
    for (i <- 1 to 3) {
      println(i)
    }

    println()

    /*
    * 范围数据循环（until）
    * 与to类似，不过是左闭右开
    * 此方法底层是在RichInt返回一个Range对象
    * Range对象中，isInclusive默认是false
    * 因此until范围是左闭右开
    * */
    for (i <- 1 until 3) {
      println(i)
    }

    println()

    /*
    * 循环守卫
    * 即循环保护式，也称为条件判断式，守卫
    * 保护式为true则进入循环，否则跳过本次循环，类似于continue
    * 以下代码等价于
    * for(i <- 1 to 3) {
    *   if(i != 2){
    *     println(i)
    *   }
    * }
    * */
    for (i <- 1 to 3 if i != 2) {
      println(i)
    }

    println()

    /*
    * 循环步长
    * by表示步长
    * */
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    println()

    /*
    * 循环嵌套
    * 没有关键字，范围前后需要使用分号来隔断逻辑
    * 以下代码相当于
    * for(i <- 1 to 10 by 2){
    *   for(j <- 2 to 10 by 2){
    *     println(s"i=${i},j=${j}")
    *   }
    * }
    * */
    for (i <- 1 to 10 by 2; j <- 2 to 10 by 2) {
      println(s"i=${i},j=${j}")
    }

    println()

    /*
    * 引入变量
    * for推导式一行中有多个表达式时，要加分号来隔断逻辑
    * */
    for (i <- 1 to 10 by 3; j = 5 - i) {
      println(s"i=${i},j=${j}")
    }

    println()

    /*
    * 在scala中有个不成文的约定
    * 当for推导式中仅包含单一表达式时使用圆括号
    * 当包含多个表达式时，一般一行一个表达式，并且用花括号代替圆括号
    * 上例代码也可以如下方法写作
    * */
    for {
      i <- 1 to 10 by 3
      j = 5 - i
    } {
      println(s"i=${i},j=${j}")
    }

    println()

    /*
    * 将遍历过程中处理的结果返回到一个新的Vector集合中，使用yield关键字
    * 在开发中不常使用
    * */
    val res = for (i <- 1 to 10 by 2) yield i
    println(res)

    println()

    /*
    * 如果想要倒序打印，可以使用reverse
    * */
    for (i <- 1 to 10 by 2 reverse) {
      print(i + "\t")
    }

    println()

    /*
    * 步长也可以是浮点数，不过需要让i为浮点类型
    * 如果是浮点类型的话，就不推荐使用to方法
    * 这样子会引起精度问题
    * */
    for (i <- 1.0 to 5.0 by 0.3) {
      println(i + "\t")
    }
  }
}
