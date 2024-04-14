package introduce

/**
 * @package
 * @createTime 2023/6/4 13:02
 * @author SeedList
 * @Description
 * 不可变集合继承图
 * 带星号的为特质
 */
object immutableExtendsIntroduce {
  /*
  * *Traversable* => *Iterable* => *Set*
  * => HashSet
  * => *SortedSet* => TreeSet
  * => BitSet
  * => ListSet
  * */

  /*
  * *Traversable* => *Iterable* => *Map*
  * => HashMap
  * => *SortedMap* => TreeMap
  * => ListMap
  * */

  /*
  * *Traversable* => *Iterable* => *Seq* => *IndexedSeq*
  * => vector
  * => NumericRange
  * -> Array（Array和String不是直接的继承扩展关系，需要经过隐式转换）
  * -> String
  * => Range
  * */

  /*
  * *Traversable* => *Iterable* => *Seq* => *LinearSeq*
  * => List
  * => Stream
  * => Queue
  * => Stack
  * */
}
