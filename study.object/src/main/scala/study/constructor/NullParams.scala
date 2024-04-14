package study.constructor

/**
 * @package study.constructor
 * @createTime 2023/6/2 14:23
 * @author SeedList
 * @Description
 * 无参构造器
 * scala类中的主构造器的形参包括三种类型：未使用任何修饰、var、val
 * 未使用任何修饰符修饰，这个参数就是一个局部变量
 * var修饰参数，作为类的成员属性使用，可以修改
 * val修饰参数，作为类只读属性使用，不能修改
 */
class NullParams {
  var name: String = _
  var age: Int = _
}
