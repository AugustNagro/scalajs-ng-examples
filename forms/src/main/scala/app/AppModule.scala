package app

import ng.forms.FormsModule
import ng.macros._
import ng.platformBrowser.BrowserModule

@NgModule(
  "imports" -> @@(classOf[BrowserModule], classOf[FormsModule]),
  "declarations" -> @@(classOf[AppComponent], classOf[HeroFormComponent]),
  "bootstrap" -> @@(classOf[AppComponent])
)
class AppModule {

}
