package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/4 8:07
 * @author SeedList
 * @Description
 * 特质叠加，由于一个类可以混入多个特质，且特质中可以有具体的属性和方法
 * 若混入的特质中具有相同的方法（方法名，参数列表，返回值均相同）
 * 那么必然会出现继承冲突的情况，冲突分为以下两种：
 * 第一种：一个类混入的两个特质中具有相同的具体方法，且两个特质之间没有任何关系，这种冲突需要在类中重写冲突方法
 * 第二种：一个类混入的两个特质中具有相同的具体方法，且两个特质继承自同一个特质，及所谓的“钻石问题”
 * 解决这种冲突，scala采用了特质叠加策略
 * 所谓特质叠加，就是将混入的多个特质中的冲突方法叠加起来
 *
 * 在Origin特质中定义方法diamond
 * 在Knowledge和Young特质中重写该方法，并在方法体中调用super
 * 最后在pupil对象中同时继承Knowledge和Young特质，并在重写的diamond方法中调用super
 * 经过测试发现
 * 最先输出Origin特质中的diamond()
 * 其次是Young特质中的diamond()
 * 最后才是Knowledge特质中的diamond()
 * 即按照pupil中继承特质的顺序调用diamond()（虽然没有直接继承Origin，但作为两个特质的父类，Origin是最先被输出的）
 *
 * 叠加顺序
 * extends Student with Young with Knowledge
 * 第一个特质的继承关系Young -> Origin
 * 第二个特质的继承关系Knowledge -> Origin
 * 发现两个特质继承自同一个父类，进行叠加，默认按先后顺序，将第二个特质叠加在第一个特质后
 * Knowledge -> Young -> Origin
 * pupil -> Knowledge -> Young -> Origin
 *
 * 使用super[特质名]的方式可以指定调用super（相当于对象名.方法）
 */
trait Origin {
  def diamond(): Unit = println("I'm origin")
}
