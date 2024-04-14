/**
 * @package
 * @createTime 2023/6/10 20:25
 * @author SeedList
 * @Description
 * 泛型
 * 协变、逆变和不变
 * 泛型上下限
 */
object StudyGenerics {
  def main(args: Array[String]): Unit = {
    /*
    * 协变、逆变和不变
    * 不变：class MyCollection[T] {}
    * Child和Parent有父子关系，而MyCollection[Parent]和MyCollection[Child]之间没有父子关系
    *
    * 协变：class MyCollection[+T] {}
    * 这表示因为Child和Parent有父子关系
    * 所以MyCollection[Parent]是MyCollection[Child]父类
    * 协变的父子关系遵从列表泛型之间的父子关系
    *
    * 逆变：class MyCollection[-T] {}
    * 这表示因为Child和Parent有父子关系
    * 所以MyCollection[Child]是MyCollection[Parent]父类
    * 逆变的父子关系是列表泛型之间的父子关系的逆序
    * */
    val child: Parent = new Child
    //    val childList:MyCollection[Parent] = new MyCollection[Child]

    /*
    * 泛型上下限
    * 上限：class MyCollection[T <: Parent] {}
    * 下限：class MyCollection[T >: Parent] {}
    * 泛型上下限的作用是对传入的泛型进行限定
    *
    * 以class MyCollection2[T <: Parent] {}为例，限定泛型类型不能大于Parent
    * 即泛型类型不能是Parent的父类及更高类型，可以是Parent
    * new MyCollection2[Grant]因为scala无编译时错误，这样写也不会提示错误，但运行时会报错
    * */
    //    val childList2:MyCollection2[Grant] = new MyCollection2[Grant]
    val childList2: MyCollection2[Parent] = new MyCollection2[Parent]
  }
}

class Parent extends Grant {}

class Grant {}

class Child extends Parent {}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/10 20:27
 * @Description
 * 定义带泛型的集合类型
 */
class MyCollection[T] {}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/10 20:36
 * @Description
 * 确定泛型上限的集合类型
 */
class MyCollection2[T <: Parent] {}