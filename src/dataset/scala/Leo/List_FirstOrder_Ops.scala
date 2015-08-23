package dataset.scala.Leo

/**
 * @author Leo
 */
object List_FirstOrder_Ops {
  
  def main(args:Array[String]){
    println(List(1,2,3,4):::List(4,5,6,7,8):::List(10,11))    //列表连接
    println(List(1,2,3,4):::(List(4,5,6,7,8):::List(10,11)))
    println(List(1,2,3,4).length)           //length函数速度很慢，不建议用
    
    val bigData = List("Hadoop","Spark","Kaffka")
    println(bigData.last)      //最后一个元素
    println(bigData.init)      //除了最后一个元素的所有元素
    println(bigData.reverse)   //反转，返回一个新List,原List不变
    println(bigData)           //原List不变
    println(bigData take 2)    //取得前两个元素
    println(bigData drop 2)    //忽略前2个元素
    println(bigData splitAt 2) //从第3个元素开始分割成两个List
    println(bigData apply 2)   //访问第3个元素
    println(bigData(2))        //访问第3个元素
    
    val data=List('a','b','c','d','e','f')
    println(data.indices)                //返回所有List元素的索引
    println(data.indices zip data)       //zip为拉链操作，把索引和data元素组合
    println(data.zipWithIndex)           //data元素和索引进行拉链操作
    println(data.toString)               //转化成String
    println(data.mkString("[",",","]"))  //格式化String,第一个字符为"["，集合中每两个元素之间为“,”，最后一个元素为“]”
    println(data.mkString("    "))       //同上，只设置分隔符为“   ”
    println(data mkString)               //同上，无分隔符(调用函数省略了点)
    
    val buffer=new StringBuilder         //StringBuilder相当于缓存数组
    data addString(buffer,"(",";;",")")  //将data按后面指定的方式格式化后，赋值给buffer中(调用函数省略了点)
    println(buffer)
    
    val array = data.toArray             //转换成数组
    println(array.toList)                //转换成List
    
    val new_Array = new Array[Char](10)  
    data.copyToArray(new_Array,3)        //把data拷贝到数组中，并且空出数组的前3个位置
    new_Array.foreach(print)
    println
    
    val iterator = data.toIterator       //将List转换成迭代器
    println(iterator.next)
    println(iterator.next)
  }
}