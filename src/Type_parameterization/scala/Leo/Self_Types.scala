package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

class Self{
  self =>                          //在类Self内部将this的别名命名为self(不能是this)
    val tmp = "Scala"
    def foo = self.tmp + this.tmp  //通过self和this都可以访问内部成员
}
trait S1
class S2 { this:S1 =>}        //自身类型用this进行限制:在S2实例化时，必须混入指定类型S1
class S3 extends S2 with S1   //S2的子类也要满足以上条件

trait T{this:S1 =>}            //实例化T的时候必需混入S1
object S4 extends T with S1    //满足要求

object Self_Types {
  
  def main(args:Array[String]){
    class Outer{ outer =>    //在外部类Outer内部将Outer.this别名命名为outer
      val v1 = "Spark"
      class Inner{
        println(outer.v1)    //在内部类Inner中可以通过outer来引用外部类的属性或方法
      }      
    }
    val c = new S2 with S1   //实例化S2的时候混入了S1
  }
}