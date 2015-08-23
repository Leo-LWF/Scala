package learn.scala.Leo

/**
 * @author Leo
 */
object ScalaBasics {
  
//  def looper(x:Long,y:Long):Long = {
//    var a=x
//    var b=y
//    while(a != 0){
//      val temp=a
//      a=b % a
//      b=temp
//    }
//    b
//  }
//  
//  def doWhile(){
//    var line=""
//    do{
//      line=readLine()
//      println("Read: "+ line)
//    }while(line!="")
//  }

  def main(args:Array[String]){
//  doWhile 
    
//    println(looper(100,298))
    
//    var file = "scala.txt"
//    if(!args.isEmpty) file=args(0)
//    val file=if(!args.isEmpty) args(0) else "Scala.xml"
//    println(file)
//    for(i<- 1 to 10)
//      println("Number is: "+i)
//    val files=(new java.io.File(".")).listFiles()
//    for(file<-files){
//      println(file)
//    }
    val n=99
    try{
      val half=if(n%2 ==0)n/2 else throw new RuntimeException("n must be event")
    }catch{
      case e:Exception=>println("The exception is :"+e.getMessage())
    }finally{
//      close(file)
    }
  }
}