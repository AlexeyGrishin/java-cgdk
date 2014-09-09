package model

import model.ActionType.ActionType
import model.HockeyistState.HockeyistState
import model.HockeyistType.HockeyistType

/**
 * Класс, определяющий хоккеиста. Содержит также все свойства юнита.
 */
class Hockeyist(
                 _id: Long,
                 _playerId: Long,
                 _teammateIndex: Int,
                 _mass: Double,
                 _radius: Double,
                 _x: Double,
                 _y: Double,
                 _speedX: Double,
                 _speedY: Double,
                 _angle: Double,
                 _angularSpeed: Double,
                 _teammate: Boolean,
                 _type: HockeyistType,
                 _strength: Int,
                 _endurance: Int,
                 _dexterity: Int,
                 _agility: Int,
                 _stamina: Double,
                 _state: HockeyistState,
                 _originalPositionIndex: Int,
                 _remainingKnockdownTicks: Int,
                 _remainingCooldownTicks: Int,
                 _swingTicks: Int,
                 _lastAction: Option[ActionType],
                 _lastActionTick: Integer)
  extends Unit(_id, _mass, _radius, _x, _y, _speedX, _speedY, _angle, _angularSpeed) {

  /**
   * @return Возвращает идентификатор игрока, в команду которого входит хоккеист.
   */
  val playerId: Long = _playerId

  /**
   * @return Возвращает 0-индексированный номер хоккеиста в команде.
   */
  val teammateIndex: Int = _teammateIndex

  /**
   * @return Возвращает {@code true}, если и только если данный хоккеист входит в команду вашего игрока.
   */
  val teammate: Boolean = _teammate

  /**
   * @return Возвращает тип хоккеиста.
   */
  val `type`: HockeyistType = _type

  /**
   * @return Возвращает значение атрибута сила.
   */
  val strength: Int = _strength

  /**
   * @return Возвращает значение атрибута стойкость.
   */
  val endurance: Int = _endurance

  /**
   * @return Возвращает значение атрибута ловкость.
   */
  val dexterity: Int = _dexterity

  /**
   * @return Возвращает значение атрибута подвижность.
   */
  val agility: Int = _agility

  /**
   * @return Возвращает текущее значение выносливости.
   */
  val stamina: Double = _stamina

  /**
   * @return Возвращает состояние хоккеиста.
   */
  val state: HockeyistState = _state

  /**
   * @return Возвращает индекс исходной позиции хоккеиста или {@code -1} для вратаря или хоккеиста,
   *         отдыхающего за пределами игрового поля. На эту позицию хоккеист будет помещён при разыгрывании шайбы.
   *         При выполнении действия замена {@code ActionType.SUBSTITUTE} индексы исходных позиций хоккеистов,
   *         участвующих в замене, меняются местами.
   */
  val originalPositionIndex: Int = _originalPositionIndex

  /**
   * @return Возвращает количество тиков, по прошествии которого хоккеист восстановится после падения,
   *         или {@code 0}, если хоккеист не сбит с ног.
   */
  val remainingKnockdownTicks: Int = _remainingKnockdownTicks

  /**
   * @return Возвращает количество тиков, по прошествии которого хоккеист сможет совершить какое-либо
   *         действие ({@code move.action}), или {@code 0}, если хоккеист может совершить действие в данный тик.
   */
  val remainingCooldownTicks: Int = _remainingCooldownTicks

  /**
   * @return Для хоккеиста, находящегося в состоянии замаха ({@code HockeyistState.SWINGING}),
   *         возвращает количество тиков, прошедших от начала замаха. В противном случае возвращает {@code 0}.
   */
  val swingTicks: Int = _swingTicks

  /**
   * @return Возвращает последнее действие ({@code move.action}), совершённое хоккеистом, или {@code null}
   *         ({@code UNKNOWN_ACTION} в пакетах некоторых языков) в случае, если хоккеист ещё не совершил
   *         ни одного действия.
   */
  val lastAction: Option[ActionType] = _lastAction

  /**
   * @return Возвращает номер тика, в который хоккеист совершил своё последние действие ({@code move.action}),
   *         или {@code null} ({@code -1} в пакетах некоторых языков) в случае, если хоккеист ещё не совершил
   *         ни одного действия.
   */
  val lastActionTick: Option[Int] = Option(_lastActionTick).map(Integer2int)
}
