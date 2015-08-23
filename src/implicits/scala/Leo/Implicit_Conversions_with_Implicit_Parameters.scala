package implicits.scala.Leo

/**
 * @author Leo
 */
object Implicit_Conversions_with_Implicit_Parameters {
   
  def main(args:Array[String]){
    
    //柯里化泛型函数，第三个参数为隐式参数，是一个将T类型返回Ordered[T]类型的函数
    //Ordered[T]是一个trait，里面有"<"和">"抽象函数
    def bigger[T](a:T,b:T)(implicit ordered:T => Ordered[T])  
        =if(ordered(a) > b)a else b
    
    //隐式参数下的隐式转换
    println(bigger(4,3))       //获取隐式参数，将Int转换为Ordered[Int]，进行比较
    println(bigger("Spark","Hadoop"))
  }
}