package function.scala.Leo

/**
 * @author Leo
 */
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.JFrame
import javax.swing.JButton

object SAM_Curring {
  def main(args:Array[String]){
    
    var data=0
    val frame = new JFrame("SAM Testing")
    val jButton=new JButton("Counter")
//    jButton.addActionListener(new ActionListener{  //给按钮添加监听器代码
//      override def actionPerformed(event:ActionEvent){
//        data +=1
//        println(data)
//      }
//    })
    
    //隐式转换
    implicit def convertedAction(action:(ActionEvent)=>Unit)=
      new ActionListener{
      override def actionPerformed(event:ActionEvent){action(event)}
    }
    
    //其实只要给addActionListener传一个函数参数，也就能够实现一样的功能了。前提是需要提供一个隐式转换
    jButton.addActionListener((event:ActionEvent)=>{data += 1;println(data)})
    
    frame.setContentPane(jButton);
    frame.pack();
    frame.setVisible(true);
  }
}