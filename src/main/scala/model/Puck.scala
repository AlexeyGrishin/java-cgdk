package model

/**
 * Класс, определяющий хоккейную шайбу. Содержит также все свойства юнита.
 */
class Puck (
             _id: Long,
             _mass: Double,
             _radius: Double,
             _x: Double,
             _y: Double,
             _speedX: Double,
             _speedY: Double,
             _ownerHockeyistId: Long,
             _ownerPlayerId: Long
             )
  extends Unit(_id, _mass, _radius, _x, _y, _speedX, _speedY, 0.0D, 0.0D) {

  /**
   * @return Возвращает идентификатор хоккеиста, контролирующего шайбу, или {@code -1}.
   */
  val ownerHockeyistId: Long = _ownerHockeyistId

  /**
   * @return Возвращает идентификатор игрока, контролирующего шайбу, или {@code -1}.
   */
  val ownerPlayerId: Long = _ownerPlayerId

}
