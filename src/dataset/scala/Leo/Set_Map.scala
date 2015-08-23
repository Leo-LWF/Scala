package dataset.scala.Leo

/**
 * @author Leo
 */
import scala.collection.mutable
import scala.collection.mutable.TreeSet
import scala.collection.immutable.TreeMap
object Set_Map {
  
  def main(args:Array[String]){
    
    val data = mutable.Set.empty[Int]//创建一个空的Set集合，元素为Int型
    data ++=List(1,2,3)  //使用"++="添加List中包括的元素
    data +=4            //使用"+="直接添加元素到
    data --= List(2,3); //使用"--="去除List包括的元素
    println(data)
    data +=1            //由于前面已经添加元素1，因此这这一句不再添加
    println(data)
    data.clear        //把Set中所有元素清除，Set还在
    println(data)
    
    val map= mutable.Map.empty[String,String]//调用empty方法创建一个空的Map,key和value类型都为String
    map("Java")="Hadoop"    //往map中添加元素，map(key)=value
    map("Scala")="Spark"
    println(map)
    println(map("Scala"))    //调用map根据key值检索value值
    
    val treeSet = TreeSet(9,3,7,1,8,0,2,7,4,6,5)//元素添加进去后是没有排序的，访问的时候是排序后的结果
    println(treeSet)    //排序后的结果
    val treeSetForChar=TreeSet("Spark","Scala","Hadoop")
    println(treeSetForChar)
    
    var treeMap = TreeMap("Scala"->"Spark","Java"->"Hadoop")//添加进去后悔根据Key进行排序
    println(treeMap)    //排序后的结果
  }
}