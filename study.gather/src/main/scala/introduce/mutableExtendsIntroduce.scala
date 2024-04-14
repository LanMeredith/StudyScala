package introduce

/**
 * @package introduce
 * @createTime 2023/6/4 13:16
 * @author SeedList
 * @Description
 * 可变集合继承图
 * 带星号为特质
 */
class mutableExtendsIntroduce {
  /*
  * *Traversable* => *Iterable* => *Set*
  * => HashSet
  * => BitSet
  * => LinkedHashSet
  * => ImmutableSetAdaptor
  * => *ObservableSet*
  * => *SynchronizedSet*
  * */

  /*
  * *Traversable* => *Iterable* => *Map*
  * => HashMap
  * => LinkedHashMap
  * => WeakHashMap
  * => OpenHashMap
  * => ListMap
  * => ImmutableMapAdaptor
  * => *ObservableMap*
  * => *SynchronizedMap*
  * => *MultiMap*
  * */

  /*
  * *Traversable* => *Iterable* => *Seq*
  * => Stack => SynchronizedStack
  * => ArrayStack
  * => PriorityQueue => SynchronizedPriorityQueue
  * */

  /*
  * *Traversable* => *Iterable* => *Seq* => *LinearSeq*
  * => MutableList => *Queue* => SynchronizedQueue
  * => LinkedList
  * => DoubleLinkedList
  * */

  /*
  * *Traversable* => *Iterable* => *Seq* => *IndexedSeq*
  * => ArraySeq
  * => StringBuilder
  * */

  /*
  * *Traversable* => *Iterable* => *Seq* => *Buffer*
  * => *ObservableBuffer*
  * => *SynchronizedBuffer*
  * => ListBuffer
  * */

  /*
  * *Traversable* => *Iterable* => *Seq*
  * => IndexedSeq And Buffer => ArrayBuffer
  * */
}
