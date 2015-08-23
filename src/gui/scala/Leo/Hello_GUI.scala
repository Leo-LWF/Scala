package gui.scala.Leo

/**
 * @author Leo
 */

import scala.swing._

object Hello_GUI extends SimpleSwingApplication{  //SimpleSwingApplication包括一些GUI框架运行时的一些设置
  def top = new MainFrame{      //复写top作为MainFrame
    title = "Hello GUI"
    contents = new Button{
      text = "Scala => Spark"
    }
  }
}