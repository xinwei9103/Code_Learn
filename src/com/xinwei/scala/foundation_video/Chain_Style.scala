package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 11/1/2016.
  */

class Animal {
  //this.type 会返回当前对象的type 不是 Animal 则可以实现链式编程
  def breathe: this.type ={
    this
  }
}

class Cat extends  Animal {
  def eat : this.type ={
    this
  }
}

object Chain_Style {

  def main(args: Array[String]): Unit = {

  }

}
