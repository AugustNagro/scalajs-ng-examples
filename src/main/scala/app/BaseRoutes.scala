package app

import app.quickstart.QuickStart
import ng.core.ModuleWithProviders
import ng.router.{Route, RouteDeclaration, RouterModule, Routes}

import scala.scalajs.js
import ng.macros._

object BaseRoutes extends RouteDeclaration {

  private val routes: Routes = js.Array(
    Route(path = "/quickstart", component = classOf[QuickStart]),
    Route(path = "*", component = classOf[AppComponent])
  )

  val routing: ModuleWithProviders = RouterModule.forRoot(routes)

}
