package app

import ng.common.Location
import ng.core.OnInit
import ng.macros.Component
import ng.router.ActivatedRoute
import org.scalajs.dom
import ng.ngScalaTags._

import scalatags.Text.all._

@Component(
  "selector" -> "my-hero-detail",
  "template" ->
      div(ngIf("hero"))(
        h2("{{hero.name}}"),
        div(label("id: "), "{{hero.id}}"),
        div(
          label("name: "),
          input(ngBindOn("ngModel"):="hero.name", placeholder:="name")
        ),
        button(ngOn(onclick):="goBack()")("Back"),
        button(ngOn(onclick):="save()")("Save")
      ).toString

)
class HeroDetailComponent(heroService: HeroService, route: ActivatedRoute, location: Location) extends OnInit {

  var hero: Hero = _

  def ngOnInit(): Unit = {
    //TODO Should be working with observables directly
    val idString = route.params._value.id
    val id = idString.asInstanceOf[String].toInt
    heroService.getHero(id).subscribe(hero = _)
  }

  def save(): Unit = {
    heroService.update(hero).subscribe(_ => goBack())
  }

  def goBack(): Unit = {
    location.back()
  }

}
