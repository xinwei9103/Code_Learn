package com.xinwei.scala.foundation

/**
  * Created by xinwei on 9/26/2016.
  */
object Trait {
  def main(args: Array[String]) {
    //混入trait
    val logger = new ConcreteLogger with TraitLogger
    logger.print()

  }


}

//可以有具体方法
trait  Logger{
  def log (msg:String)

  def print(): Unit ={
    println("log")
  }

}

trait Log{

}

//第一个必须是extends
class ConcreteLogger extends Logger with Log{
  override def log(msg: String): Unit ={
    println(msg)
  }
}

trait TraitLogger extends Logger{

  override def print(): Unit = {
    println("trait logger")
  }
}