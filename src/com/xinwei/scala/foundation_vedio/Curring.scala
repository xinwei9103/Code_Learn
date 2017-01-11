package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 10/3/2016.
  */
object Curring {

  //原来接收多个参数的函数 现在变成多个接收一个参数的函数

  def main(args: Array[String]) {

    def mutiple(x:Int,y:Int) = x*y

    def mutipleOne(x:Int) = (y:Int) => x*y

    println(mutipleOne(6)(7))

  }


}
