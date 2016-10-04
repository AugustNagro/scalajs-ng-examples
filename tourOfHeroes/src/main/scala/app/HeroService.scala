package app

import ng.http.{Headers, Http}
import ng.macros.Injectable
import rxscalajs.Observable

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal

@Injectable
class HeroService(http: Http) {

  private var heroes: js.Array[Hero] = js.Array(
    Hero(0, "The Comedian"),
    Hero(1, "Doctor Manhattan"),
    Hero(2, "Nite Owl (click me)"),
    Hero(3, "Ozymandias"),
    Hero(4, "Rorschach"),
    Hero(5, "Silk Spectre")
  )


  def getHeroes(): Observable[js.Array[Hero]] = {
    Observable.of(heroes)
  }

  def getHero(id: Int): Observable[Hero] = getHeroes().map(_(id))

  def delete(id: Int): Observable[js.Array[Hero]] = {
    heroes.remove(id)
    heroes = heroes.map(h => {
      if(h.id > id) Hero(h.id - 1, h.name) else h
    })
    Observable.of(heroes)
  }

  def create(name: String): Observable[js.Array[Hero]] = {
    val hero = Hero(heroes.length, name)
    heroes += hero
    Observable.of(heroes)
  }

  def update(hero: Hero): Observable[Hero] = {
    heroes.update(hero.id, hero)
    Observable.of(hero)
  }

}
