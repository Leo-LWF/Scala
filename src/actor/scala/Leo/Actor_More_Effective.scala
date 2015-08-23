package actor.scala.Leo
import scala.actors.Actor
import scala.actors.Actor._
import java.net.InetAddress
import java.net.UnknownHostException
/**
 * @author Leo
 */

object NameResolver extends Actor{
  
  def act(){
    react{   //react处理消息后不会返回(返回类型是nothing)，
             //从堆栈调用的角度，没有返回则不用保存大量线程调用堆栈。
             //因此下一个Actor也可以存在当前Actor的所在线程，从而达到线程重用
      case Net(name,actor) => sender ! getIp(name)
        act        //需要act方法
      case "EXIT" => println("Name resolver exiting.")
      case msg => println("Unhandled massage: "+ msg)
        act
    }
    loop{      //循环执行代码块
      react{
        case Net(name,actor) => sender ! getIp(name)
        case msg => println("Unhandled message : "+msg)
      }
    }
  }
  def getIp(name:String):Option[InetAddress] = {
    try{
      println(InetAddress.getByName(name))
      Some(InetAddress.getByName(name))
    }catch{
      case _:UnknownHostException => None
    }
  }
}
case class Net(name:String,actor:Actor)
object Actor_More_Effective {
  def main(args:Array[String]){
    NameResolver.start
    NameResolver ! Net("www.baidu.com",self)
    
    println(self.receiveWithin(1000){case x=>x})
  }
}