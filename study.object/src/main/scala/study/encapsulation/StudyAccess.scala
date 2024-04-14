package study.encapsulation

/**
 * @package
 * @createTime 2023/6/1 9:09
 * @author SeedList
 * @Description
 * 访问权限：
 * scala中属性和方法的默认访问权限为public，但是不能显式定义为public，因为scala中没有public关键字
 * private为私有权限，只在类的内部和伴生对象中可用
 * protected为受保护权限，scala中受保护权限比java中更严格，同类、子类可以访问，同包无法访问
 * private[包名]  增加包访问权限，包名下的其他类也可以访问
 */
object StudyAccess {

}

class Person {
  private var idCord: String = "362429202306244316"
  protected var name: String = "Yan abel"
  var sex: String = "female"
  private[encapsulation] var age: Int = 23

  def printInfo() = {
    println(s"Person: $idCord \n $name \n $sex \n $age")
  }
}