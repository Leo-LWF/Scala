package implicits.scala.Leo

/**
 * @author Leo
 */
import java.io.File
import scala.io.Source

object Context_Helper{
  implicit class FileEnhancer(file:File){  //声明隐式类，包含相应类型(File)
    def read = Source.fromFile(file.getPath).mkString
  }
  implicit class Op(x:Int){      //声明隐式类，包含相应类型(Int)
    def addX(second:Int) = x + second
  }
}

object Implicits_Class {
  def main(args:Array[String]){
    
    import Context_Helper._    //将隐式类导入作用域
    
    //编译时发现当前类(File)没有某个方法(read)，就找包含相应类型的隐式类，进行隐式类转换
    println(1.addX(2))
    println(new File("F:\\bainian.txt").read)
  }
}