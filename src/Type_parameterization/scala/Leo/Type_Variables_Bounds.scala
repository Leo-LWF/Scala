package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

//class Pair[T](val first:T,val second:T)

//类型变量具有上下界
//"T<:Comparable[T]"表示T是Comparable[T]的子类，而Comparable[T]有compareTo方法(Java)，所以T也有这个方法
class Pair[T<:Comparable[T]](val first:T,val second:T){        //指定类型变量T的上界为Comparable[T]
  def bigger = if(first.compareTo(second)>0)first else second
}

class Pair_Lower_Bound[T](val first:T,val second:T){
  
  //"R>:T"表示R是T的父类，R的下界为T，下面实现用父类型替换子类型
  def replaceFirst[R>:T](newFirst:R)=new Pair_Lower_Bound[R](newFirst,second)
}

object Type_Variables_Bounds {
  def main(args:Array[String]){
    val pair=new Pair("Spark","Hadoop")
    println(pair.bigger)
  }
}