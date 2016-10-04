package app

import app.quickstart.QuickStartModule
import ng.macros.NgModule
import ng.macros._

@NgModule(
  "imports" -> @@(classOf[QuickStartModule]),

  "declarations" -> @@(classOf[AppComponent]),

  "providers" -> @@(),

  "bootstrap" -> @@(classOf[AppComponent])
)
class AppModule {

}
