package basics.scala.Leo

/**
 * @author Leo
 */
object FilesOps {
  def main(args:Array[String]){
    
//    val file=Source.fromFile("F:\\bainian.txt")
//    for(line<-file.getLines){
//      println(line)
//    }
//    file.close
    
//    val webfile=Source.fromURL("http://spark.apache.org/")
//    webfile.foreach(print)
//    webfile.close
    
//    val writer = new PrintWriter(new File("F:\\bainian.txt"))
//    for(i<- 1 to 10)writer.println(i)
//    writer.close()
    
    print("Please enter your input: ")
    val line = Console.readLine
    println("Thanks,you just typed: "+line)
  }
}