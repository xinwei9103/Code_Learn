package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 9/24/2016.
  */
object Abstract {

  def main(args: Array[String]) {
    val teacher = new MathTeacher("xinwei")
    teacher.teach
  }

}
//默认val
abstract class AbstractTeacher(val name:String){
  //抽象类的抽象字段
  var id:Int
  var age:Int
  //抽象类的抽象方法
  def teach
}

class MathTeacher(name:String) extends  AbstractTeacher(name){
  override var id: Int = name.hashCode

  //抽象类的抽象方法
  override def teach: Unit ={
    println("Teaching")
  }

  override var age: Int = 20
}
