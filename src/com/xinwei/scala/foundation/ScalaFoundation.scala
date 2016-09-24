package com.xinwei.scala.foundation

/**
  * Created by xinwei on 9/19/2016.
  */
object ScalaFoundation {
  def main(args: Array[String]) : Unit = {
    /*
    println("hello scala!")
    //System.out.println("hello xinwei")
    for(arg <- args){
      println(arg)
    }
    */
    //doWhile()
    val file = if(!args.isEmpty) args(0) else "scala.txt"
    println(file)

    for(i <- 1.to(10)){
      println(i)
    }

    for(i <- 1 to 10 ){
      println(i)
    }
  }
  def doWhile(): Unit ={
    var line = ""
    do{
      line = readLine()
      println(line)
    }while(line.toLowerCase()!="exit")

  }

  def looper(x:Long,y:Long): Long ={
    x+y
  }



}
