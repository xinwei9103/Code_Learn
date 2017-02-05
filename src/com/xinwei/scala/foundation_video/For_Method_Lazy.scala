package com.xinwei.scala.foundation_video

/**
  * Created by xinwei on 9/20/2016.
  */
object For_Method_Lazy {

  def main(args: Array[String]) {

    //双重for循环
    //for(i<- 1 to 2;j <- 1 to 2) print(i+j+" ")

    //条件判断 for 循环
    //for(i<- 1 to 2;j<- 1 to 2 if i==j) print(i+j+" ")

    //匿名函数 函数有值
    /*
    val add1 = (x:Int) => x+200
    def add(x:Int): Int = x+100
    println(add(2))
    println(add1(2))
    */

    //递归调用函数必须制定函数返回值类型
    /*
    def fac(n:Int):Int = if(n<=0) 1 else n*fac(n-1)
    println(fac(5))
    */

    //默认参数
    /*
    def combine(content:String, left:String="[",right:String="]"): String ={
      left+content+right
    }
    println(combine("xinwei"))
    println(combine("xinwei","(",")"))
    */

    //可变参数
    /*
    def sum(arg:Int*): Int ={
      var s=0;
      for(i<-arg){
        s+=i
      }
      s
    }
    println(sum(1,2,3,4,5))
    */

    //lazy 延时执行

  }




}
