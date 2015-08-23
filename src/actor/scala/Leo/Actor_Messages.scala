package actor.scala.Leo
import scala.actors.Actor._
import scala.actors.Actor
/**
 * @author Leo
 */
object Actor_Message extends Actor{//继承Actor
  def act(){
    while(true){
      receive{
        case msg => println("Message content from Actor inbox: "+msg)
      }
    }
  }
}
object Actor_Messages {
  def main(args:Array[String]){
    val actor_Message = actor{    //匿名Actor,使用临时actor是常用
      while(true){                //循环查看消息
        receive{ //receive是偏函数，有apply方法和isDefindAt方法
        //receive中有若干个case，isDefindAt方法用于判断收到的消息是否已经被具体定义为要处理的消息，如果是则返回true
        //isDefindAt返回true的消息，才会传递给apply方法解析参数，进行消息的模式匹配。否则忽略消息，不进行处理
          
        case msg => println("Message content from inbox: "+msg)  //匹配消息并处理
        }
      }
    }
    val double_Message = actor{    //匿名Actor
      while(true){
        receive{
          case msg:Double => println("Double number from inbox: "+msg)
          case _ => println("Something Unknown")    //如果没有这个消息处理定义，则会忽略出Double类型以外的消息
        }
      }
    }
    Actor_Message.start()
    Actor_Message ! "Hadoop"    //用"!"发消息
    actor_Message ! "Spark"
    double_Message ! Math.PI
    double_Message ! "Hadoop"
  }
}