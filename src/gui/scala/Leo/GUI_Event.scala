package gui.scala.Leo

/**
 * @author Leo
 */
import java.io.File
import scala.swing._
import scala.swing.event.ButtonClicked
import scala.swing.Label

object GUI_Event extends SimpleSwingApplication{
  val fileChooser = new FileChooser(new File("."))
  fileChooser.title = "File Chooser"
  val button = new Button{
    text = "Chooser a File from local"
  }
  val label = new Label {
    text = "No any file selected yet."
  }
  val mainPanel = new FlowPanel{  //Flow类型，随着窗口大小改变布局
    contents += button
    contents += label
  }
  def top = new MainFrame{
    title = "Scala GUI Programing advanced!"
    contents = mainPanel
    
    listenTo(button)
    reactions +={
      case ButtonClicked(b) => {
        val result = fileChooser.showOpenDialog(mainPanel)
        if(result == FileChooser.Result.Approve){
          label.text = fileChooser.selectedFile.getPath()
        }
      }
    }
  }
}