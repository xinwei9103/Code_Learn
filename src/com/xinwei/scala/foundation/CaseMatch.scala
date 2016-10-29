package com.xinwei.scala.foundation

/**
  * Created by xinwei on 10/3/2016.
  */
object CaseMatch {

  def main(args: Array[String]) {

    val data = 30
    //必须有默认case 否则报错
    data match {
      case 1 => println("first")
      case 2 => println("second")
      case _ => println("others")
    }

    val result = data match {
      case i if i==1 => "first"
      case number if number == 2 => "second"
      case _ => "other"
    }

    //println(result)

    //match_array(Array(1))

    match_list(List(1))


  }

  //匹配不同类型
  def match_type(t:Any) ={
    t match {
      case p : Int => println("Int")
      case p : String => println("String")
      case m: Map[_,_] => m.foreach(println)
      case _ => println("other")
    }
  }

  //数组匹配
  def match_array(arr:Any) ={
    arr match{
      case Array(0) => println("array0")
      case Array(x,y) => println("array "+x+" "+y)
      case Array(0,_*) => println("arrays")
      case _ => println("other")
    }
  }

  //list 匹配
  def match_list(list:Any)={
    list match {
      case 0 :: Nil => println("list0")
      case x :: y :: Nil => println("list2")
      case 0 :: tail => println("list...")
    }
  }

  //tuple 匹配
  def match_tuple(tuple:Any) = {
    tuple match {
      case (0, _) => println("tuple0")
      case (x, 0) => println("tuple " + x)
    }
  }


}
