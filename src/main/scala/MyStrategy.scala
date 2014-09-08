import java.lang.StrictMath._

import model2._

class MyStrategy extends Strategy {

  override def move(self: Hockeyist, world: World, game: Game, move: Move) {
    move.speedUp = -1.0D
    move.turn = PI
    move.action = ActionType.Strike
  }

}
