package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 11/1/2016.
  */

object Log1{
  def >>: (data:String) : this.type = {
    println(data)
    this
  }
}

class Infix[A,B]

object Infix_Type {


  def main(args: Array[String]): Unit = {
    //从右往左结合
    "Hadoop" >>: "Spark" >>: Log1

    val list = "A"::"B":: List()
    println(list)

    val infix: Int Infix String = null
    //相等
    val infix2:Infix[Int,String] = null

    case class Cons(first:String,second:String)
    val case_class = Cons("1","2")
    case_class match {
      case "1" Cons "2"  =>{
        println("!")
      }
    }

  }
}
