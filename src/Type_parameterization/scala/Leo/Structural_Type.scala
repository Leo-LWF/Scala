package Type_parameterization.scala.Leo

/**
 * @author Leo
 */

//结构类型是指一组关于抽象的方法或字段或规格的说明，而这些是传进参数或者要使用的相关对象必须具备的

class Structural{ def open()=println("A class instance Opened")}

object Structural_Type {
  
  def main(args:Array[String]){
    init(new {def open()=println("Opened")}) //函数参数含有open方法
    type X = {def open()}                    //type把等号右边的内容取一个别名
    def init(res:X) = res.open               //X类型中含有open方法
    init(new { def open()=println("Opened again")})//传进的参数是X类型的
    
    object A { def open() { println("A single object Opened")}}
    init(A)                      //对象A中含有open方法
    
    val structural = new Structural //Structural类中含有open方法
    init(structural)
  }
  
  def init(res:{ def open():Unit }){  //定义一个函数，要求函数的参数必须含有一个open方法
    res.open
  }
}