package app

import ng.core.OnInit
import ng.http.Link
import ng.macros.Component
import ng.router.Router

import scala.scalajs.js
import scalatags.Text.all._
import ng.ngScalaTags._

@Component(
  "selector" -> "my-heroes",
  "template" ->
      div(
        h2("My Heroes"),
        div(
          label("Hero name: "), input(ngRef("heroName")),
          button(ngOn(onclick):="add(heroName.value); heroName.value = ''")(
            "Add"
          )
        ),
        ul(
          li(ngFor("let hero of heroes"), ngOn(onclick):="onSelect(hero)")(
            span("{{hero.id}} "),
            span("{{hero.name}} "),
            button(ngOn(onclick):="delete(hero); $event.stopPropagation()")("x")
          )
        ),
        div(ngIf("selectedHero"))(
          h2("{{selectedHero.name | uppercase}} is my hero"),
          button(ngOn(onclick):="gotoDetail()")("View Details")
        )
      ).toString
)
class HeroesComponent(heroService: HeroService, router: Router)
    extends OnInit {

  var heroes: js.Array[Hero] = _
  var selectedHero: Hero = _

  def getHeroes(): Unit = heroService.getHeroes.subscribe(heroes = _)

  def add(name: String): Unit = {
    val trimmedName = name.trim
    if (!trimmedName.isEmpty){
      heroService.create(trimmedName).subscribe(heroes = _)
    }
  }

  def delete(hero: Hero): Unit = {
    heroService.delete(hero.id).subscribe(hList => {
      if(selectedHero != null && selectedHero.id == hero.id) selectedHero = null
      heroes = hList
    })
  }

  def ngOnInit(): Unit = getHeroes()

  def onSelect(hero: Hero): Unit = {
    selectedHero = hero
  }

  def gotoDetail(): Unit = {
    router.navigate(Link("/detail", selectedHero.id))
  }

}
