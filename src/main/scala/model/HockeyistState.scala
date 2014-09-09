package model

/**
 * Состояние хоккеиста.
 */
object HockeyistState extends NullableEnumeration {
  type HockeyistState = Value

  /**
   * Хоккеист находится на игровом поле.
   */
  val Active = Value(0)

  /**
   * Хоккеист находится на игровом поле и делает замах клюшкой.
   * <p/>
   * Во время замаха стратегия не может управлять движением хоккеиста, а из действий доступны только
   * {@code ActionType.Strike} и {@code ActionType.CancelStrike}.
   */
  val Swinging = Value(1)

  /**
   * Хоккеист находится на игровом поле, но сбит с ног.
   * Стратегия игрока не может им управлять.
   */
  val KnockedDown = Value(2)

  /**
   * Хоккеист отдыхает вне игрового поля.
   * Стратегия игрока не может им управлять.
   */
  val Resting = Value(3)
}
