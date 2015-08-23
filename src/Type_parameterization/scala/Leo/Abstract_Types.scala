package Type_parameterization.scala.Leo

/**
 * @author Leo
 */
import scala.io.BufferedSource
import scala.io.Source

trait Reader{
  type In <: java.io.Serializable //定义一个类型，上限是Serializable类型
  type Contents
  def read(in:In):Contents    //定义一个方法，输入参数类型是抽象类型In，返回类型是抽象类型Content
}
class FileReader extends Reader {
  type In = String                //对抽象类型In赋值
  type Contents = BufferedSource  //对抽象类型Content赋值
  override def read(name:In) = Source.fromFile(name)  //实现方法，fromFile方法返回BufferedSource
}

object Abstract_Types {
  
  def main(args:Array[String]){
    val fileReader = new FileReader
    val content = fileReader.read("F:\\bainian.txt")
    for(line <- content.getLines){
      println(line)
    }
  }
}