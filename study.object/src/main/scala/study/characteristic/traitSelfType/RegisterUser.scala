package study.characteristic.traitSelfType

/**
 * @package study.characteristic.traitSelfType
 * @createTime 2023/6/4 9:05
 * @author SeedList
 * @Description
 * RegisterUser需要使用User中的一些属性，使用UserDao中插入数据的方法
 * 但是不希望User和UserDao之间有继承关系
 * 所以在UserDao中写了个自身类型
 */
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao {
}
