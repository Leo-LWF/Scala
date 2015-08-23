package implicits.scala.Leo

/**
 * @author Leo
 */
import scala.io.Source
import java.io.File

//当我们需要一个类中的某个特殊方法，但是这个类并没有提供这个方法，此时就需要隐式转换，转换成提供了所需方法的类
//隐式转换的前提是需要一个已有类的增强类，比如File类(无read方法)的增强类为RichFile，它提供所需方法read
//然后必需写明implicit隐式转换函数，实现已有类型转换为增强类型
//使用的时候通过import的方式把隐式转换函数导入
class RichFile(val file:File){
  def read = Source.fromFile(file.getPath()).mkString
}
object Context{
  implicit def file2RichFile(file:File) = new RichFile(file)//隐式转换，File->RichFile
}

object Hello_Implicit_Conversions {
  
  def main(args:Array[String]){
    import Context.file2RichFile
    println(new File("F:\\bainian.txt").read)
  }
}