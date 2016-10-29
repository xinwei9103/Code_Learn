package com.xinwei.scala.foundation

/**
  * Created by xinwei on 10/28/2016.
  */
object Option_Internal {

  //Some None 继承Option 是 case class
  def main(args: Array[String]) {

    val scores = Map("Spark"->99,"Scala"-> 70)

    scores.get("Scala") match {
      case Some(score)=> println(score)
      case None => println("None")
    }

  }

}
