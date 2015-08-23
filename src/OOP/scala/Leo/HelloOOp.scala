package OOP.scala.Leo

/**
 * @author Leo
 */
class Person{
  private var age=0
  def increment(){age+=1}
  def current =age
  
}
class Student{
  private[this] var privateAge=0    //加了this，限定成员只能归当前对象所有，不能被当前类的方法使用
  val name="Leo"
  def age=privateAge
  
//  def isYounger(other:Student)=privateAge<other.privateAge
}
object HelloOOp {
  def main(args:Array[String]):Unit={
  val person=new Person()
  person.increment()
  println(person.current)

  val student=new Student
//  student.age = 10
//  println(student.age)  
  println(student.name)
  }
}  