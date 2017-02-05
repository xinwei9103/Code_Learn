package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 10/26/2016.
  */

//用于消息传递和模式匹配
object CaseClass_CaseObject {

  abstract class Person

  case class Student(age: Int) extends Person

  case class Worker(age: Int, salary: Double) extends Person

  //单例
  case object Shared extends Person

  def caseOps(person: Person): Unit = {
    person match {
      case Student(age) => println("student " + age)
      case Worker(age, salary) => println("worker " + age + " " + salary)
      case Shared => println("shared")
    }
  }

  //嵌套的case class
  abstract class Item

  case class Book(description: String, price: Double) extends Item

  case class Bundle(description: String, price: Double, items: Item*) extends Item

  def caseclass_nested(item: Item): Unit = {
    item match {
        /*
      case Bundle(_, _, Book(desc, _), _*) => {
        println("book " + desc)
      }
      */
      case Bundle(_,_,art @ Book(_,_),_*)=>{
        println("art " + art.description+ " " + art.price)
    }
      case _ => {
        println("ops!")
      }
    }
  }

  def main(args: Array[String]) {
    //caseOps(Student(19))
    //caseOps(Worker(1, 1.1))
    //caseOps(Shared)
    caseclass_nested(Bundle("xinwei",1.1,Book("book1",1.2)))

  }
}
