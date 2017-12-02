
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jaricsng/dev/github/jaricsng/playframework/samples/starter/play-javaapp/conf/routes
// @DATE:Sat Dec 02 10:17:15 SGT 2017


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
