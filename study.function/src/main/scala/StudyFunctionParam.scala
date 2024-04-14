/**
 * @package
 * @createTime 2023/5/30 7:14
 * @author SeedList
 * @Description
 */
object StudyFunctionParam {
  def main(args: Array[String]): Unit = {
    /*
    * 可变参数
    * 在java中可变参数表示为String... str
    * 在scala中可变参数表示方法与Python类似
    * 使用一个星号表示可变参数，接收到的参数将存入到WrappedArray中
    * */
    def test(str: String*): Unit = {
      println(str)
    }

    test("颜铭鹤", "江西农业大学", "南昌商学院")

    //    可变参数应放置参数列表末尾
    def test2(age: Int, str: String*): Unit = {
      println(age, str)
    }

    test2(22, "江西农业大学", "南昌商学院")

    /*
    * 同样在默认情况下需要放至末尾的还有有默认值的参数
    * 因为scala中参数的传递是从左到右
    * 如果前后都是同类型参数，而前边的带有默认值
    * 那么在调用该函数时，只传入一个参数，会导致传入参数默认识别为第一个参数，代替掉默认值
    * */
    def test3(age: Int, name: String = "颜铭鹤"): Unit = {
      println(name, age)
    }

    test3(23)

    //    带名参数，即指定参数，这种情况下可以不遵守从左到右的默认规则，一个指定便要求全部指定
    test3(name = "YMH", age = 23)
  }
}
