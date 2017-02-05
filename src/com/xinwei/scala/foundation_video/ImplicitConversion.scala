package com.xinwei.scala.foundation_video

import java.io.File

import scala.io.Source

/**
  * Created by xinwei on 11/6/2016.
  */

class RichFile(val file:File){
  def read = Source.fromFile(file.getPath).mkString
}

class File_Implicits(path:String) extends File(path)

object File_Implicits {
  //在伴生对象中定义隐式转换 不用手动导入 编译器可以自动查询
  implicit def file2RichFile(file:File) = new RichFile(file)
}


object Context {
  implicit val default:String = "Java"
  implicit def file2RichFile(file:File) = new RichFile(file)
}

object Param{
  def print(content: String)(implicit language:String): Unit ={
    println(language+":" + content)
  }
}

//自动传入Ordering[T]
class Pair_Implicits[T:Ordering](val first:T,val seocnd:T){
  def bigger(implicit ordered:Ordering[T]) = if (ordered.compare(first,seocnd)>0) first else seocnd
}

class Pair_Implicitly[T:Ordering](val first:T,val seocnd:T){
  def bigger = if (implicitly[Ordering[T]].compare(first,seocnd)>0) first else seocnd
}

//把Ordering[T] 转换成 Ordered[T]
class Pair_Implicit_Ordered[T:Ordering](val first:T,val seocnd:T){
  def bigger = {
    import Ordered._
    if(first>seocnd) first else seocnd
  }
}

object Context_Helper{
  abstract class Template[T] {
    val unit:T
    def add(x:T,y:T) : T

  }

  //隐式类
  implicit class FileEnhancer(file:File){
    def read = Source.fromFile(file.getPath).mkString
  }


  implicit object StringAdd extends Template[String] {
    override val unit: String = ""

    override def add(x: String, y: String): String = x + y
  }
}




object ImplicitConversion {



  def main(args: Array[String]): Unit = {
    //import Context.file2RichFile
    //println(new File("").read)

    /*
    import Context.default
    Param.print("xinwei")("Scala")
    Param.print("xinwei")
    */
    /*
    import Context_Helper._

    //println(new File("").read)

    def sum[T](list:List[T])(implicit m:Template[T]):T = {
      if(list.isEmpty) m.unit
      else m.add(list.head,sum(list.tail))
    }

    println(sum(List("Xinwei"," ","Wang")))
    */

    println(new File_Implicits("").read)

  }

  def bigger[T](a:T,b:T)(implicit ordered: T => Ordered[T]): Unit ={
    if(a>b){
      a
    }else{
      b
    }

  }



}
