package pattern_match.scala.Leo

/**
 * @author Leo
 */
object Extractor {
  
  def main(args:Array[String]){
    
//    def match_array(arr:Any)=arr match{
//      case Array(0) => println("Array: "+"0")
//      case Array(x,y) => println("Array: "+x+" "+y)
//      case Array(0,_*) => println("Array: "+"0...")
//      case _ => println("Something else")
//    }
//    match_array(Array(0))
//    match_array(Array(0,1))
//    match_array(Array(0,1,2,3,4,5))
    
    val pattern="""([0-9]+) ([a-z]+)""".r  //0-9数字，小写字母
    "20150723 spark" match {
      case pattern(num, item) => println(num+" : "+item)
      case _=>println("nothing")
    }
  }
}