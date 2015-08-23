package pattern_match.scala.Leo

/**
 * @author Leo
 */
import java.awt.Color
object Hello_Pattern_Match {
  def main(args:Array[String]){
    
    val data=1
    data match{
      case 1 => println("First")
      case 2 => println("Second")
      case _ => println("Not Known Number") 
    }
    
    val result = data match{
      case i if i == 1 =>"The First: "+i //i是常量，在声明i的时候，就将data赋值给i,之后值不可变
      case number if number==2 => "The second: "+number //number也是常量。=>右侧是函数体
      case _ => "Not Known Number"
    }
    println(result)
    
    "Spark !".foreach { c => println(
        c match{                      //通过获取c的值进行match
          case ' ' => "Space"
          case ch => "Char: "+ch
        }) }
  }
}