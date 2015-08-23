package dataset.scala.Leo

/**
 * @author Leo
 */
object List_Fold_Sort {
  
  def main(args:Array[String]){
    println((1 to 100).foldLeft(0)(_+_))//从左边开始，从0开始累加(每次加的结果和下一个数相加)
    println((0 /: (1 to 100))(_+_))     //同上
    
    println((1 to 5).foldRight(100)(_-_))//从右边起，从减去100开始，下一个数减去上次减法的结果
    println(((1 to 5):\100)(_+_))        //同上
    
    println(List(1,-3,4,2,6) sortWith (_<_))//升序
    println(List(1,-3,4,2,6) sortWith (_>_))//降序
  }
}