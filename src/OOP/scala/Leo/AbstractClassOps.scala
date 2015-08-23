package OOP.scala.Leo

/**
 * @author Leo
 */
class AbstractClassOps{
  var id:Int=_    //普通类的字段必需赋值(包括变量使用占位符)
}

abstract class SuperTeacher(val name:String){//必须加上abstract
  var id:Int      //抽象字段不赋值
  var age:Int
  def teach      //抽象类的抽象方法没有实现体
}

//实现抽象类
class TeacherForMaths(name:String)extends SuperTeacher(name){
  override var id =name.hashCode()  //重写抽象类的成员可以省去override
  override var age=29               //按惯例写上override
  override def teach{
    println("Teaching!!!")
  } 
}
object AbstractClassOps {
  def main(args:Array[String]){
    val teacher=new TeacherForMaths("Spark")
    teacher.teach
    
    println("teacher.id"+": "+teacher.id)
    println(teacher.name+": "+teacher.age)    
  }
}