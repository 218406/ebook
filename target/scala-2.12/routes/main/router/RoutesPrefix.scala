// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/luke/Desktop/bbbb/books/conf/routes
// @DATE:Mon May 28 14:16:46 CEST 2018


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
