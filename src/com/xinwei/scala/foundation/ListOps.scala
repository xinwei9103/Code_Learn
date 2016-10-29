package com.xinwei.scala.foundation

/**
  * Created by xinwei on 10/28/2016.
  */
object ListOps {

  def main(args: Array[String]) {
    //List 内部必须是同一类型
    val bigData = List("Hadoop", "Spark","Kaffka")

    val bigDataCore = "Hadoop" :: ("Spark" :: Nil)
    //元素与列表连接
    val dataInt = 1 :: 2 :: 3 :: Nil

    println(dataInt.isEmpty)
    println(dataInt.head)
    println(dataInt.tail.head)

    val List(a, b,c) = bigData
    println(a + "::" + b)

    val x :: y :: rest = dataInt
    println(x + "::" + y + "::" + rest)

    def compute(data: Int, list: List[Int]): List[Int] = {
      list match {
        case List() => List(data)
        case head :: tail => {
          if (data > head) {
            head :: compute(data, tail)
          } else {
            data :: list
          }
        }
      }
    }

    //macth sort 算法
    def sortList(list: List[Int]): List[Int] = {
      list match {
        case List() => list
        case head :: tail => {
          compute(head, sortList(tail))
        }
      }
    }
    val list = List(6,3,5,6,2,9,1)
    println(sortList(list))

    //拼接List
    println(List(1,2,3,4):::List(2,3,4,5))

    println(bigData.length)
    println(bigData.last)
    //不包括最后一个元素的新列表
    println(bigData.init)
    println(bigData.reverse)
    println(bigData take 2)
    println(bigData.drop(1))
    println(bigData.splitAt(1))
    println(bigData(2))


    val data = List('a','b','c','d','e')
    println(data.indices)
    println(data.indices.zip(data))
    println(data.zipWithIndex)
    println(data.toString())
    println(data.mkString("[",",","]"))

    val buffer = new StringBuilder
    data addString(buffer, "(", ",,", ")")
    println(buffer)



    val iterator = data.toIterator
    println(iterator.next())

    val array =new Array[Char](10)
    //从Array的第x位开始copy
    data.copyToArray(array,8)
    array.foreach(print)

    //map flatMap
    println(List(1,2,3,4,5).map(_+1))
    println(bigData.map(_.length))
    println(bigData.map(_.toList.reverse.mkString))
    println(bigData.map(_.toList))
    println(bigData.flatMap(_.toList))
    println(List.range(1,10).flatMap(i => List.range(1,i).map(j=>(i,j))))

    var sum=0
    List(1,2,3,4,5).foreach(sum+=_)
    println(sum)

    println(List(1,2,3,4,5,6).filter(_%2==0))

    //构成两个list
    println(List(1,2,3,4,5,6).partition(_%2==0))

    println(List(1,2,3,4,5,6).find(_%2==0))
    println(List(1,2,3,4,5,6).takeWhile(_<4))
    println(List(1,2,3,4,5,6).dropWhile(_<4))
    //把元素分成两部分
    println(List(1,2,3,4,5,6).span(_<4))

    //exists 其中有一个满足返回true     forall 所有元素满足返回true
    def hasTotallyZeroRow(m:List[List[Int]]) = m.exists(row=>row.forall(_==0))
    val m = List(List(2,0,0),List(0,1,0),List(0,0,0))
    println(hasTotallyZeroRow(m))

    //foldLeft foldRight
    println((1.to(100).foldLeft(0)((x,y)=>x+y)))
    //符号定义函数 看源码
    println((0 /: 1.to(100))(_+_))
    //op 左边是list中的值 右边是result
    println(1.to(5).foldRight(100)(_-_))
    //sort
    println(List(1,-3,4,2,6).sortWith(_<_))
    println(List(1,-3,4,2,6).sortWith(_>_))

    //伴生对象
    println(List.make(2,5))
    println(List.range(1,5))
    println(List.range(9,1,-3))
    val zipped = "abcde".toList.zip(List(1,2,3,4,5))
    println(zipped)
    println(zipped.unzip)
    println(List(List(1,2,3),List(4,5),List(6)).flatten)
    println(List.concat(List(1,2,3),List(4,5),List(6)))
    println(List.map2(List(10,20),List(10,10))(_*_))



  }




}
