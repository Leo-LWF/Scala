package dataset.scala.Leo

/**
 * @author Leo
 */
object List_HighOrder_Function_Ops {
  
  def main(args:Array[String]){
    println(List(1,2,3,4,6).map(_+1))  //map:对每一个元素进行括号内部方法的操作
    val data = List("Scala","Hadoop","Spark")
    println(data map(_.length))
    println(data map(_.toList.reverse.mkString))
    
    println(data.map(_.toList))
    println(data.flatMap(_.toList))    //flatMap:首先做map操作，在对结果合并成一个集合
    println(List.range(1,10) flatMap (i => List.range(1,i) map(j => (i,j))))
    
    var sum = 0
    List(1,2,3,4,5) foreach(sum += _)    //循环遍历，返回Unit结果的函数
    println("Sum: "+sum)
    
    println(List(1,2,3,4,5,6,7,8,9,10)filter(_%2==0))//过滤出符合条件的元素
    println(data filter (_.length==5))
    
    println(List(1,2,3,4,5) partition (_%2==0))//偶数元素构成一个List,其余元素构成一个List
    println(List(1,2,3,4,5) find (_%2==0))     //找出第一个满足条件的元素，find返回Option型值
    println(List(1,2,3,4,5) find (_<=0))
    println(List(1,2,3,4,5) takeWhile(_<4))    //获取所有符合条件的元素
    println(List(1,2,3,4,5) dropWhile(_<4))    //忽略所有满足条件的元素
    println(List(1,2,3,4,5) span (_<4))        //符合条件的分成一个List,不符合的一个
    
    //forall:List中所有元素都符合条件是返回true
    //exists:List中只要有一个元素符合条件就返回true
    def hastotallyZeroRow(m:List[List[Int]]) = m exists (row => row forall (_==0))
    val m=List(List(1,0,0),List(0,1,0),List(0,0,0))
    println(hastotallyZeroRow(m))
    
//    List(1,2,3,4,5).filter { x => ??? }
  }
}