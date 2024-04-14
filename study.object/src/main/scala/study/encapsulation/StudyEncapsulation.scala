package study.encapsulation

/**
 * @package
 * @createTime 2023/6/1 8:58
 * @author SeedList
 * @Description
 * 封装
 * 封装就是把抽象出的数据和对数据的操作封装在一起
 * 数据被保护在内部
 * 程序的其他部分只有通过被授权的操作（成员方法）
 * 才能对数据进行操作
 *
 * java中封装操作如下：
 * 将属性进行私有化
 * 提供公共的set、get方法
 *
 * scala中的public，底层实际为private
 * 并通过get方法(obj.field())和set方法(obj.field_=(value))对其进行操作
 * 所以scala并不推荐将属性设置为private，再为其设置public的get与set的做法
 * 但由于很多java框架都利用反射调用getXXX和setXXX方法
 * 有时候为了和这些框架兼容，也会为scala的属性设置getXXX和setXXX方法（通过@BeanProperty注解实现）
 *
 * 访问权限：
 * scala中属性和方法的默认访问权限为public，但是不能显式定义为public，因为scala中没有public关键字
 * private为私有权限，只在类的内部和伴生对象中可用
 * protected为受保护权限，scala中受保护权限比java中更严格，同类、子类可以访问，同包无法访问
 * private[包名]  增加包访问权限，包名下的其他类也可以访问
 */
object StudyEncapsulation {
  def main(args: Array[String]): Unit = {
    //    创建对象
    val person: Person = new Person
    /*
    * 无法访问到
    * person.idCord
    * person.name
    * 因为这两个属性在Person中被定义访问权限分别为private和protected
    * */
    println(person.age)
    println(person.sex)
    person.printInfo()

    val worker: Worker = new Worker
    worker.printInfo()
  }
}

/**
 * @author SeedList
 * @package
 * @createTime 2023/6/1 9:19
 * @Description
 * 继承了Person后
 * 在Person类中定义的私有属性idCord是无法访问到的
 */
class Worker extends Person {
  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/1 9:25
   * @Name printInfo
   * @throw
   * @Description
   * 子类重写父类方法需要使用override关键字进行声明
   */
  override def printInfo() = {
    name = "YMH"
    sex = "男"
    age = 23
    println(s"Person: $name \n $sex \n $age")
  }
}
