package pattern_match.scala.Leo

/**
 * @author Leo
 */
object Option_Internal {
  
  def main(args:Array[String]){
    val scores=Map("Alice"-> 99,"Spark"-> 100)
    
    //get函数返回option类型，如果scores中有“Alice”返回Some,否则返回None
    scores.get("Alice") match{
      case Some(score) => println(score)
      case None => println("No score")
    }
  }
}