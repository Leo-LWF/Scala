package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

//Context Bounds：上下文界定(直接转换)
//T:Ordering表示存在一个隐式的值——Ordering[T]
//first和second是T类型，则也是Ordering[T]类型
//Ordering[T]继承自Comparator[T]类型，后者具有compare方法
class Pair_Ordering[T:Ordering](val first:T,val second:T){
  def bigger(implicit ordered:Ordering[T])={
    if (ordered.compare(first, second)>0)first else second
  }
}

object Context_Bounds {
  def main(args:Array[String]){
    val pair = new Pair_Ordering("Spark","Hadoop")
    println(pair.bigger)
    
    val pairInt = new Pair_Ordering(3,5)
    println(pairInt.bigger)
  }
}