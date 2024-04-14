package study.PackageObject

//通配符导入，和java.util.*一个意思，该包下全部导入

import java.util._
//给类起别名
import java.util.{ArrayList => JL}
//导入相同包的多个类
import java.util.{HashMap, ArrayList}
//导入java.util下的所有类，除了HashSet
import java.util.{HashSet => _, _}

/**
 * @package study.PackageObject
 * @createTime 2023/6/1 8:14
 * @author SeedList
 * @Description
 * 在包对象中定义的参数、方法
 * 作为在对应包下的class与object的共享对象
 * 可以直接访问
 */
object Test {
  def main(args: Array[String]): Unit = {
    commonMethod()
    println(commonValue)
    //    导入包的绝对路径
    new _root_.java.util.HashMap
  }
}
