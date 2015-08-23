package learn.scala.Leo

/**
 * @author Leo
 */
object TupleOps {
  def main(args:Array[String]):Unit={
    val tuple=(99,"scala","spark")
    println(tuple._1)
    println(tuple._3)
    println(tuple._2)
  }
}