package actor.scala.Leo

/**
 * @author Leo
 * Scala中并发编程采用消息传递和消息队列方式(而java并发编程是基于资源共享和锁机制，容易死锁)
 * 每个通信的线程的Actor有自己的消息列表，不断查看消息列表，如果发现有消息，就解析消息并执行
 * 执行过程中会修改自己状态，执行结束返回结果给对方，并给对方
 */

import scala.actors.Actor

object First_Actor extends Actor{
  def act(){
    for(i <- 1 to 10){
      println("Step:" + i)
      Thread.sleep(1000)
    }
  }
}
object Second_Actor extends Actor{
  def act(){
    for(i <- 1 to 10){
      println("Step Further:" + i)
      Thread.sleep(1000)
    }    
  }
}
object Hello_Actor {
  def main(args:Array[String]){    
    First_Actor.start()
    Second_Actor.start()
  }
}