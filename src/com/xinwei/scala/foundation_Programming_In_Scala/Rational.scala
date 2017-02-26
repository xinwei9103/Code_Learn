package com.xinwei.scala.foundation_Programming_In_Scala

/**
  * Created by xinwei on 1/11/2017.
  */
class Rational(n:Int, d:Int) {
  require(d!=0)

  private val g:Int = gcd(n.abs,d.abs)

  val numer:Int = n/g
  val denom:Int = d/g

  def this(n:Int) = {
    this(n,1)
  }

  override def toString: String = {
    if(denom!=1) {
      s"$numer/$denom"
    }else{
      s"$numer"
    }
  }

  def add(that:Rational):Rational = {
    new Rational(this.denom*that.numer+this.numer*that.denom,that.denom*this.denom)
  }

  def add(i:Int):Rational = {
    add(new Rational(i))
  }

  def + (that:Rational):Rational = {
    add(that)
  }

  def + (i:Int): Rational ={
    add(i)
  }

  private def gcd(a:Int, b:Int):Int = {
    if(b==0) a else gcd(b,a%b)
  }

}


object Rational{
  implicit def intToRational(x: Int) = new Rational(x)
  def main(args: Array[String]): Unit = {

    val test = new Rational(1,2)
    val res=test + new Rational(1,4)
    println(res)

    import Rational.intToRational

    println(2 + test)

  }
}