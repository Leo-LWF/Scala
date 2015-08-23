package OOP.scala.Leo

/**
 * @author Leo
 */
class ApplyTest{
  def apply()=println("I am into Spark so much!")  
  def haveATry{
    println("Have a try on apply!")
  }
}
object ApplyTest{ //ApplyTest的伴生对象
  def apply()={
    println("I am into Scala so much!")
    new ApplyTest
  }
}
object ApplyOperation {
  def main(args:Array[String]){
    val array=Array(1,2,3,4,5)//调用Array的Apply,不需要使用New
    val a=ApplyTest()    //直接调用object中的apply，不需要New
    a.haveATry
    a() 
    
//    val b=new ApplyTest    //用class生成对象
//    b.haveATry
//    b()        //调用class中的apply
  }
}