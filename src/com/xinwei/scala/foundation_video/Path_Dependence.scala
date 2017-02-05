package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 11/1/2016.
  */

class Outer1 {
  private val x = 10

  //内部类可以访问外部类的私有成员 外部类不能访问内部类的成员
  class Inner {
    private val y = x+10
  }

}

object Path_Dependence {

  def main(args: Array[String]): Unit = {

    val outer = new Outer1
    //路径依赖 不同路径类型不同
    val inner = new outer.Inner

    //此时是类型相同
    val i:Outer1#Inner = inner



  }

}
