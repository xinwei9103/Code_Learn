package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 9/28/2016.
  */
object RegExpress {

  def main(args: Array[String]) {
    //String.r
    val regExpress = """([0-9]+) ([a-z]+)""".r
    val numPattern = """\s+[0-9]+\s+""".r
    for(matchString <- numPattern.findAllMatchIn(" 999 , sss , 132 , qweqr") ) println(matchString)
    println(numPattern.findFirstMatchIn(" 999 , sss , 132 , qweqr"))

    val line ="999 sss"
    //模式匹配
    line match {
        case regExpress(num,block) => println(num+"::"+block)
        case _ => println("no")
    }
  }

}
