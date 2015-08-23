package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

object Infix_Types {
  
  def main(args:Array[String]){
    
    object Log{def >>: (data:String):Log.type = {println(data);Log}}  //定义一个中值表达式
    "Hadoop">>:"Spark">>:Log    //右结合
    
    val list = List()
    val newList = "A"::"B"::list  //"::"也是中值表达式
    println(newList)
    
    class Infix_Type[A,B]  //用中值的语法方式来表示带有两个类型参数的类型
    val infix:Int Infix_Type String = null  //中值类型，带有Int和String类型参数
    val infix1:Infix_Type[Int,String]=null  //与上一句等价
    
    case class Cons(first:String,second:String)
    val case_class = Cons("one","two")
    //当case class中不止一个参数时，使用中值表达式提取值很方便(unapply方法)
    case_class match { case "one" Cons "two" => println("Spark!!!")}  
  }
}