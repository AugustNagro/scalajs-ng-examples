package app

import ng.macros.Component
import scalatags.Text.all._

@Component(
  "selector" -> "my-app",
  "template" -> h1("My First Angular App").toString()
)
class AppComponent {

}
