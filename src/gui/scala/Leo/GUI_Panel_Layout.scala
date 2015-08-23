package gui.scala.Leo

/**
 * @author Leo
 */
import scala.swing._
import scala.swing.event.ButtonClicked

object GUI_Panel_Layout extends SimpleSwingApplication{
  def top = new MainFrame{
    title = "Second GUI"
    val button = new Button{
      text = "Scala"
    }
    val label = new Label{
      text = "Here is Spark!!!"
    }
    contents = new BoxPanel(Orientation.Vertical){  //垂直布局
      contents += button  //添加button
      contents += label    //添加label
      border = Swing.EmptyBorder(100, 100, 100, 100)
    }
    
    listenTo(button)
    var clicks = 0
    reactions += {//reaction会形成堆栈，当top框架接收事件的时候(点击Button)，
                  //会交给具体组件的事件(ButtonClick)，在case匹配的时候，
                  //收到匹配的事件就会执行相应代码
      case ButtonClicked(button) => {
        clicks += 1
        label.text = "Clicked " + clicks + "times."
      }
    }
  }
}