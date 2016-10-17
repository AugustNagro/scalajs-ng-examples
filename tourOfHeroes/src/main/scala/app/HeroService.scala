package app

import ng.http.Http
import ng.macros.Injectable
import rxscalajs.Observable

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@Injectable
class HeroService(http: Http) {

  private var heroes: js.Array[Hero] = js.Array(
    new Hero { val id = 0; val name = "The Comedian" },
    new Hero { val id = 1; val name = "Doctor Manhattan" },
    new Hero { val id = 2; val name = "Nite Owl (click me)" },
    new Hero { val id = 3; val name = "Ozymandias" },
    new Hero { val id = 4; val name = "Rorschach" },
    new Hero { val id = 5; val name = "Silk Spectre" }
  )

  def getHeroes(): Observable[js.Array[Hero]] = {
    // makes a copy of the array to avoid mutability problems.
    Observable.of(heroes.toJSArray)
  }

  def getHero(idNumber: Int): Observable[Hero] =
    getHeroes().map(hList => {
      new Hero { val id = idNumber; val name = hList(idNumber).name }
    })

  def delete(id: Int): Observable[js.Array[Hero]] = {
    heroes.remove(id)
    heroes = heroes.map(h => {
      if (h.id > id) new Hero { val id = h.id - 1; val name = h.name } else h
    })
    Observable.of(heroes.toJSArray)
  }

  def create(heroName: String): Observable[js.Array[Hero]] = {
    val hero = new Hero { val id = heroes.length; val name = heroName }
    heroes += hero
    Observable.of(heroes.toJSArray)
  }

  def update(hero: Hero): Observable[Hero] = {
    heroes.update(hero.id, hero)
    Observable.of(new Hero { val id = hero.id; val name = hero.name })
  }

}
