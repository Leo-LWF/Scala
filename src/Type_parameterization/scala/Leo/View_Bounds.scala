package Type_parameterization.scala.Leo

/**
 * @author Leo
 */
//class Pair_NotPerfect[T <: Comparable[T]](val first:T,val second:T){
//  def bigger = if(first.compareTo(second)>0)first else second
//}

//"<%"叫做视图界定，在使用类型变量界定无法满足的时候使用视图界定(隐式转换)
//T <% Comparable[T]:如果Comparable[T]不是T的父类的话，把T隐式转换为Comparable[T]类型
class Pair_NotPerfect[T <% Comparable[T]](val first:T,val second:T){
  def bigger = if(first.compareTo(second)>0)first else second
}
//Ordered[T]在Comparable[T]的基础上提供了关系操作符，前者继承自后者
class Pair_Better[T <% Ordered[T]](val first:T,val second:T){
  def bigger = if(first>second)first else second
}

object View_Bounds {
  def main(args:Array[String]){
    
    var pair = new Pair_NotPerfect("Spark","Hadoop")
    println(pair.bigger)
    val pairInt = new Pair_NotPerfect(3,5)  //此处隐式转换：Int -> RichInt。而Comparable[Int]是RichInt的上界
    println(pairInt.bigger)
    
    val pair_Better_String = new Pair_Better("Java","Scala")
    println(pair_Better_String.bigger)
    
    val pair_Better_Int = new Pair_Better(20,25)
    println(pair_Better_Int.bigger)
  }
}