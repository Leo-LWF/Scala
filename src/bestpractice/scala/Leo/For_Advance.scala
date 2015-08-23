package bestpractice.scala.Leo

/**
 * @author Leo
 */
object For_Advance {
  
  def main(args:Array[String]):Unit = {
    for(i <- List(1,2,3,4,5)) {println(i)}
    
    for(index@"Flink" <- List("Hadoop","Spark","Flink"))//用@变量绑定
        {println(index)}
    
    for((language,"Hadoop") <- Set("Scala"->"Spark","Java"->"Hadoop"))
        {println(language)}
    
    for((k,v:Int) <- List(("Spark"->5),("Hadoop" -> "BigData")))
        { println(k) }
  }
}