package com.xinwei.scala.foundation_vedio

import scala.actors.Actor

/**
  * Created by xinwei on 11/8/2016.
  */




object First_Actor {
   private var step = 0
}
//Scala 线程 Actor
class First_Actor extends Actor {

  override def act(): Unit = {
    Actor.receive {
      case msg => println("receive: "+msg)
    }
    /*
    First_Actor.step+=1
    println("step"+ First_Actor.step)

    for (i <- 1.to(10)){
      println(Thread.currentThread().getName+"::"+i)
      Thread.sleep(2000)
    }
    */

  }
}

case class Person2(name:String,age:Int)


object Actor_Ops {

  def main(args: Array[String]): Unit = {

    //val a = new First_Actor().start()

    //向a发送消息
    //a ! "hadoop"

    /*
    Thread.sleep(2000)
    new First_Actor().start()
    */
    //匿名Actor
    val actor_Message  = Actor.actor{
      while(true){
        //阻塞
        Actor.receive { //apply isDefinedAt查看是否能够处理
          //模式匹配
          case msg:Double => println("double: "+msg)
          case p:Person2=> {
            println(p.name+"::"+p.age)
            //给发送者发送消息
            Actor.sender ! "Echo!"
          }
            //无默认并不会报异常 无法匹配会忽略
          case _ => println("other")
        }
      }
    }


    actor_Message ! 3.14

    actor_Message ! "xinwei"

    actor_Message ! new Person2("xinwei",23)

    //main 也可以接受收据
    Actor.self.receive{
      case msg => println(msg)
    }

    //指定超时时间 不会一直阻塞
    //Actor.self.receiveWithin(1000){ case msg => println(msg)}



  }

}
