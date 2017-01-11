package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 9/24/2016.
  */
object Constructor {
  def main(args: Array[String]) {
    var teacher = new Teacher("xinwei",12,"male")
    //teacher.print()

  }

}
/*
class Teacher(){
  var name :String = _
  private var age = 27
  private[this] val gender = "male"

  def this(name:String){
    //主构造器
    this
    this.name = name
  }

  def print(): Unit ={
    println(this.name+" "+this.age+" "+this.gender)
  }
}
*/

//不能使用默认构造器
class Teacher private(var name:String, var age :Int){
  println("主构造器")
  var gender :String = _
  println(gender)
  def this(name:String, age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }

}
