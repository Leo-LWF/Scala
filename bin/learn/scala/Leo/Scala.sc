package learn.scala.Leo
import scala.collection.mutable.ArrayBuffer

object Scala {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 		val nums=new Array[Int](10)       //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    val a=new Array[String](10)                   //> a  : Array[String] = Array(null, null, null, null, null, null, null, null, n
                                                  //| ull, null)
    val s=Array("Hello","World")                  //> s  : Array[String] = Array(Hello, World)
    s(0)="Goodbye"
    
    val b=ArrayBuffer[Int]()                      //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    b+=1                                          //> res0: learn.scala.Leo.Scala.b.type = ArrayBuffer(1)
    b+=(1,2,3,5)                                  //> res1: learn.scala.Leo.Scala.b.type = ArrayBuffer(1, 1, 2, 3, 5)
    b ++=Array(8,13,21)                           //> res2: learn.scala.Leo.Scala.b.type = ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
    
    b.trimEnd(5)
    b                                             //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2)
    b.insert(2,7,8,9)
    b                                             //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 7, 8, 9,
                                                  //|  2)
    b.remove(2)                                   //> res5: Int = 7
    b                                             //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 8, 9, 2)
                                                  //| 
    b.remove(2,3)
    b                                             //> res7: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1)
    b.toArray                                     //> res8: Array[Int] = Array(1, 1)
    b                                             //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1)
    
    for(i<-0 until a.length)println(i+": "+a(i))  //> 0: null
                                                  //| 1: null
                                                  //| 2: null
                                                  //| 3: null
                                                  //| 4: null
                                                  //| 5: null
                                                  //| 6: null
                                                  //| 7: null
                                                  //| 8: null
                                                  //| 9: null
    
    val c= Array(2,3,5,7,11)                      //> c  : Array[Int] = Array(2, 3, 5, 7, 11)
    val result=for(elem<-c)yield 2*elem           //> result  : Array[Int] = Array(4, 6, 10, 14, 22)
    for(elem<-c if elem%2==0) yield 2*elem        //> res10: Array[Int] = Array(4)
    c.filter ( _%2==0).map(2*_)                   //> res11: Array[Int] = Array(4)
    
    Array(1,7,2,9).sum                            //> res12: Int = 19
    Array("Mary","had","a","little","lamb").max   //> res13: String = little
    
    val d=ArrayBuffer(1,7,2,9)                    //> d  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
    val bSorted=d.sorted                          //> bSorted  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 
                                                  //| 9)
    val e=Array(1,7,2,9)                          //> e  : Array[Int] = Array(1, 7, 2, 9)
    scala.util.Sorting.quickSort(e)
    e                                             //> res14: Array[Int] = Array(1, 2, 7, 9)
    e.mkString("and")                             //> res15: String = 1and2and7and9
    e.mkString("<",",",">")                       //> res16: String = <1,2,7,9>
    
    val matrix=Array.ofDim[Double](3,4)           //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0,
                                                  //|  0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
    matrix(2)(1)=42
    matrix                                        //> res17: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 0.
                                                  //| 0, 0.0, 0.0), Array(0.0, 42.0, 0.0, 0.0))
    val triangle=new Array[Array[Int]](10)        //> triangle  : Array[Array[Int]] = Array(null, null, null, null, null, null, n
                                                  //| ull, null, null, null)
    for(i<-0 until triangle.length)
      triangle(i)=new Array[Int](i+1)
    triangle                                      //> res18: Array[Array[Int]] = Array(Array(0), Array(0, 0), Array(0, 0, 0), Arr
                                                  //| ay(0, 0, 0, 0), Array(0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0), Array(0, 0, 
                                                  //| 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0
                                                  //| , 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
		val map=Map("book"->10,"gun"->18,"ipad"->200)
                                                  //> map  : scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 
                                                  //| 18, ipad -> 200)
    for((k,v)<-map)yield(k,v*0.9)                 //> res19: scala.collection.immutable.Map[String,Double] = Map(book -> 9.0, gun
                                                  //|  -> 16.2, ipad -> 180.0)
   val scores=scala.collection.mutable.Map("scala"->7,"Hadoop"->8,"Spark"->10)
                                                  //> scores  : scala.collection.mutable.Map[String,Int] = Map(scala -> 7, Hadoop
                                                  //|  -> 8, Spark -> 10)
    val hadoopScore=scores.getOrElse("Hadoop",0)  //> hadoopScore  : Int = 8
    scores +=("Leo"->25)                          //> res20: learn.scala.Leo.Scala.scores.type = Map(scala -> 7, Hadoop -> 8, Spa
                                                  //| rk -> 10, Leo -> 25)
    scores -="Hadoop"                             //> res21: learn.scala.Leo.Scala.scores.type = Map(scala -> 7, Spark -> 10, Leo
                                                  //|  -> 25)
    val sortedScore=scala.collection.immutable.SortedMap("Scala"->7,"Hadoop"->8,"Spark"->9)
                                                  //> sortedScore  : scala.collection.immutable.SortedMap[String,Int] = Map(Hadoo
                                                  //| p -> 8, Scala -> 7, Spark -> 9)
     
    val tuple=(1,2,3.14,"Rocky","Leo")            //> tuple  : (Int, Int, Double, String, String) = (1,2,3.14,Rocky,Leo)
    val thrid=tuple._3                            //> thrid  : Double = 3.14
    val (first,second,thirda,fourth,fifth)=tuple  //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| thirda  : Double = 3.14
                                                  //| fourth  : String = Rocky
                                                  //| fifth  : String = Leo
    val (f,s2,_,_,_)=tuple                        //> f  : Int = 1
                                                  //| s2  : Int = 2
    "Leo Spark".partition(_.isUpper)              //> res22: (String, String) = (LS,eo park)
    
    val symbols=Array("[","-","]")                //> symbols  : Array[String] = Array([, -, ])
    val counts=Array(2,5,2)                       //> counts  : Array[Int] = Array(2, 5, 2)
    val pairs=symbols.zip(counts)                 //> pairs  : Array[(String, Int)] = Array(([,2), (-,5), (],2))
    for((x,y)<-pairs) Console.print(x*y)
}