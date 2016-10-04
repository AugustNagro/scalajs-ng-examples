package app

import ng.core.OnInit
import ng.http.Link
import ng.macros.Component
import ng.router.Router

import scala.scalajs.js
import scalatags.Text.all._
import ng.ngScalaTags._

@Component(
  "selector" -> "my-dashboard",
  "template" ->
    div(
      h3("Top Heroes"),
      div(ngFor("let hero of heroes"), ngOn(onclick):="gotoDetail(hero)")(
        h4("{{hero.name}}")
      )
    ).toString

)
class DashboardComponent(router: Router, heroService: HeroService) extends OnInit {

  var heroes: js.Array[Hero] = _

  def ngOnInit(): Unit = {
    heroService.getHeroes().subscribe(heroes = _)
  }

  def gotoDetail(hero: Hero): Unit = {
    router.navigate(Link("/detail", hero.id))
  }
}
