package learn.scala.Leo
import scala.collection.mutable.ArrayBuffer

object Scala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(127); 
  println("Welcome to the Scala worksheet");$skip(31); 
 		val nums=new Array[Int](10);System.out.println("""nums  : Array[Int] = """ + $show(nums ));$skip(32); 
    val a=new Array[String](10);System.out.println("""a  : Array[String] = """ + $show(a ));$skip(33); 
    val s=Array("Hello","World");System.out.println("""s  : Array[String] = """ + $show(s ));$skip(19); 
    s(0)="Goodbye";$skip(34); 
    
    val b=ArrayBuffer[Int]();System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(9); val res$0 = 
    b+=1;System.out.println("""res0: learn.scala.Leo.Scala.b.type = """ + $show(res$0));$skip(17); val res$1 = 
    b+=(1,2,3,5);System.out.println("""res1: learn.scala.Leo.Scala.b.type = """ + $show(res$1));$skip(24); val res$2 = 
    b ++=Array(8,13,21);System.out.println("""res2: learn.scala.Leo.Scala.b.type = """ + $show(res$2));$skip(22); 
    
    b.trimEnd(5);$skip(6); val res$3 = 
    b;System.out.println("""res3: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$3));$skip(22); 
    b.insert(2,7,8,9);$skip(6); val res$4 = 
    b;System.out.println("""res4: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$4));$skip(16); val res$5 = 
    b.remove(2);System.out.println("""res5: Int = """ + $show(res$5));$skip(6); val res$6 = 
    b;System.out.println("""res6: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$6));$skip(18); 
    b.remove(2,3);$skip(6); val res$7 = 
    b;System.out.println("""res7: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$7));$skip(14); val res$8 = 
    b.toArray;System.out.println("""res8: Array[Int] = """ + $show(res$8));$skip(6); val res$9 = 
    b;System.out.println("""res9: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$9));$skip(54); 
    
    for(i<-0 until a.length)println(i+": "+a(i));$skip(34); 
    
    val c= Array(2,3,5,7,11);System.out.println("""c  : Array[Int] = """ + $show(c ));$skip(40); 
    val result=for(elem<-c)yield 2*elem;System.out.println("""result  : Array[Int] = """ + $show(result ));$skip(43); val res$10 = 
    for(elem<-c if elem%2==0) yield 2*elem;System.out.println("""res10: Array[Int] = """ + $show(res$10));$skip(32); val res$11 = 
    c.filter ( _%2==0).map(2*_);System.out.println("""res11: Array[Int] = """ + $show(res$11));$skip(28); val res$12 = 
    
    Array(1,7,2,9).sum;System.out.println("""res12: Int = """ + $show(res$12));$skip(48); val res$13 = 
    Array("Mary","had","a","little","lamb").max;System.out.println("""res13: String = """ + $show(res$13));$skip(36); 
    
    val d=ArrayBuffer(1,7,2,9);System.out.println("""d  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(d ));$skip(25); 
    val bSorted=d.sorted;System.out.println("""bSorted  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(bSorted ));$skip(25); 
    val e=Array(1,7,2,9);System.out.println("""e  : Array[Int] = """ + $show(e ));$skip(36); 
    scala.util.Sorting.quickSort(e);$skip(6); val res$14 = 
    e;System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(22); val res$15 = 
    e.mkString("and");System.out.println("""res15: String = """ + $show(res$15));$skip(28); val res$16 = 
    e.mkString("<",",",">");System.out.println("""res16: String = """ + $show(res$16));$skip(45); 
    
    val matrix=Array.ofDim[Double](3,4);System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(20); 
    matrix(2)(1)=42;$skip(11); val res$17 = 
    matrix;System.out.println("""res17: Array[Array[Double]] = """ + $show(res$17));$skip(43); 
    val triangle=new Array[Array[Int]](10);System.out.println("""triangle  : Array[Array[Int]] = """ + $show(triangle ));$skip(74); 
    for(i<-0 until triangle.length)
      triangle(i)=new Array[Int](i+1);$skip(13); val res$18 = 
    triangle;System.out.println("""res18: Array[Array[Int]] = """ + $show(res$18));$skip(48); 
		val map=Map("book"->10,"gun"->18,"ipad"->200);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(34); val res$19 = 
    for((k,v)<-map)yield(k,v*0.9);System.out.println("""res19: scala.collection.immutable.Map[String,Double] = """ + $show(res$19));$skip(79); 
   val scores=scala.collection.mutable.Map("scala"->7,"Hadoop"->8,"Spark"->10);System.out.println("""scores  : scala.collection.mutable.Map[String,Int] = """ + $show(scores ));$skip(49); 
    val hadoopScore=scores.getOrElse("Hadoop",0);System.out.println("""hadoopScore  : Int = """ + $show(hadoopScore ));$skip(25); val res$20 = 
    scores +=("Leo"->25);System.out.println("""res20: learn.scala.Leo.Scala.scores.type = """ + $show(res$20));$skip(22); val res$21 = 
    scores -="Hadoop";System.out.println("""res21: learn.scala.Leo.Scala.scores.type = """ + $show(res$21));$skip(92); 
    val sortedScore=scala.collection.immutable.SortedMap("Scala"->7,"Hadoop"->8,"Spark"->9);System.out.println("""sortedScore  : scala.collection.immutable.SortedMap[String,Int] = """ + $show(sortedScore ));$skip(45); 
     
    val tuple=(1,2,3.14,"Rocky","Leo");System.out.println("""tuple  : (Int, Int, Double, String, String) = """ + $show(tuple ));$skip(23); 
    val thrid=tuple._3;System.out.println("""thrid  : Double = """ + $show(thrid ));$skip(49); 
    val (first,second,thirda,fourth,fifth)=tuple;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Int = """ + $show(second ));System.out.println("""thirda  : Double = """ + $show(thirda ));System.out.println("""fourth  : String = """ + $show(fourth ));System.out.println("""fifth  : String = """ + $show(fifth ));$skip(27); 
    val (f,s2,_,_,_)=tuple;System.out.println("""f  : Int = """ + $show(f ));System.out.println("""s2  : Int = """ + $show(s2 ));$skip(37); val res$22 = 
    "Leo Spark".partition(_.isUpper);System.out.println("""res22: (String, String) = """ + $show(res$22));$skip(40); 
    
    val symbols=Array("[","-","]");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(28); 
    val counts=Array(2,5,2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(34); 
    val pairs=symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(41); 
    for((x,y)<-pairs) Console.print(x*y)}
}
