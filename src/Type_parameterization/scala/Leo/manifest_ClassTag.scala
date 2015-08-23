package Type_parameterization.scala.Leo

/**
 * @author Leo
 */
import scala.reflect.ClassTag

class A[T]

object manifest_ClassTag {
  def main(args:Array[String]){
    
    //为了使得在运行时得到T的信息，scala需要额外通过Manifest来存储T的信息，并作为参数用在方法的运行时上下文。
    //内部实现是通过隐式转换的(自动的)
    def arrayMake[T:Manifest](first:T,second:T)={
      val r=new Array[T](2);r(0)=first;r(1)=second;
      r
    }
    arrayMake(1,2).foreach(println)
    
    //ClasssTag最常用，在编译时无法确定类型，在运行时才指定高级类型
    //内部实现是通过隐式转换的(自动的)
    def mkArray[T:ClassTag](elem:T*)=Array[T](elem: _*)  
    mkArray(42,13).foreach(println)
    mkArray("Japan","Brazil","Germany").foreach(println)
    
    //比较老的写法，不推荐
    def manif[T](x:List[T])(implicit m:Manifest[T])={
      if(m <:< manifest[String])    //类型约束，前者是后者的子类型
        println("List string")
      else
        println("Some other type")    
    }
    manif(List("Spark","Hadoop"))
    manif(List(1,2))
    manif(List("Scala",3))
    
    val m=manifest[A[String]]
    println(m)
    val cm = classManifest[A[String]]
    println(cm)
  }
}