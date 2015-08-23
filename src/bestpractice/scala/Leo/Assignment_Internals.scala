package bestpractice.scala.Leo

/**
 * @author Leo
 */

//赋值语句中的模式匹配
object Assignment_Internals {
  def main(args:Array[String]){
    val a@b = 1000  //定义一个变量(赋值后不可变)，赋值时把a绑定到b，
                  //内部是通过模式匹配把1000同时赋值给a和b，
                      //然后返回二元组内容给val a@b
    println("a = "+ a + "b = "+ b)
    val (c,d) = (1000,2000)    //变量名必需小写
//    val (e,F) = (1000,2000)  //编译器会把大写的F当作常量进行模式匹配，因此会报错没有定义F常量
    val Array(g,h) = Array(1000,2000)  //必需小写
//    val Array(i,J) = Array(1000,2000)  
//    object Test {val 1=1}  //常量匹配
    object Test {val 1=2}  //编译器没报错，是因为这是lazy的，
                            //只有到运行的时候才会报错
  }
}