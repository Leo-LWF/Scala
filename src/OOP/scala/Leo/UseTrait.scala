package OOP.scala.Leo

/**
 * @author Leo
 */
class UseTrait{
  
}
trait Logger{
//  def log(msg:String)      //trait中既可以有抽象方法
  def log(msg:String){}  //也可以有具体的方法
}

//在 Scala中只能继承一个类或抽象类，但是可以继承多个接口trait，因此通过继承trait可以在代码中混入大量工具方法
//第一次使用trait用关键字extends，之后用别的trait用关键字with
class ConcreteLogger extends Logger with Cloneable{
//  override def log(msg:String)=println("Log: "+msg) //重写抽象类，override可省
  
  def concreteLog{
    log("It's me!")
  }
}

//在trait中做很多工具方法，在程序需要时，用with混入代码
trait TraitLogger extends Logger{    
  override def log(msg:String){
    println("TraitLogger Log concrete is: "+msg)
  }
}
trait TraitLoggered{
  def loged(msg:String){
    println("TraitLoggered Log content is : "+ msg)
  }
}

trait ConsoleLogger extends TraitLogger{
  override def log(msg:String){
    println("Log from Console :"+msg)
  }
}

class Test extends ConsoleLogger{
  def test{
    log("Here is Spark!!!")
  }
}

abstract class Accont{
  def save
}

class MyAccont extends Accont with ConsoleLogger{
  def save{
    log("11")
  }
}

class Human{
  println("Human")
}
trait TTeacher extends Human{
  println("TTeacher")
  def teach
}
trait PianoPlayer extends Human{
  println("PianoPlayer")
  def playPiano={println("I'm playing piano!")}
}
//多重继承的构造顺序是从左往右的，并且不会重复构造：前面构造了后面trait的父类，构造后面的trait时不会再构造器父类
class PianoTeacher extends Human with TTeacher with PianoPlayer{
  override def teach= {println("I'm training stustends!")}
}

//AOP
trait Action{
  def doAction
}
trait TBeforeAfter extends Action{
  abstract override def doAction{  //尽管对父类的抽象方法进行了重写，但仍是抽象方法
    println("Initialization")
    super.doAction
    println("Destroyed")
  }
}
class Work extends Action{
  override def doAction=println("Working...")
}

object UseTrait extends App{
  //使用with加另一个trait，将改trait中重写的log方法混入到对象中
  //随着程序运行的动态情况，混入更符合程序上下文的方法实现，对象混入可以修改trait的默认行为
    val logger=new ConcreteLogger with TraitLogger  
//    val logger=new ConcreteLogger
    logger.concreteLog
    
//    val logger=new Test
//    logger.test
    
//    val accont=new MyAccont with TraitLoggered
//    accont.save
    
//    val t1=new PianoTeacher
//    t1.playPiano
//    t1.teach
//    
//    val t2 = new Human with TTeacher with PianoPlayer{//在对象中混入trait代码
//      def teach={println("I'm teaching students!!")} }//并且可以重写trait的方法
//    t2.playPiano
//    t2.teach
    
    //AOP
    val work=new Work with TBeforeAfter  //在Work对象中混入了接口TBefore代码
        //由于Work类中对接口Action中的doAction进行了重写，
        //所以混入的TBefore代码中的super.doAction实际是重写了的方法
    work.doAction                        
}