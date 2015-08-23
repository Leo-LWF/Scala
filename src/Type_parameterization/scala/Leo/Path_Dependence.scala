package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

class Outer{
  private val x=10
  
  //内部类隐含的拥有外部类的实例，所以内部类可以访问外部累的私有成员，而外部类不能访问内部类的私有成员
  class Inner{  
    private val y=x+10
  }
}
object Path_Dependence {
  
  def main(args:Array[String]){
  
    //Scala中内部类的实例必须依赖外部类的实例，外部类不同实例的内部类是不同的
    //我们称对于外部类的依赖为路径依赖类型
    val outer = new Outer
    val inner = new outer.Inner
    val inner2:outer.Inner = new outer.Inner
    
    val o1 = new Outer
    val o2 = new Outer
//    val i:o2.Inner = new o1.Inner  //表明o2.Inner与o1.Inner不是同一种类型
    val i:Outer#Inner = new o1.Inner  //类型投影：Outer#Inner是o1和o2共同的父类
  }  
}