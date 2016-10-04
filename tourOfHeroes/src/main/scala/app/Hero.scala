package app

import scala.scalajs.js

@js.native
trait Hero extends js.Object {
  val id: Int = js.native
  val name: String = js.native
}
object Hero {
  def apply(id: Int, name: String): Hero = {
    js.Dynamic.literal(id = id, name = name).asInstanceOf[Hero]
  }
}
