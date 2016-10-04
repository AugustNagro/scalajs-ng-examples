package app

import ng.macros.Component
import scalatags.Text.all._
import ng.ngScalaTags._

@Component(
    "selector" -> "my-app",
    "template" ->
      div(
        h1("{{title}}"),
        tag("nav")(
          routerLink("/dashboard")("Dashboard "),
          routerLink("/heroes")("Heroes")
        ),
        routerOutlet
      ).toString
  )
class AppComponent {
  val title = "Tour of Heroes"
}
