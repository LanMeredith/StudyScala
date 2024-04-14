package study.arr

import scala.collection.mutable.ArrayBuffer

/**
 * @package study.arr
 * @createTime 2023/6/4 14:58
 * @author SeedList
 * @Description
 * 可变数组
 */
object MutableArray {
  def main(args: Array[String]): Unit = {
    //    创建可变数组
    val arr1 = new ArrayBuffer[Int]()

    //    直接调用ArrayBuffer的伴生对象的apply方法，并且赋初始值
    val arr2 = ArrayBuffer(1, 2, 3, 4)

    /*
    * ArrayBuffer可以直接打印输出，也可以调用mkString方法打印输出
    * ArrayBuffer虽然是引用类型
    * 但是直接打印输出时默认调用的toString方法在底层调用的是IterableLike的toString方法
    * */
    println(arr2)
    println(arr2.mkString(","))

    //    访问元素
    println(arr2(3))

    println()

    /*
    * 向可变数组添加元素，因为创建时没有指定数组长度
    * 所以在默认情况下数组中是没有元素的，不能直接指定数组下标进行添加
    * 虽然可变数组中也有:+方法，但这个方法主要是给不可变数组用的
    * 即便我们想要调用，也需要创建一个新的数组来接收其返回值
    * */
    val arr3 = arr1 :+ 12
    println(arr3)
    println("arr1 == arr3 : " + (arr1 == arr3))

    /*
    * 对于可变数组来说，可以使用+=方法来添加元素
    * 当我们用一个新的数组对象来接收时，可以验证，两个数组对象的引用地址值是完全相同的
    * */
    val arr4 = arr1 += 23
    println(arr1)
    println("arr1 == arr4 : " + (arr1 == arr4))

    /*
    * 只有以冒号结尾的方法，在调用时省略.后将冒号写在右边
    * 这一点对于可变数组的+=方法来说也一样
    * 想要将元素追加在数组前面，需要使用+=:方法，对象在右边
    * */
    arr1.+=:(789)
    12 +=: arr1
    println(arr1)

    //    在可变数组末尾添加
    arr1.append(231)
    //    在可变数组前添加
    arr1.prepend(1231, 231231)
    //    第一个参数n是指数组索引位置，其余参数是要添加的元素，insert可以在数组下标为n的位置插入新元素
    arr1.insert(2, 324, 123)
    //    insertAll方法可以将另一个数组插入
    arr1.insertAll(0, arr2)
    println(arr1)

    //    删除数组下标为0的元素
    arr1.remove(0)
    //    从数组下标为3的元素开始向后删除五个数
    arr1.remove(3, 5)
    //    删除数组中为231的元素（231是元素，不是数组下标）yu
    arr1 -= 231
    println(arr1)
  }
}
