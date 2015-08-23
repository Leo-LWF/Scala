package pattern_match.scala.Leo

/**
 * @author Leo
 */

abstract class Person

//在声明case class 的时候，语言内部有几件事会自动进行：
//1.每个成员默认为val类型，
//2.每个case class都有伴生对象，里面有apply方法。伴生对象会帮助构建出case class的具体对象。
//在模式匹配的时候，一定要在case class的具体对象中提取出内容，提取方法是伴生对象中的unapply方法。
//可以把unapply操作看作apply的反操作：apply是传进值构建对象，unapply是从既建对象中提取内容。
case class Student(age:Int)extends Person
case class Worker(age:Int,salary:Double)extends Person
case object Shared extends Person

object case_class_object {
  
  def main(args:Array[String]){
    def caseOps(person:Person)=person match{
      case Student(age) => println("I am "+age+" years old!")
      case Worker(_,salary) => println("Wow,I got "+salary)
      case Shared => println("No property")
    }
    caseOps(Student(19))
    caseOps(Shared)
    
  val worker1=Worker(29,10000.1)
  val worker2=worker1.copy(salary=19.95)
  val worker3=worker1.copy(age=30)
  
  caseOps(worker1)
  caseOps(worker2)
  caseOps(worker3)
  }
}