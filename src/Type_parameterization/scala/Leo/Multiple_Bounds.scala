package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

class M_A[T]
class M_B[T]

object Multiple_Bounds {
  def main(args:Array[String]){
    implicit val a = new M_A[Int]
    implicit val b = new M_B[Int]
    def foo[T:M_A:M_B](i:T)=println("OK")  //T要满足同时是M_A和M_B类型的
    foo(2)    //传进Int时，需要有M_A[Int]和M_B[Int]类型，上面的隐式转换已实现
  }
}