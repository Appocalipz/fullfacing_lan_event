
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="assets/stylesheets/index.css">
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
        <title>FullFacing - Lan Event</title>
    </head>
    <body>
        <div class="content-container">
            <h2>Stuff and Thangs:</h2>
            <div class="">DC ++ Server : <font color="#00ff00">Online : 192.168.23.93</font></div>
            <div class="">Teamspeak Server : <font color="#00ff00">Online : 192.168.23.93</font></div>
            <div class="">Call of Duty 4 Server : <font color="#00ff00">Online : 192.168.23.93</font></div>
            <div class="">Unreal Tournament Server : <font color="#ff0000">Offline</font></div>
            <div class="">Counter Strike Source Server : <font color="#ff0000">Offline</font></div>
            <div class="">Quake 3 Server : <font color="#ff0000">Offline</font></div>
            <div class="">Dota 2 Server : <font color="#ff0000">Offline</font></div>
        </div>
        <div class="content-container-call-of-duty-4">
            <h2>Call of Duty 4 Serials:</h2>
            <div class="cod-4-serials">
                <a href="https://www.youtube.com/watch?v=bBWt9_acw_o" target="_blank"><font color="yellow">Call of Duty 4 Keygen : Youtube</font></a>
            </div>
        </div>
    </body>
</html>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Dec 15 17:25:46 SAST 2015
                  SOURCE: /Users/melcomvaneeden/Desktop/LAN_Site/app/views/index.scala.html
                  HASH: 06bcdc1a22b40876720edf3809c4f53d6ce15d2e
                  MATRIX: 609->0
                  LINES: 25->1
                  -- GENERATED --
              */
          