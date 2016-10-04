package app

import ng.macros._
import ng.macros.Bootstrap
import ng.platformBrowserDynamic.PlatformBrowserDynamic

import scala.scalajs.js.JSApp

@Bootstrap
class Launcher extends JSApp {

  def main(): Unit = {
    PlatformBrowserDynamic
      .platformBrowserDynamic()
      .bootstrapModule(classOf[AppModule])
  }

}
