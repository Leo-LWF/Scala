package OOP.scala.Leo

/**
 * @author Leo
 */
//class OverrideOperation{
//  
//}
class Person1(val name:String,var age:Int){
  println("The primary constructor of Person")
  val school="BJU"
  def sleep="8 Hours"
  
  override def toString="I am a Person1!"
}
//子类构建之前需先构建父类
class Worker(name:String,age:Int,val salary:Long)extends Person1(name,age){
  println("This is the subClass of Person,Primary construor of Worker")
  
  override val school="Spark"    //重写字段和方法都要加override
  
  override def toString="I am a Worker!"+super.sleep
}

object OverrideOperation {
  def main(args:Array[String]){
    val w=new Worker("Spark",5,100000)
    println("School : "+w.school)
    println("Salary : "+w.salary)
    println(w.toString())
  }  
}