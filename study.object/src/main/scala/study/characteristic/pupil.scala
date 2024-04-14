package study.characteristic

/**
 * @package study.characteristic
 * @createTime 2023/6/4 7:21
 * @author SeedList
 * @Description
 * 类和特质的关系：使用继承的关系
 * 当一个类去继承特质时，第一个连接词是extends，后面是with
 * 如果一个类同时继承特质与父类，那么父类应该写在extends后面
 *
 * 使用extends混入特质：
 * className extends superName with traitName1 with traitName2...
 * className extends traitName1 with traitName2 ...
 *
 * 动态混入：可以灵活的扩展类的功能
 * 动态混入可以在创建对象时混入该特质，而无需使类混入该特质
 * 如果混入的trait中有未实现的方法，则需要实现
 *
 * 特质叠加，由于一个类可以混入多个特质，且特质中可以有具体的属性和方法
 * 若混入的特质中具有相同的方法（方法名，参数列表，返回值均相同）
 * 那么必然会出现继承冲突的情况，冲突分为以下两种：
 * 第一种：一个类混入的两个特质中具有相同的具体方法，且两个特质之间没有任何关系，这种冲突需要在类中重写冲突方法
 * 第二种：一个类混入的两个特质中具有相同的具体方法，且两个特质继承自同一个特质，及所谓的“钻石问题”
 * 解决这种冲突，scala采用了特质叠加策略
 * 所谓特质叠加，就是将混入的多个特质中的冲突方法叠加起来
 */
object pupil extends Student("YanMingHe", 23) with Young with Knowledge {
  var grade: Int = 0
  override val isLive: String = "Yes"
  /*
  * 虽然父类Student中race属性来自于特质Young
  * 但Student对race属性做了重写（类重写特质中的抽象属性不用override关键字修饰）
  * 因而到了Pupil中，race被判断为有两个来源，其一为父类Student，其二为特质Young
  * 为了避免冲突，我们需要在本类中重写race
  * 因为在父类中Student的race就是var关键字修饰的，是可变属性
  * 故而我们可以不用声明race的关键字、类型，也不需要override关键字，直接进行重写即可
  * */
  race = "yellow"

  override def condition(): Unit = println(s"student $name is $race ，grade = $grade, condition = $isLive")

  override def increase(): Unit = println("我学到了知识")

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/4 7:53
   * @Name play
   * @throw
   * @Description
   * 在继承的Student父类、Young特质和Knowledge特质中都有paly()
   * 当我们重写该方法后，在方法体中调用super.play()
   * 在实际调用时，是所有继承中的最后一个
   * 本对象中继承的最后一个是Knowledge，所以super调用的Knowledge特质中的play()
   */
  override def play(): Unit = super.play()

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/4 8:12
   * @Name diamond
   * @throw
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
   *
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
  override def diamond(): Unit = super.diamond()

  /**
   * @param
   * @return void
   * @author SeedList
   * @createTime 2023/6/4 8:52
   * @Name newDiamond
   * @throw
   * @Description
   * 使用super[特质名]的方式可以指定调用super（相当于对象名.方法）
   */
  def newDiamond(): Unit = {
    super[Young].diamond()
  }
}
