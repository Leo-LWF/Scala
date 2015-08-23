package bestpractice.scala.Leo

/**
 * @author Leo
 */

object :>{    //提取器“:>”
   //当进行匹配的时候，unapply会被回调，传入的参数是要匹配的对象，
   //返回的内容是是要匹配出来的具体内容,即解构后的元素
  def unapply[A](list:List[A])={            
    Some( (list.init,list.last))
  }
}
object Extractor_Advanced {
  def main(args:Array[String]){
    (1 to 9).toList match{case _ :> 9 =>println("Hadoop")}
    (1 to 9).toList match{case x :> 8 :> 9 => println("Spark")}
    (1 to 9).toList match{case :>(:>(_,8),9) => println("Flink")}
  }
}