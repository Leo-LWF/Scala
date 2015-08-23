package dataset.scala.Leo

/**
 * @author Leo
 */
object ListObjectOps {
  
  def main(args:Array[String]){
    println(List.apply(1,2,3))  //apply对传进来的值进行toList操作
//    println(List.make(3,5))     //创建一个元素为3个5的List
    println(List.range(1,5))      //range中左闭右开的区间
    println(List.range(9,1,-3))    //[9,3)步长为-3
    
    val zipped = "abcde".toList zip List(1,2,3,4,5)//zip:把两个List合并成一个内部元素是pair的List
    println(zipped)
    println(zipped.unzip)  //unzip:将一个内部元素是pair的List分成两个List(拆开每个pair)
    
    println(List(List('a','b'),List('c'),List('d','e')).flatten)//flatten:将List中所有元素构成一个List
    println(List.concat(List(),List('b'),List('c')))    //将集合中的所有元素构成一个List
    
//    println(List.map2(List(10,20),List(10,10))(_*_))  //map2将两个集合中相同位置的元素做函数制定操作
    
  }
}