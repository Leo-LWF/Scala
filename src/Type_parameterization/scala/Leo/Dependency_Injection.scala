package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

trait Logger {
  def log(msg:String)
}
trait Auth{
  auth:Logger =>          //对自身类型进行限定，实现依赖注入Auth依赖于Logger
    def act(msg:String){
      log(msg)
    }
}
object DI extends Auth with Logger{  //Auth子类也要满足依赖
  override def log(msg:String) = println(msg)  //重写方法
}

object Dependency_Injection {
  
  def main(args:Array[String]){
    DI.act("I hope you'll like it!")
  }
}