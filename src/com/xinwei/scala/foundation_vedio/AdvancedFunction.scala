package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 9/29/2016.
  */
object AdvancedFunction {
  def main(args: Array[String]) {
    (1 to 9).map("*"*_).foreach(println)

    def fun(f:(Double)=> Double) = f(0.25)
  }

}
