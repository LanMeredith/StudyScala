/*
* scala中包的三大作用（和java一样）
* 区分相同名字的类
* 当类很多时，可以很好的管理类
* 控制访问范围
*
* 包的命名规则：
* 只能包含数字、字母、下划线、小圆点，不能以数字开头，不能使用关键字
*
* 在scala中有两种包的管理风格
* 一种和java的包管理风格相同，每个源文件一个包（包名和源文件所在路径不要求一致）
* 包名通过点进行分隔以表示包的层级关系
* 另一种风格则是通过嵌套的表示层级关系，如下
* */
package priv {

  //  外层的包想要访问内层包需要导包

  import priv.study.nestObject.inObject

  object outObject {
    val out: String = "out"

    def main(args: Array[String]): Unit = {
      println(inObject.in)
    }
  }

  /*
  * 报错只是idea不能很好的兼容这种表示方式，实际运行并不会报错
  * */
  package study {
    package nestObject {

      /**
       * @author SeedList
       * @package
       * @createTime 2023/6/1 8:08
       * @Description
       * 这样定义出来的对象inObject
       * 其所属包并非是文件夹中的src/main/scala
       * 而是嵌套定义出来的priv/study/nestObject
       */
      object inObject {
        val in: String = "in"

        def main(args: Array[String]): Unit = {
          //          内层包可以直接访问外层包，不用导包
          println(outObject.out)
        }
      }

    }

  }

}

/*
* 可以在同一文件中定义多个包，priv与aaa算是同级
* 这种情况下想要访问另一个包组，也需要导包
* */
package aaa {
  package bbb {

    import priv.study.nestObject.inObject

    object test {
      println(inObject.in)
    }

  }

}