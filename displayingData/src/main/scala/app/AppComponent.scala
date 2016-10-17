package app

import ng.macros.Component
import ng.ngScalaTags._

import scala.scalajs.js
import scalatags.Text.all._

@Component(
  "selector" -> "my-app",
  "template" ->
    div(
      h1("{{title}}"),
      h2("My favorite hero is: {{myHero.name}}"),
      p("Heroes: "),
      ul(
        li(ngFor("let hero of heroes"))(
          "{{hero.name}}"
        )
      ),
      p(ngIf("heroes.length > 3"))("There are many Heroes!")
    ).toString()
)
class AppComponent {
  val title = "Tour of Heroes"

  val heroes = js.Array(
    Hero(1, "Windstorm"),
    Hero(2, "Bombasto"),
    Hero(3, "Magenta"),
    Hero(4, "Tornado")
  )

  val myHero = heroes(0)

}
