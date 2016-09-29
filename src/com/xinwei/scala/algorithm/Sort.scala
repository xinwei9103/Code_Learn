package com.xinwei.scala.algorithm

/**
  * Created by xinwei on 9/26/2016.
  */
object Sort {

  def main(args: Array[String]) {
    var arr = Array(4, 7, 2, 1, 10, 20, 5, 6, 7, 7, 1, 1, 1)
    arr = MergeSort(arr)
    for (i <- arr) {
      print(i + " ")
    }
  }

  def MergeSort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) {
      return arr
    }
    val length = arr.length / 2
    var arr1 = new Array[Int](length)
    var arr2 = new Array[Int](arr.length - length)
    var i = 0
    while (i < length) {
      arr1(i) = arr(i)
      i += 1
    }
    while (i < arr.length) {
      arr2(i - length) = arr(i)
      i += 1
    }
    arr1 = MergeSort(arr1)
    arr2 = MergeSort(arr2)
    Merge(arr1, arr2)

  }

  private def Merge(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val res = new Array[Int](arr1.length + arr2.length)
    var i = 0
    var j = 0
    var k = 0
    while (i < arr1.length && j < arr2.length) {
      if (arr1(i) <= arr2(j)) {
        res(k) = arr1(i)
        i += 1
        k += 1
      } else {
        res(k) = arr2(j)
        j += 1
        k += 1
      }
    }
    while (i < arr1.length) {
      res(k) = arr1(i)
      i += 1
      k += 1
    }
    while (j < arr2.length) {
      res(k) = arr2(j)
      j += 1
      k += 1
    }
    res
  }

}
