package app

import ng.macros.Component
import ng.ngScalaTags._
import rxscalajs.Observable

import scala.scalajs
import scala.scalajs.js
import scalatags.Text.all._

@Component(
  "selector" -> "hero-form",
  "templateUrl" -> "hero-form.component.html"
)
class HeroFormComponent {

  val powers =
    js.Array("Really Smart", "Super Flexible", "Super Hot", "Weather Changer")

  var model = Hero(18, "Dr IQ", powers(0), Some("Chuck Overstreet"))

  var submitted = false

  def onSubmit() = submitted = true

  var active = true

  // Reset the form with a new hero AND restore 'pristine' class state
  // by toggling 'active' flag which causes the form
  // to be removed/re-added in a tick via NgIf
  // TODO: Workaround until NgForm has a reset method (#6822)
  def newHero(): Unit = {
    model = Hero(42, "", "")
    active = false
    Observable.interval(0).take(1).subscribe(_ => active = true)
  }

}
