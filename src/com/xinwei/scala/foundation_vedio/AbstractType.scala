package com.xinwei.scala.foundation_vedio

import scala.io.{BufferedSource, Source}

/**
  * Created by xinwei on 11/6/2016.
  */


trait Reader{
  //抽象类型 可以加类型限制
  type In <: java.io.Serializable
  type Contents
  def read(in:In) : Contents

}

class FileReader extends Reader{
  override type In = String
  override type Contents = BufferedSource

  override def read(in: String):BufferedSource = Source.fromFile(in)
}

object AbstractType {

}
