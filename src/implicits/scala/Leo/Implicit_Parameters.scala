package implicits.scala.Leo

/**
 * @author Leo
 */

object Context_Implicits{
  implicit val default:String = "Java"  //隐式值
}

object Param{
  def print(content:String)(implicit language:String){//柯里化方法，第二个参数是隐式参数
    println(content+":"+language)
  }
}

object Implicit_Parameters {
  
  def main(args:Array[String]){
    Param.print("Spark")("Scala")
    
    import Context_Implicits._ //导入
    
    //柯里化方法只传进了一个参数，需要找第二个参数的默认值，捕获导入的隐式值传进隐式参数
    Param.print("Hadoop")      
  }
}