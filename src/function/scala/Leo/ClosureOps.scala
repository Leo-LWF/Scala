package function.scala.Leo

/**
 * @author Leo
 */
object ClosureOps {
  def main(args:Array[String]){
    val data=List(1,2,3,4,5,6)
    var sum=0
    data.foreach(sum+= _)  //函数捕获闭包之外的自由变量sum
    println(sum)            //闭包对sum做出改变，在闭包之外也可看见
    
    def add(more:Int) = (x: Int) => x+more  //定义一个包含自由变量的函数，
    val a=add(1)      //每次被调用时都会创建一个新闭包
    val b=add(9999)   //每次创建新闭包都会访问创建闭包时活跃的more变量
    println(a(10))
    println(b(10))
  }
}