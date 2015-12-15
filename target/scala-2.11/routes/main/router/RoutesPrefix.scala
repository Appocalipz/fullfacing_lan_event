
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/melcomvaneeden/Desktop/LAN_Site/conf/routes
// @DATE:Tue Dec 15 16:53:15 SAST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
