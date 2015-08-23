package dataset.scala.Leo

/**
 * @author Leo
 */
import scala.collection.immutable.Queue

object ListBuffer_ListArray_Queue_Stack {  
  def main(args:Array[String]){
    
    import scala.collection.mutable.ListBuffer
    val listBuffer = new ListBuffer[Int]
    listBuffer +=1    //添加元素
    listBuffer +=2
    println(listBuffer)
    
    import scala.collection.mutable.ArrayBuffer
    val arrayBuffer = new ArrayBuffer[Int]()
    arrayBuffer +=1    //添加元素
    arrayBuffer +=2
    println(arrayBuffer)
    
    val empty = Queue[Int]()      //不可变的queue(immutable)，对它操作会产生新对象
    val queue1 = empty.enqueue(1) //添加元素后变成新的queue
    val queue2 = queue1.enqueue(List(2,3,4,5))
    println(queue2)
    val (element,left) = queue2.dequeue//把queue2拆分成第一个元素和剩余元素两部分
    println(element+" : "+left)
    
    import scala.collection.mutable.Queue  //可变的queue
    val queue = Queue[String]()
    queue+="a"                //使用"+="直接添加元素到原queue
    queue ++=List("b","c")    //使用"++="直接添加List到原queue
    println(queue)
    println(queue.dequeue)    //第一个元素出队(删除)
    println(queue)
    
    import scala.collection.mutable.Stack  //可变
    val stack=new Stack[Int]
    stack.push(1)      //入栈
    stack.push(2)
    stack.push(3)
    println(stack.top) //查看栈顶元素
    println(stack)
    println(stack.pop) //栈顶元素出栈并返回
    println(stack)    
  }
}