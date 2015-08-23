package OOP.scala.Leo

/**
 * @author Leo
 */
class University{
  val id=University.newStudentNo  //可以访问伴生对象的私有成员
  private var number=0
  def aClass(number:Int){this.number+=number}
}

//上面有一个与此object同名的类，则此object称为类University的伴生对象
//伴生对象一般作为类的静态成员的封装区域
//Object对象类似Java中的静态类，里面所有的成员都是静态的
object University{
  private var studentNo=0
  private def newStudentNo={
    studentNo+=1
    studentNo        //方法的最后一行为返回值,省略return
  }
}
object ObjectOps {
  def main(args:Array[String]):Unit={
//    println(University.newStudentNo)
//    println(University.newStudentNo)
    
    val array=Array(1,2,3,4)
  }
}