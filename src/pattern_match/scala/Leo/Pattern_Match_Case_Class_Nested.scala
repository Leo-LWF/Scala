package pattern_match.scala.Leo

/**
 * @author Leo
 */

abstract class Item
case class Book(description:String,price:Double)extends Item
case class Bundle(description:String,price:Double,items:Item*)extends Item//*表示items这个成员可以有若干个Item类型的成员(包括Book和Bundle)

object Pattern_Match_Case_Class_Nested {  
  def main(args:Array[String]){
    
    def caseclass_nested(person:Item)=person match{
      case Bundle(_,_,art @ Book(_,_),rest @ _*)=>println(art.description+" : "+art.price)
//      case Bundle(_,_,Book(descr,_),_*)=>println("The first description is: "+descr)
      case _ => println("Oops!")
    }
    
    caseclass_nested(Bundle("111 Special's ",30.0,
        Book("Scala for the Spark Developer",69.95),
        Bundle("Hadoop",40.0,                        //一层嵌套
            Book("Hive",79.95),
            Book("HBase",32.95)                      //二层嵌套
            )
    ))
    
    caseclass_nested(Bundle("1212 special's ",35.0,
        Book("Spark for the Imapatient",39.95)
    ))
  }
}