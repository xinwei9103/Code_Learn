package com.xinwei.scala.foundation_video

import scala.collection.immutable.Queue
import scala.collection.{immutable, mutable}
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * Created by xinwei on 10/29/2016.
  */
object ListBuffer_ArrayBuffer_Queue_Stack {
  def main(args: Array[String]) {
    val listBuffer = new ListBuffer[Int]
    listBuffer+=1
    println(listBuffer)

    val arrayBuffer = new ArrayBuffer[Int]
    arrayBuffer+=2
    println(arrayBuffer)

    //不可变Queue
    val queue = immutable.Queue[Int]()
    val queue1=queue.enqueue(1)
    val queue2 = queue1.enqueue(List(2,3,4,5))
    println(queue2)

    val (first,left) = queue2.dequeue
    println(first+"::"+left)

    //可变Queue
    val q = mutable.Queue[String]()
    q+="a"
    q++=List("b","c")
    println(q)
    println(q.dequeue())
    println(q)
    //可变
    val stack = mutable.Stack[Int]()
    stack.push(1)
    stack.push(1,2,3)
    println(stack)
    println(stack.pop())
    println(stack)







  }



}
