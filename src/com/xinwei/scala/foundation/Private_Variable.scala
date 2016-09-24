package com.xinwei.scala.foundation

/**
  * Created by xinwei on 9/20/2016.
  */

class Person{
  // 若声明 private则没有 get set 方法
  private var age =10
  def increase(): Unit ={
    age+=1
  }
  def current = age
}

class Student{
  //自动生成 get set 方法 并且是 private
  var age = 10

}

object Private_Variable {
  def main(args: Array[String]) {
    val p = new Person()
    p.increase()
    println(p.current)
    val s = new Student
    //get 方法
    println(s.age)
    //set 方法
    s.age = 113
    println(s.age)
  }
}
