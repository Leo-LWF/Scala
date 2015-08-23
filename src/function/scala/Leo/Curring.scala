package function.scala.Leo

/**
 * @author Leo
 */
object Curring {
  
  def main(args:Array[String]){
    
    //把原来接受多个参数的函数变成接受单一参数(原函数的第一个参数)的函数的过程叫柯里化。
    //柯里化返回一个接受余下参数且返回结果的新函数
    def mutiple(x:Int,y:Int)=x*y      //计算两个数的乘机
    def multiple_Curring(x:Int)(y:Int)=x*y  //scala中柯里化简写
    println(multiple_Curring(6)(7))         //mutipleOne(6)返回的是函数(y:Int)=>6*y
    
    //演示柯里化函数调用过程
    def first(x:Int)=(y:Int)=>x*y  //闭包
    val second=first(6)            //相当于上面mutiple_Curring(6)函数
    println(second(7))
    
    //使用柯里化函数定义上面second
    val multiple_six = multiple_Curring(6)_
    println(multiple_six(7))
    //还可以定义其他类似函数
    val multiple_seven = multiple_Curring(7)_
    println(multiple_seven(7))
    
//    def curring(x:Int)(y:Int)=x*y     
//    println(curring(10)(10))
    
    val a=Array("Hello","Spark")
    val b=Array("hello","spark")
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))
  }
}