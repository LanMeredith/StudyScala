package study.enumerationAndApp

/**
 * @package study.enumerationAndApp
 * @createTime 2023/6/4 9:41
 * @author SeedList
 * @Description
 * 枚举类
 * scala中的枚举需要继承Enumeration
 */
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
  val WEDNESDAY = Value(3, "Wednesday")
  val THURSDAY = Value(4, "Thursday")
  val FRIDAY = Value(5, "Friday")
  val SATURDAY = Value(6, "Saturday")
  val SUNDAY = Value(7, "Sunday")
}
