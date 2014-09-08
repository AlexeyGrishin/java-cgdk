package model2

import java.lang.StrictMath._

class Unit(
            val id: Long,
            val mass: Double,
            val radius: Double,
            val x: Double,
            val y: Double,
            val speedX: Double,
            val speedY: Double,
            val angle: Double,
            val angularSpeed: Double) {

  /**
   * @param x X-координата точки.
   * @param y Y-координата точки.
   * @return Возвращает ориентированный угол [{ @code -PI}, { @code PI}] между направлением
   *                                                                данного объекта и вектором из центра данного объекта к указанной точке.
   */
  def getAngleTo(x: Double, y: Double): Double = {
    val absoluteAngleTo: Double = atan2(y - this.y, x - this.x)
    var relativeAngleTo: Double = absoluteAngleTo - angle
    while (relativeAngleTo > PI) {
      relativeAngleTo -= 2.0D * PI
    }
    while (relativeAngleTo < -PI) {
      relativeAngleTo += 2.0D * PI
    }
    relativeAngleTo
  }

  /**
   * @param unit Объект, к центру которого необходимо определить угол.
   * @return Возвращает ориентированный угол [{ @code -PI}, { @code PI}] между направлением
   *                                                                данного объекта и вектором из центра данного объекта к центру указанного объекта.
   */
  def getAngleTo(unit: Unit): Double = getAngleTo(unit.x, unit.y)

  /**
   * @param x X-координата точки.
   * @param y Y-координата точки.
   * @return Возвращает расстояние до точки от центра данного объекта.
   */
  def getDistanceTo(x: Double, y: Double): Double = hypot(x - this.x, y - this.y)

  /**
   * @param unit Объект, до центра которого необходимо определить расстояние.
   * @return Возвращает расстояние от центра данного объекта до центра указанного объекта.
   */
  def getDistanceTo(unit: Unit): Double = getDistanceTo(unit.x, unit.y)
}
