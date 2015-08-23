package dataset.scala.Leo

/**
 * @author Leo
 */
object HelloList {
  def main(args:Array[String]){
    val bigData=List("Hadoop","Spark")        //List声明方式1
    val data = List(1,2,3)
    
    val bigData_Core = "Hadoop"::("Spark"::Nil)//List声明方式2
    val data_Int = 1::2::3::Nil                //元素连接
    
    //List方法
    println(data.isEmpty)  //判空
    println(data.head)     //第一个元素
    println(data.tail.head)//第二个元素
    
    val List(a,b)=bigData  //直接用List对象赋值
    println("a: "+a+"===" + "b: "+b)
    val x::y::rest = data            //前两个值赋给x,y,剩余的赋给rest
    println("x: "+x+"==="+"y: "+y+"==="+rest)
    
    val shuffledData=List(6,3,5,6,2,9,1)
    println(sortList(shuffledData))
    
    //模式匹配进行排序
    def sortList(list:List[Int]):List[Int]=list match{
      case List()=>List()
      case head::tail => compute(head,sortList(tail))  //递归
    }
    
    def compute(data:Int,dataSet:List[Int]):List[Int]=dataSet match{
      case List() => List(data)
      case head::tail => if(data<=head)data::dataSet
          else head::compute(data,tail)
    }
  }  
}