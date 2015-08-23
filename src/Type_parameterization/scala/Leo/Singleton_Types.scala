package Type_parameterization.scala.Leo

/**
 * @author Leo
 */
class Animal{def breathe:this.type = this}//this.type返回对象或者类
class Cat extends Animal{def eat:this.type=this}

object Singleton_Types {
  
  def main(args:Array[String]):Unit = {
    val cat = new Cat  //此时this是cat的对象
    cat.breathe.eat    //链式调用，cat.breathe返回cat的type,因此可以继续调用eat
  }
}