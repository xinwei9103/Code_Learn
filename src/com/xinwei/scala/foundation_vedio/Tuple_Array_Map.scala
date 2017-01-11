package com.xinwei.scala.foundation_vedio

import scala.io.Source

/**
  * Created by xinwei on 9/19/2016.
  */
object Tuple_Array_Map {

  def main(args: Array[String]) {
    //元组
    /*
    val triple = (100,"xinwei","spark")
    println(triple._1)
    println(triple._2)
    println(triple._3)
    */
    //数组
    /*
    val array = Array(1,2,3,4,5)
    for(i <- 0 until array.length){
      println(array(i))
    }
    */
    //Map
    /*
    val ages = Map("xinwei"->26,"wei"->27)
    for((k,v)<- ages){
      println(k+":"+v)
    }
    for((k,_)<-ages){
      println(k)
    }
    */
    //获取文件
    //Source.fromFile("")

    //测试获取包对象的成员
    //println(packageName)
  }

}
