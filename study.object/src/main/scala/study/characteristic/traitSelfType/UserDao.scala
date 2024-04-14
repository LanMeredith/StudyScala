package study.characteristic.traitSelfType

/**
 * @package study.characteristic.traitSelfType
 * @createTime 2023/6/4 9:00
 * @author SeedList
 * @Description
 */
trait UserDao {
  /*
  * 特质的自身类型
  * 使用  别名:类名 =>  的方式
  * 此处_充当别名
  *
  * UserDao要使用User类中的一些属性
  * 但是不希望他们之间有继承关系
  * 这时可以指定一个自身类型，就相当于外部插入了一个User对象
  * 相当于实现了依赖注入
  * */
  _: User =>

  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}
