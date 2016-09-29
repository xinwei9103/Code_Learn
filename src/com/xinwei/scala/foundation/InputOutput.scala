package com.xinwei.scala.foundation

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by xinwei on 9/26/2016.
  */
object InputOutput {

  def main(args: Array[String]) {
    //返回迭代器
    val file = Source.fromFile("tempFile/myFile.txt")
    for(line <- file.getLines()){
      println(line)
    }
    file.close()
    /*
    val writer = new PrintWriter("tempFile/scala.txt")

    for(i<-1 to 100){
      writer.println(i)
    }
    writer.close()
    */
    var s = Console.readLine()
    println(s)
  }
  Math.random()

}
