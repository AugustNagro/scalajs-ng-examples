package app

import ng.macros.NgModule
import ng.macros._
import ng.router.{Route, RouterModule, Routes}

@NgModule(
  "imports" -> @@(
    RouterModule.forRoot(
      Routes(
        Route(path = "", redirectTo = "/dashboard", pathMatch = "full"),
        Route(path = "dashboard", component = classOf[DashboardComponent]),
        Route(path = "detail/:id", component = classOf[HeroDetailComponent]),
        Route(path = "heroes", component = classOf[HeroesComponent])
      )
    )),
  "exports" -> @@(RouterModule)
)
class AppRoutingModule {}
