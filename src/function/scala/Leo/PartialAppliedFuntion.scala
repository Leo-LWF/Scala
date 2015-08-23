package function.scala.Leo

/**
 * @author Leo
 */
object PartialAppliedFuntion {
  
  def main(args:Array[String]){
    val data=List(1,2,3,4,5,6)
    data.foreach(x=>println(x)) //foreach循环遍历集合中的每个元素
    data.foreach(println _)     //使用空格和占位符代表的是整个参数列表，这种用函数的下划线代表函数的若干个参数的方式就叫偏应用函数
    
    def sum(a:Int,b:Int,c:Int)=a+b+c
    println(sum(1,2,3))
    
    //偏应用函数也叫部分应用函数，
    //是指一个函数有N个参数, 而我们为其提供少于N个参数, 那就得到了一个部分应用函数.
    val fp_a=sum _              //空格后面的下划线代替sum的多有参数
    println(fp_a(1,2,3))
    println(fp_a.apply(1,2,3))
    val fp_b=sum(1,_:Int,3)     //下划线代表第二个参数
    println(fp_b(2))
    println(fp_b(10))
    
//    data.foreach(println _)
//    data.foreach(println)
  }
}