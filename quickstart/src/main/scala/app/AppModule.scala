package app

import ng.macros._
import ng.platformBrowser.BrowserModule

@NgModule(
  "imports" -> @@(classOf[BrowserModule]),
  "declarations" -> @@(classOf[AppComponent]),
  "bootstrap" -> @@(classOf[AppComponent])
)
class AppModule {}
