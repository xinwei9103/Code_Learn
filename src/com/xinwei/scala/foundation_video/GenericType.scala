package com.xinwei.scala.foundation_video

import java.io.Serializable

import scala.reflect.ClassTag

/**
  * Created by xinwei on 10/30/2016.
  */
object GenericType {
  def foo[A,B](f:A=>List[A],b: A) = f(b)

  //数组本身创建需要具体类型 Manifest可以帮助创建泛型数组 隐式转换实质 TypeTag,ClassTag取代 Manifest
  def arrayMake[T:Manifest](first:T,second:T): Array[T] ={
    val r = new Array[T](2)
    r(0) = first
    r(1) = second
    r
  }

  def manif[T](x:List[T])(implicit m:Manifest[T]) ={
    if(m <:< manifest[String]){
      println("String")
    }else{
      println("other")
    }
  }

  def mkArray[T:ClassTag](elems:T*) = Array[T](elems: _*)

  // A =:= B A类型等于B类型
  // A <:< B A类型是B类型的子类 编译级别
  def rocky[T](i:T)(implicit ev: T <:< java.io.Serializable): Unit ={
    println("Serializable")
  }

  def main(args: Array[String]): Unit = {
    manif(List(1,2))
    manif(List("String","xinwei"))
  }



}

//约束T要实现Comparable接口 <: 上界 Comparable 是 T的上界
// <: Pair(1,2) 会报错
//视图界定 <% 隐式转换成Comparable[T]类型 Int -> RichInt
class Pair[T <% Comparable[T]](val first:T,val second:T){
  def bigger = if(first.compareTo(second)>0) first else second

  // >: T是R的下界
  //def replaceFirst[R >: T](newFirst:R) = new Pair(newFirst,second)
}

//String不是 Ordered 视图界定可以隐式转换 String -> RichString
class Pair_Better[T <% Ordered[T]](val first:T,val second:T){
  def bigger = if(first>=second) first else second
}

//T 中有一个 隐式值 Ordering 包含方法 compare 上下文界定
class Pair_Ordering[T:Ordering](val first:T,val second:T){
  //方法被隐式传入 ordering
  def bigger(implicit ordering: Ordering[T]) = {
    if(ordering.compare(first,second)>0) first else second
  }
}

//ClassTag 可以根据运行时的具体类型给予跟多信息 推导类型
class Triple[F:ClassTag,S,T](val first:F,val second:S,val third:T){

}



