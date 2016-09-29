package com.xinwei.scala.foundation

/**
  * Created by xinwei on 9/28/2016.
  */
object PartialAppliedFunction {
  def main(args: Array[String]) {
    val data = List(1,2,3,4,5,6)
    data.foreach(println _)
    data.foreach(println)

    def sum(a:Int,b:Int,c:Int):Int ={
      a+b+c
    }

    val fun1 = sum _

    println(fun1(1,2,3))
    //其实是在apply中调用sum
    println(fun1.apply(1,2,3))
    //偏函数 传递不同参数 变成另一个函数
    val fun2 = sum(1,_:Int,3)

    println(fun2(10))
  }

}
