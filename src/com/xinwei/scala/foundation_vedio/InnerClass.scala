package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 9/24/2016.
  */
object InnerClass {

  def main(args: Array[String]) {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    val inner1 = new outer1.Inner("scala")
    val inner2 = new outer2.Inner("java")
    inner1.print()
    inner2.print()
  }

}

class Outer(val name:String){ outer=> //给外部类定义名称
  //在class中不共享内部类 属于外部类实例本身
  class Inner(val name:String){
    def print(): Unit ={
      println(outer.name+" "+this.name)
    }
  }

}