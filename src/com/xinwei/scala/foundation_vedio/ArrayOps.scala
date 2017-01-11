package com.xinwei.scala.foundation_vedio

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
  * Created by xinwei on 9/20/2016.
  */
object ArrayOps {
    def main(args: Array[String]) {
      //定長數組
      val nums = new Array[Int](10)
      val strs = Array("Scala","Spark","xinwei")

      //變長數組
      val list = ArrayBuffer[Int]()

      //Append
      list += 1
      list +=(1,2,3,4,5)
      list ++= Array(1,2,3)

      //删
      list.trimEnd(3)
      list.trimStart(1)

      //insert
      list.insert(1,6)
      list.insert(1,3,3,3)

      //remove
      list.remove(1)
      list.remove(1,3)

      //toArray
      val c = list.toArray

      //遍歷 操作 yield
      //for(i<-0 until list.length) println(list(i))
      val result1 = for(i<-c) yield 2*i
      val result2 = for(i<- c if i%2==0) yield 2*i
      val result3 = c.filter(_%2==0).map(_*3)
      //for(i<- result3) println(i)

      //sum max sort
      /*
      println(c.sum)
      println(strs.max)
      */
      val d = Array(10,4,5,9)
      //返回新的数组
      val sortedd=d.sorted
      //在原有数组基础上
      Sorting.quickSort(d)
      //for(i<- d) println(i)

      //matrix
      val matrix = Array.ofDim[Double](3,4)
      matrix(0)(2)=42
      //println(matrix(0)(2))
  }


}
