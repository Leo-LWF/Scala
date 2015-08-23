package implicits.scala.Leo

/**
 * @author Leo
 */
/**
 * 隐式转换操作规则：
 * 1.成为隐式转换，(类、对象、函数、参数等)必需标记为implicit关键字，编译器根据关键字进行编译
 * 2.作用域规则，隐式转换在整个作用域链中必须是单一的标识符，与转换源或目标关联在一起
 * 3.隐式转换不能有歧义等
 */
import scala.io.Source
import java.io.File

class RicherFile(val file:File){
  def read = Source.fromFile(file.getPath()).mkString
}

class File_Implicits(path:String)extends File(path)   //File类型的类
object File_Implicits{                                //类的伴生对象
  implicit def file2RicherFile(file:File) = new RicherFile(file)
}

object Implicit_Internals {
  def main(args:Array[String]){
    
    //编译器发现File_Implicits本身没有read方法，上下文也没有隐式的导入
    //于是就找File_Implicits的伴生对象是否有隐式转换(关键字implicit)
    //当有关键字implicit的时候，编译器就尝试进行类型匹配(File)
    //匹配成功后，按定义的隐式转换方法进行类型转换，之后调用所需方法
    println(new File_Implicits("F:\\bainian.txt").read)
  }
}