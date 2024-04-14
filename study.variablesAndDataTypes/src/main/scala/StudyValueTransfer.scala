/**
 * @package
 * @createTime 2023/5/29 16:35
 * @author SeedList
 * @Description 类型转换
 */
object StudyValueTransfer {
  def main(args: Array[String]): Unit = {
    //    没有直接声明n的类型，但是表达式中包含Int类型与Double类型，在混合运算时会自动转换成精度大的数值类型
    var n = 1 + 2.0
    println(n)
    var x: Byte = 1
    var y: Long = 2L
    var z: Int = (x + y).toInt
    println(z)

    //    把精度大的数据类型赋值给精度小的数据类型时，需要.toXXX进行强转，强转符号只针对最近的操作数生效，可以用小括号提升优先级
    var m: Int = n.toInt
    println(m)

    //    虽然编译器不会报错，但实际上Byte、Char、Short三种数据类型之间是不能相互转换的
    var c: Char = 'c'
    //    var b:Byte = c
    //    println(b)
    var i: Int = c
    println(i)

    //    虽然Byte、Char、Short不能相互转换，但可以进行计算，计算前先转成Int
    var b: Byte = 12
    var s: Short = 24
    println(c + b + s)

    //    基本类型转String
    var str: String = z + ""
    println("使用+\"\"即可将基本类型转换成String，如z + \"\"后成了字符串str：" + str)

    //    String转基本数据类型
    var zz: Long = str.toLong
    println(zz)

    //    要求先用toFloat强转，再用toInt强转
    var f: Int = "12.3".toFloat.toInt
    println(f)

    /*
    * 大数转小数发生了数据溢出
    * Byte最大值127，最小值-128
    * n1为Int类型，值为130，二进制为0000000010000010，因为是正数所以原码反码补码一致
    * 将其强转成Byte类型时，由于机器中使用补码，将最后七位与符号位传给Byte类型的B1
    * 得到对应补码10000010，转成原码为11111101，即为-126
    * */
    var n1: Int = 130
    var b1: Byte = n1.toByte
    print(b1)
  }
}
