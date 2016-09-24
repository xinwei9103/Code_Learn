package com.xinwei.scala.foundation

/**
  * Created by xinwei on 9/24/2016.
  */
object Inherit {
  def main(args: Array[String]) {
    val worker = new Worker("xinwei",12,1000)
    println(worker)
  }
}

class Person1(val name:String,private val age:Int){ //private 可以定义
  println("person1")
  val school = "BJU"

  override def toString: String = name +" " +age + " "+school

  def sleep = "8 hours"
}
//不用super关键字 直接填充
class Worker(name :String,age:Int,val salary:Long) extends Person1(name,age){
  println("worker")
  //必须加入override 关键字
  override val school = "UTD"

  override def sleep: String = super.sleep +" 30 min"
}