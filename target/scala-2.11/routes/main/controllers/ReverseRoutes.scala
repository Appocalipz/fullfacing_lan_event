
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/melcomvaneeden/Desktop/LAN_Site/conf/routes
// @DATE:Tue Dec 15 16:53:15 SAST 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:3
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:2
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(payload:Option[String] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + queryString(List(if(payload == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("payload", payload)))))
    }
  
  }


}