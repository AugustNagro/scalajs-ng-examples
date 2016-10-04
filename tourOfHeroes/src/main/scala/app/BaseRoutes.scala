package app

import ng.core.ModuleWithProviders
import ng.macros._
import ng.router.{Route, RouteDeclaration, RouterModule, Routes}

import scala.scalajs.js

object BaseRoutes extends RouteDeclaration {

  private val routes: Routes = js.Array(
    Route("", redirectTo = "/dashboard", pathMatch = "full"),
    Route("dashboard", component = classOf[DashboardComponent]),
    Route("detail/:id", component = classOf[HeroDetailComponent]),
    Route("heroes", component = classOf[HeroesComponent])
  )

  override val routing: ModuleWithProviders = RouterModule.forRoot(routes)

}
