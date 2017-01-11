package com.xinwei.scala.foundation_vedio

/**
  * Created by xinwei on 11/1/2016.
  */

trait Type1
trait Type2

class Item extends Type1 with Type2

object Compound_Type {

  def compound ( x:Type1 with Type2): Unit ={

  }

  def main(args: Array[String]): Unit = {
    compound(new Item)

    type CompoundType = Type1 with Type2

    def compound_local(x:CompoundType): Unit ={

    }
    compound_local(new Item)

    //结合结构类型
    type Scala = Type1 with Type2 {def open:Unit}

  }



}
