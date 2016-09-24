package com.xinwei.scala.foundation

import scala.collection.immutable.SortedMap

/**
  * Created by xinwei on 9/20/2016.
  */
object Map_Tuple_Zip_Ops {

  def main(args: Array[String]) {
    //不可修改
    val map = Map("xinwei" -> 25, "wei" -> 26)
    val result1 = for ((k, v) <- map) yield (k, v * 0.9)


    //可修改
    val scores = scala.collection.mutable.Map("Scala" -> 7, "Spark" -> 10)
    val hadoop = scores.getOrElse("Hadoop", 0)
    scores += ("Hadoop" -> 20)
    scores -= ("Scala")
    println(scores)

    //SortedMap
    val sortedMap = SortedMap("y"->5,"a"->6,"b"->7)
    println(sortedMap)

    //Tuple
    val tuple = (1,2,3.14,"xinwei")
    val (first,secoed,third,forth) = tuple

    //zip
    val symbol = Array("[","-","]")
    val counts = Array(1,2,3)
    val result = symbol.zip(counts)
    for((x,y)<- result) println(x+y)
  }

}
