package com.xinwei.scala.foundation

import java.awt.event._
import javax.swing.{JButton, JFrame}


/**
  * Created by xinwei on 10/3/2016.
  */
object SAM {
  def main(args: Array[String]) {
    var data =0
    val frame = new JFrame("Test")
    val jButton = new JButton("counter")
    //隐式转换
    implicit def convertedAction(action : (ActionEvent) => Unit): ActionListener = {
      new ActionListener {
        override def actionPerformed(e: ActionEvent): Unit = {
          action(e)
        }
      }
    }
    //用隐式转换函数来转成 ActionListener
    jButton.addActionListener((event:ActionEvent) => {data+=1;println(data)})

    frame.setContentPane(jButton)
    frame.pack()
    frame.setVisible(true)
  }


}
