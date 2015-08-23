package learn.scala.Leo

/**
 * @author Leo
 */
object MapOperation {
  def main(args:Array[String]){
    val ages=Map("Rocky"->27,"Spark"->5,"Leo"->25)
    
//    for((k,v)<-ages){
//      println("Keys is "+k+",value is "+ v)
//    }
    for((k,_)<-ages){ //place holder
      println("Key is "+k)
    }
  }
  
}