package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 11/6/2016.
  */


class Self{
  //this 的别名
  self=>
  val tmp=0
  def foo = self.tmp+this.tmp
}

class Outer2 {
  //外部类的别名
  outer=>
  val v1 = "spark"
  class inner {
    def p = println(outer.v1)
  }
}

trait S1

class S2 {
  //在实例化S2时 必须混入S1 可以实现依赖注入
  this:S1 =>
}

//子类也必须满足S1
class S3 extends S2 with S1

object SelfType {
  def main(args: Array[String]): Unit = {

  val c = new S2 with S1


  }
}
