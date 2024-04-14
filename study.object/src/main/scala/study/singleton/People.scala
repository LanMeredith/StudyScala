package study.singleton

/**
 * @package study.singleton
 * @createTime 2023/6/3 8:25
 * @author SeedList
 * @Description
 * 懒汉式单例设计模式
 */
object People {
  private var people: People = _

  /**
   * @param
   * @return study.singleton.People
   * @author SeedList
   * @createTime 2023/6/3 8:28
   * @Name getInstance
   * @throw
   * @Description
   * people参数为空说明还没有创建对象，那么为其创建一个对象
   * 若不为空，说明已经创建除了一个对象，直接返回即可
   */
  def getInstance(): People = {
    if (people == null) {
      people = new People("YMH", 23)
    }
    people

  }
}

class People private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"My name is $name , age is $age")
  }
}