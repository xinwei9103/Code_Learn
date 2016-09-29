package com.xinwei.scala.foundation

import scala.io.Source

/**
  * Created by xinwei on 9/28/2016.
  */
object LocalMethod {

  def main(args: Array[String]) {
    processData("tempFile/myFile.txt",11)
  }


  def processData(fileName:String,width:Int): Unit ={
    //local method 外部不可见
    def processLine(line:String): Unit ={
      if(line.length>width) println(fileName+":"+line)
    }
    val file =Source.fromFile(fileName)
    for(line<-file.getLines()){
      processLine(line)
    }
  }

}
