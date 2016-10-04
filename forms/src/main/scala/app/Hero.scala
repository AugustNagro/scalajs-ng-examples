package app

import scala.scalajs
import scala.scalajs.js

@js.native
trait Hero extends js.Object {
  val id: Int = js.native
  val name: String = js.native
  val power: String = js.native
  val alterEgo: String = js.native
}

object Hero {
  def apply(id: Int, name: String, power: String, alterEgo: Option[String] = None): Hero = {
    val hero = js.Dynamic.literal(id = id, name = name, power = power)
    if(alterEgo.isDefined) hero.alterEgo = alterEgo.get
    hero.asInstanceOf[Hero]
  }
}
