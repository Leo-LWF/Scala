package actor.scala.Leo
import scala.actors.Actor
import scala.actors.Actor._
/**
 *需要注意几点：
 * 1.receive方法会将收到的能够处理的消息(通过isDefindAt判断)传给偏函数，如果不能处理
 * *则会占据收信箱，收件箱满了这不能在接受新消息，因此一般要加上"case _ "处理方法。
 * 2.消息的发送是异步的，消息到达时间也不能确定，不应该依赖消息发送顺序。
 * 3.receive内部的代码执行是线性的，每次只会匹配一个case，内部不存在资源中争用情况。
 * 4.case中对消息的处理结果尽量不要交给全局对象，可通过发消息的方式发送给需要的对象。
 */

case class Person(name:String,age:Int)
class HelloActor extends Actor{
  def act(){
    while(true){
      receive{
        case Person(name,age) => {    //通过case class传递消息,满足发送过程中消息不变性
          println("Name: " + name + ":" + "Age: " + age)
          sender ! "Echo!!!" //通过键字"sender"给发送者回发信息
          }
        case _ => println("Something else")    //防止收件箱满
      }
    }
  }
}
object Actor_With_CaseClass {
  
  def main(args:Array[String]){  //main方法运行在主线程中
    
    val hiActor = new HelloActor
    hiActor.start
    hiActor ! Person("Spark",6)
    
    self.receive{case msg => println(msg)}  //将主线程作为Actor接收消息(原生线程Actor)
//    self.reactWithin(1000){case msg => println(msg)}//默认是阻塞的，没有消息会处于阻塞状态。设置超时时间为1秒
  }
}