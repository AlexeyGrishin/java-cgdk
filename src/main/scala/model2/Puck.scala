package model2

class Puck (
             id: Long,
             mass: Double,
             radius: Double,
             x: Double,
             y: Double,
             speedX: Double,
             speedY: Double,
             val ownerHockeyistId: Long,
             val ownerPlayerId: Long)
  extends Unit(id, mass, radius, x, y, speedX, speedY, 0.0D, 0.0D) {
}
