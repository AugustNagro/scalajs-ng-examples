package app

import ng.macros.Bootstrap
import ng.platformBrowserDynamic.PlatformBrowserDynamic

import scala.scalajs.js.JSApp
import ng.macros._

@Bootstrap
object Launcher extends JSApp {
  def main(): Unit = {

    PlatformBrowserDynamic
      .platformBrowserDynamic()
      .bootstrapModule(classOf[AppModule])

  }
}