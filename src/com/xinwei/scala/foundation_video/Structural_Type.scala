package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 11/1/2016.
  */

class Structural{
  def open(): Unit ={
    println("xinwei wang")
  }
}

object Structural_Type {

  def main(args: Array[String]): Unit = {
    init(new { def open = { println("yoyo")}})

    type X = {def open:Unit}
    def method(res:X) = res.open
    method(new { def open = { println("yoyooo")}})


  }

  //只要传入对象中有 open 方法
  def init(res:{ def open:Unit}): Unit ={
    res.open
  }

}
