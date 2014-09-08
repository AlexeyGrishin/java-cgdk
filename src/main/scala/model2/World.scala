package model2

class World(
             val tick: Int,
             val tickCount: Int,
             val width: Double,
             val height: Double,
             _players: Array[Player],
             _hockeyists: Array[Hockeyist],
             val puck: Puck) {
  val players = _players.clone()
  val hockeyists = _hockeyists.clone()
}
