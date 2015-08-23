package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

import scala.reflect.ClassTag

//泛型类的三个参数没有指定特定类型，先标记为F,S,T类型,可以在FS后加“:ClassTag”
class Triple[F,S,T](val first:F,val second:S,val third:T)

object Hello_Type_Parameterization {
  def main(args:Array[String]){
    val triple=new Triple("Spark",3,3.1415)  //类型推断
    val bigData=new Triple[String,String,Char]("Spark","Hadoop",'R')//新建对象是制定类型
    
    def getData[T](list:List[T]) = list(list.length/2)  //泛型函数：定义是不指定特定类型
    println(getData(List("Spark","Hadoop",'R')))
    val f = getData[Int] _
    println(f(List(1,2,3,4,5,6,7,8)))
    
    def buildArray[T:ClassTag](len:Int) =  new Array[T](len)
    println(buildArray[Int](5).toList)
  }
}