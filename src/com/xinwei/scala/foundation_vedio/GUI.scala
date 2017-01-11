package com.xinwei.scala.foundation_vedio

import scala.actors.Actor
import scala.swing._
import scala.swing.event.ButtonClicked

/**
  * Created by xinwei on 11/9/2016.
  */
object GUI extends SimpleSwingApplication{
  //匿名类
  /*
  override def top: Frame = new MainFrame(){
    title = "Hello GUI"
    contents = new Button {
      text = "Scala spark"
    }
  }
  */
  override def top: Frame = new MainFrame(){
    title = "Second GUI"
    val button = new Button(){
      text = "Scala"
    }
    val label = new Label(){
      text = "0"
    }
    contents = new BoxPanel(Orientation.Vertical){
      contents+= button
      contents+= label
      border = Swing.EmptyBorder(50,50,50,50)
    }
    listenTo(button)
    var clicks = 0
    val mainActor = Actor.self
    reactions += {
      case ButtonClicked(button) => {
        clicks +=1
        mainActor ! clicks
      }
    }
    /*
    Actor.self.receive{
      case num:Int =>
        label.text = num.toString
    }
    */

  }
}
