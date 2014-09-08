package model2


class PlayerContext(_hockeyists: Array[Hockeyist], val world: World) {
  val hockeyists = _hockeyists.clone()
}
