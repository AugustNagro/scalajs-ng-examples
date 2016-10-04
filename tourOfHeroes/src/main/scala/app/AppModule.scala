package app

import ng.forms.FormsModule
import ng.http.HttpModule
import ng.macros.{NgModule, _}
import ng.platformBrowser.BrowserModule

@NgModule(
  "imports" -> @@(classOf[BrowserModule],
                  classOf[FormsModule],
                  classOf[HttpModule],
                  BaseRoutes.routing),
  

  "declarations" -> @@(classOf[AppComponent],
                       classOf[DashboardComponent],
                       classOf[HeroDetailComponent],
                       classOf[HeroesComponent]),


  "providers" -> @@(classOf[HeroService]),


  "bootstrap" -> @@(classOf[AppComponent])
)
class AppModule
