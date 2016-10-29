package com.xinwei.scala.foundation

import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
  * Created by xinwei on 10/29/2016.
  */
object Set_Map_TreeSet_TreeMap {

  def main(args: Array[String]) {

    //可变Set Map
    //生成空Set
    //判断两个元素是否相等 order接口
    val data = mutable.Set.empty[Int]
    data ++= List(1,2,3,3)
    data += 4
    println(data)
    data --= List(1,2)
    println(data)
    data.clear()
    println(data)

    val map = mutable.Map.empty[String,String]
    map("Java") = "Hadoop"
    map("Scala") = "Spark"
    println(map)
    println(map("Java"))

    val treeSet = mutable.TreeSet(1,2,3,8,3,2,5,1,7)
    println(treeSet)

    val treeMap = TreeMap("scala"->"spark","java"->"hadoop")
    println(treeMap)

  }

}
