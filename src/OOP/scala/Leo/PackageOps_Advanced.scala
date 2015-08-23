package OOP.scala.Leo

/**
 * @author Leo
 */
package spark{
  package navigation{
    private[spark] class Navigator{  //扩展访问权限到整个spark包，表示Navigator这个类对被包含在spark中的所有类和对象可见
      protected[navigation] def useStarChart(){}//表明useStarChart这个方法不仅可以被当前类Navigator及其子类使用，而且还能被包navigation中所有代码访问
      class LegOfJourney{
        private[Navigator] val distance=100 //访问权限扩展到整个Navigator类
      }
      private[this] var speed=200    //对象私有：只能被当前对象访问
    }
  }
  
  package launch{
    import navigation._
    object Vehicle{
      private[launch] val guide = new Navigator  //扩展访问权限，launch包中的所有内容都可以访问guide
    }
  }
}

//伴生类和伴生对象可以任意相互访问(除了伴生对象中的protected成员)
class PackageOps_Advanced{
  import PackageOps_Advanced.power
  private def canMakeItTrue=power>10001
}
object PackageOps_Advanced {
  private def power=10000
  
  def makeItTrue(p:PackageOps_Advanced):Boolean={
    val result=p.canMakeItTrue
    result
  }
}