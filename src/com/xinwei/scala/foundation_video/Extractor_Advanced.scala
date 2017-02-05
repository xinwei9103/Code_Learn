package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 11/13/2016.
  */

object :> {
  def unapply[A](list:List[A]) = {
    Some((list.init,list.last))
  }
}

object Extractor_Advanced {
  def main(args: Array[String]): Unit = {

    (1.to(9)).toList match {case _ :>8:> 9 => println("1")}


  }
}
