package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 9/28/2016.
  */
object Closure {

  def main(args: Array[String]) {
    def add(more:Int) = (x:Int) => x + more

    val a =add(1)
    val b= add(9999)
    println(a(1))
    println(b(1))
    //more 闭包
    def add1(more:Int):(Int,Int) => _ = {
      def ab(x:Int,b:Int): Int = {
        x + more+b
      }
      ab _
    }
    val c = add1(10)
    println(c(1,2))
  }

}
