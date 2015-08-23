package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

class Person
class Student extends Person

//协变"+":
class C[+T](val args:T)    //泛型中"+T"表示如果A是B的子类型，那么C[A]也是C[B]的子类型
class S[+T](arg:T) extends C[T](arg)

//逆变"-"
trait Friend[-T]{
  def makeFriend(somebody:T)
}

//Scala规定，协变类型只能作为方法的返回类型，而逆变类型只能作为方法的参数类型。
//参数为逆变，意味着：我能处理比声明类型更精确的类型，只要更精确的类型是他的声明的类型的子类
//返回值为协变，意味着：他能处理比我声明的类型更精确的类型，只要我的类型是他类型的子类。
object Variance {
  def makeFriendWithYou(s:Student,f:Friend[Student]){
    f.makeFriend(s)
  }
  def main(args:Array[String]){
    val value:C[Person] = new C[Student](new Student)
  }
}