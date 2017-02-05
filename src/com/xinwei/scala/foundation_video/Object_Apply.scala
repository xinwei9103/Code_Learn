package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 9/24/2016.
  */
object Object {
  //object 中所有成员方法都是静态的
  //静态代码只被执行一次
  def main(args: Array[String]) {

    //println(University.addStudent())
    //println(University.addStudent())
    //必须加括号
    val university = University()
    university.print()
    //类的apply
    university()
  }

}

object University {
  private var studentNo = 0
  def addStudent(): Int ={
    studentNo+=1
    studentNo
  }

  def apply(): University ={
    println("apply")
    new University
  }
}
class University{
  //伴生类可访问半生对象所有成员
  var id = University.studentNo

  def print(): Unit ={
    println(id)
  }

  def apply(): Unit ={
    println("class apply")
  }

}

