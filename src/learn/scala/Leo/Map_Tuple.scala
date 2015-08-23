package learn.scala.Leo

/**
 * @author Leo
 */
object Map_Tuple {
  def main(args:Array[String]):Unit={
    val map=Map("book"->10,"gun"->18,"ipad"->200)
    for((k,v)<-map)yield(k,v*0.9)
    
    val scores=scala.collection.mutable.Map("scala"->7,"Hadoop"->8,"Spark"->10)
    val hadoopScore=scores.getOrElse("Hadoop",0)
    scores +=("Leo"->25)
    scores -="Hadoop"
    
    val sortedScore=scala.collection.immutable.SortedMap("Scala"->7,"Hadoop"->8,"Spark"->9)
    
    val tuple=(1,2,3.14,"Rocky","Leo")
    val thrid=tuple._3
    val (first,second,thirda,fourth,fifth)=tuple
    val (f,s,_,_,_)=tuple
    
    "Leo Spark".partition(_.isUpper)
    
    val symbols=Array("[","-","]")
    val counts=Array(2,5,2)
    val pairs=symbols.zip(counts)
    for((x,y)<-pairs) print(x*y)

  }
}