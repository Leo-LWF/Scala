package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

class P[+T](val first:T,val second:T){
//  def replaceFirst(newFirst:T) = new P[T](newFirst,second)  //逆变点上出现了协变类型的T
  def replaceFirst[R>:T](newFirst:R)=new P[R](newFirst,second)
}
object Variance_Position {
  def main(args:Array[String]){
    
  }
}