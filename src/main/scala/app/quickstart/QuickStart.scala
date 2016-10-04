package app.quickstart

import ng.macros.Component
import scalatags.Text.all._
import ng.ngScalaTags._

@Component(
  "selector" -> "quickstart",

  "template" ->
      div(
        "hello world"
      ).toString
)
class QuickStart {

}
