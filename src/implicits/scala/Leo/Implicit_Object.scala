package implicits.scala.Leo

/**
 * @author Leo
 */

abstract class Template[T]{      //抽象类
  def add(x:T,y:T):T
}
abstract class SubTemplate[T] extends Template[T]{  //抽象类
  def unit:T
}

object Implicit_Object {
  def main(args:Array[String]){
    
    implicit object StringAdd extends SubTemplate[String]{  //隐式对象
      def add(x:String,y:String) = x concat y  //类型推导
      def unit:String = ""
    }
    implicit object IntAdd extends SubTemplate[Int]{    //隐式对象
      def add(x:Int,y:Int) = x + y
      def unit:Int = 0
    }
    def sum[T](xs:List[T])(implicit m:SubTemplate[T]):T = //m是隐式对象，根据T的类型传入具体的隐式对象
      if(xs.isEmpty) m.unit
      else m.add(xs.head,sum(xs.tail))
      
      println(sum(List(1,2,3,4,5,6)))
      println(sum(List("Scala","Spark","Kafka")))
  }
}