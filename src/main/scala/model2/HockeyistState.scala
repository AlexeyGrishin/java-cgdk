package model2

/**
 * Состояние хоккеиста.
 */
object HockeyistState extends NullableEnumeration {
  type HockeyistState = Value

  /**
   * Хоккеист находится на игровом поле.
   */
  val Active = Value("ACTIVE")

  /**
   * Хоккеист находится на игровом поле и делает замах клюшкой.
   * <p/>
   * Во время замаха стратегия не может управлять движением хоккеиста, а из действий доступны только
   * {@code ActionType.Strike} и {@code ActionType.CancelStrike}.
   */
  val Swinging = Value("SWINGING")

  /**
   * Хоккеист находится на игровом поле, но сбит с ног.
   * Стратегия игрока не может им управлять.
   */
  val KnockedDown = Value("KNOCKED_DOWN")

  /**
   * Хоккеист отдыхает вне игрового поля.
   * Стратегия игрока не может им управлять.
   */
  val Resting = Value("RESTING")
}
