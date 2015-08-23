package implicits.scala.Leo

/**
 * @author Leo
 */

class Pair_Implicits[T:Ordering](val first:T,val second:T){  //上下文界定，将T直接转换成Ordering[T]
  def bigger(implicit ordered:Ordering[T]) =        //隐式参数
    if(ordered.compare(first, second)>0)first else second
}

class Pair_Implicitly[T:Ordering](val first:T,val second:T){
  
  //implicitly方法获取具体实例参数类型变成Ordering[T]
  def bigger =  if(implicitly[Ordering[T]].compare(first,second)>0)
                     first else second
}

class Pair_Implicitly_Ordered[T:Ordering](val first:T,val second:T){
  def bigger = {
    import Ordered._
    if(first > second)first else second  //发生隐式转换，将Ordering[T]转换成Ordered[T] 
  }
}
object Context_Bounds_Internals {
  def main(args:Array[String]){
    println(new Pair_Implicits(7,9).bigger)    //传进Int参数的时候，转换成Ordering[Int]
    println(new Pair_Implicitly(7,9).bigger)
    println(new Pair_Implicitly_Ordered(7,9).bigger)
  }

}