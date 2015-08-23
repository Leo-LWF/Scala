package bestpractice.scala.Leo
import scala.reflect.runtime.universe._

/**
 * @author Leo
 */

class Spark
class Hadoop
object Flink  //单例
class Java{
  class Scala
}
object Type_Advanced {
  def main(args:Array[String]){
    println(typeOf[Spark])
    println(classOf[Spark])  //Class[_<:Spark]
    
    val spark = new Spark
    println(spark.getClass)  //实例的class和类一样
//    println(classOf[spark])  //实例的类要通过getclass获得
    
    println(classOf[Hadoop])
    println(typeOf[Hadoop])
    
    println(Flink.getClass)  //object背后私有具体的类的，getclass获得当前类的具体子类(Flink$)
//    println(classOf[Flink])  //classOf获得当前类型,Flink的当前类型为Flink$
    
    val java1 = new Java
    val java2 = new Java
    val scala1 = new java1.Scala
    val scala2 = new java2.Scala
    println(scala1.getClass)
    println(scala2.getClass)
    println(classOf[java1.Scala] == classOf[java2.Scala])  //两个一样
    println(typeOf[java1.Scala] == typeOf[java2.Scala])    //两个不同，type的信息更具体
    println(typeOf[java1.Scala])
    println(typeOf[java2.Scala])
    
    println(classOf[List[Int]] == classOf[List[String]])    //泛型的class相同
    println(typeOf[List[Int]] == typeOf[List[String]])      //泛型的type不同
  }
}