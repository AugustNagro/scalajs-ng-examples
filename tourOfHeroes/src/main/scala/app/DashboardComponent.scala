package app

import ng.core.OnInit
import ng.http.Link
import ng.macros.Component
import ng.router.Router

import scala.scalajs.js
import scalatags.Text.all._
import ng.ngScalaTags._
import ng.macros._

@Component(
  "selector" -> "my-dashboard",
  "template" ->
    div(
      h3("Top Heroes"),
      div(`class` := "grid grid-pad")(
        div(ngFor("let hero of heroes"),
            ngOn(onclick) := "gotoDetail(hero)",
            `class` := "col-1-4")(
          div(`class` := "module hero")(
            h4("{{hero.name}}")
          )
        )
      )
    ).toString,
  "styleUrls" -> @@("dashboard.componenet.css")
)
class DashboardComponent(router: Router, heroService: HeroService)
    extends OnInit {

  var heroes: js.Array[Hero] = _

  def ngOnInit(): Unit = {
    heroService.getHeroes().subscribe(hArray => heroes = hArray.slice(1, 5))
  }

  def gotoDetail(hero: Hero): Unit = {
    val link = Link("/detail", hero.id)
    router.navigate(link)
  }
}
