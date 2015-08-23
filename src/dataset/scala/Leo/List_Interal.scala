package dataset.scala.Leo

/**
 * @author Leo
 */
object List_Interal {
  
  def main(args:Array[String]){
    
    val list = List(1,2,3,4,5)    //调用apply方法完成实例化:List[Int]
    val listAny:List[Any] = list  //将List[Int]对象赋值给List[Any]对象(面向结构编程:将子对象复制给父对象)
    println(list.isEmpty)  //调用List的方法
    println(list.head)     //调用List的方法,而非成员
    println(list.tail)     //调用List的方法
    println(list.length)
    println(list.drop(2))
    list.map(_*2).foreach(print)
  }
}