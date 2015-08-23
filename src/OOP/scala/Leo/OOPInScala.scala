package OOP.scala.Leo

/**
 * @author Leo
 */
class Teacher{
  var name:String=_
  private var age=25
  private[this] val gender="male"
  
  def this(name:String){    //重载构造器/附属构造器
    this
    this.name=name
  }
  
  def sayHello(){
    println(this.name+": "+this.age+": "+this.gender)
  }
}

//私有构造器
class Teacher2 private(val name:String,val age:Int){  //加了private，则主构造器外界无法调用，只能调用重载构造器
  println("This is the primary constructor!!!")
  var gender:String=_
  println(gender)
  
  def this(name:String,age:Int,gender:String){    //重载构造器
    this(name,age)
    this.gender=gender
  }
}

//内部类
class Outer(val name:String){outer=>
  class Inner(val name:String){
    def foo(b:Inner)=println("Outer: "+outer.name+" Inner: "+b.name)
  }
  
}
object OOPInScala {
  def main(args:Array[String]):Unit={
    val p=new Teacher
    p.name="Leo"
    p.sayHello
    
//    val t=new Teacher2("Spark",5)
//    println(": "+t.age)
    
    val t1=new Teacher2("spark",5,"male")
    println(": "+t1.age)
    
    val outer1=new Outer("Spark")
    val outer2=new Outer("Hadoop")
    val inner1=new outer1.Inner("Scala")
    val inner2=new outer2.Inner("Java")
    inner1.foo(inner1)
    inner2.foo(inner2)
  }
}