package function.scala.Leo

/**
 * @author Leo
 */
import scala.math._

object higher_order_function {
  def main(args:Array[String]){
    
    (1 to 9).map("*" * _).foreach(println _)
    (1 to 9).filter(_% 2 ==0 ).foreach(println)
    println((1 to 9).reduceLeft(_ * _))
    "Spark is the most exciting thing happening in big data today".split(" ").
    sortWith(_.length< _.length).foreach(println)
    
    val fun=ceil _    // _将ceil方法转成了函数
    val num=3.14      // 返回4.0，调用fun
    println(fun(num))
    Array(3.14,1.42,2.0).map(fun).foreach(println _)  //返回Array(4.0, 2.0, 2.0)，将fun作为变量传递
    
    val triple=(x:Double)=>3*x  //匿名函数，将传给它的参数乘3，将函数赋值给变量
    Array(3.14,1.42,2.0).map((x:Double)=> 3*x)
    Array(3.14,1.42,2.0).map{(x:Double)=> 3*x }
    
    //带函数参数的函数。该函数的类型是： ((Double) => Double) => Double
    def high_order_functions(f:(Double)=>Double)=f(0.25)
    println(high_order_functions(ceil _))
    println(high_order_functions(sqrt _))
    
    //返回一个函数的函数
    def mulBy(factor:Double) = (x:Double) => factor*x
    
    // mulBy可以产出任何两个数相乘的函数
    val quintuple = mulBy(5)    //(x: Double) => 5 * x
    println(quintuple(20))      //5 * 20
    
    //参数(类型)推断
    println(high_order_functions((x:Double)=>3*x)) // 完整写法
    high_order_functions((x) => 3*x)      //一直参数类型，省略double
    high_order_functions(x => 3*x)        // 只有一个参数时，可以省去()
    println(high_order_functions(3*_))    //参数只在右侧出现一次，可以用_替换
    
    val fun2 = 3*(_:Double)
    val fun3:(Double)=>Double=3*_
    
    
  }
}