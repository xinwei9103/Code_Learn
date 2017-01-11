package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 9/26/2016.
  */
object TraitOps {
  def main(args: Array[String]) {
    //混入trait
    /*
    val logger = new ConcreteLogger with TraitLogger
    logger.print()
    */
    /*
    val pianoTeacher = new PianoTeacher("xinwei")
    pianoTeacher.teach
    pianoTeacher.playPiano

    //匿名类
    val human = new Human("xinwei") with TTeacher with PianoPlayer{
      override def teach: Unit = println("teaching")
    }
    */

    //AOP 混入
   // val work = new Work with AAction
    //work.doAction
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

class Human private{
  println("Human")
  private var name:String = _
  def this(name:String) {
    this
    this.name =name
  }
  def printName(): Unit ={
    println(name)
  }
}

trait TTeacher extends Human{
  println("TTeacher")
  def teach
}

trait PianoPlayer extends Human{
  println("PianoPlayer")
  def playPiano: Unit ={
    println("play piano")
  }
}
//由左向右按顺序构建
class PianoTeacher(name:String) extends Human(name) with TTeacher with PianoPlayer{
  println("PianoTeacher")
  override def teach: Unit ={
    println("teaching")
  }
}

//AOP
trait Action{
  def doAction
}

trait AAction extends Action{
  abstract override def doAction: Unit ={
    println("before")
    super.doAction
    println("after")
  }
}

class Work extends Action{
  override def doAction: Unit = println("action")
}

