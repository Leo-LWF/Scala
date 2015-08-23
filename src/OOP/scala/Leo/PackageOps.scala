package OOP.scala.Leo

/**
 * @author Leo
 */

package com.scala.spark
package object people{    //定义一个包对象
  val defaultName="Scala"
}
package people{            //定义包
  class people{            //包中所有的类成员可以直接访问包对象中的成员和方法(包不能含有成员和方法)
    var name=defaultName
  }
}

import java.awt.{Color,Font}//不想引入包中所有内容，使用大括号制定包中内容
import java.util.{HashMap=>JavaHashMap}//为了避免Scala中的命名和Java中的命名冲突，引入java中的HashMap别名JavaHashMap
import scala.{StringBuilder=>_}//不想使用Scala中的StringBuilder

class PackageOps{ }

package spark.Navigation{
  abstract class Navigator{
    def act
  }
  
  package tests{
    //在spark。Navigation。tests包里
    class NavigatorSuite
  }
  
  package impls{
    class Action extends Navigator{
      def act=println("Action")
    }
  }
}
package hadooop{
  package navigation{
    class Navigator
  }
  
  package launch{
    class Booster{
      val nav = new navigation.Navigator
    }
  }
}

object PackageOps {
  def main(args:Array[String]):Unit={
    
  }
}