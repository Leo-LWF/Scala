package basics.scala.Leo

/**
 * @author Leo
 */
import scala.io.Source

object FunctionOps {
  
  def main(args:Array[String]){
    val width = args(0).toInt
    for(arg <- args.drop(1))
      processData(arg,width)
      
      //函数是一等公民，把函数当作变量看待
      var increase=(x:Int)=>x+1  //把函数当作一个值赋值给变量  (或者常量)
      println(increase(10))
      increase=(x:Int)=>x+9999   //重新赋值
      
      val someNumber=List(-11,-10,-5,0,5,10)    //集合
      someNumber.foreach((x:Int) => println(x))
      someNumber.filter((x:Int) => x>0)
      someNumber.filter((x) => x>0)             //类型推断，可省Int
      someNumber.filter(x =>x >0)               //省略括号
      someNumber.filter(_ > 0)                  //只有一个值，省略x
      val f=(_:Int)+(_:Int)
      println(f(5,10))
  }
  def processData(filename:String,width:Int){
    
    //函数在Scala中是一等公民，它支持内部函数
    //本地函数(内部函数)，processData的私有函数，外部不可访问
    //内部函数实现了函数封装的“强内聚，弱耦合”特征
    def processLine(line:String){  
      if(line.length>width)        //内部函数可以访问外部传递的参数width
        println(filename +": "+ line)
    }
    
    val source=Source.fromFile(filename)
    for(line <- source.getLines)
      processLine(line)
  }
}