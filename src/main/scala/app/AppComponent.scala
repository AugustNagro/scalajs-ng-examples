package app

import ng.macros.Component
import scalatags.Text.all._
import ng.ngScalaTags._

@Component(
  "selector" -> "app",

  "template" ->
      div(display.flex, flexDirection.column, justifyContent.center, alignItems.center)(
        h2("scalajs-ng Examples"),
        routerLink("/quickstart")("Quickstart")
      ).toString
)
class AppComponent {

}
