package model

/**
 * Этот класс описывает игровой мир. Содержит также описания всех игроков и игровых объектов (<<юнитов>>).
 */
class World(
             _tick: Int,
             _tickCount: Int,
             _width: Double,
             _height: Double,
             _players: Array[Player],
             _hockeyists: Array[Hockeyist],
             _puck: Puck) {
  /**
   * @return Возвращает номер текущего тика.
   */
  val tick: Int = _tick

  /**
   * @return Возвращает базовую длительность игры в тиках.
   *         Реальная длительность может отличаться от этого значения в большую сторону.
   */
  val tickCount: Int = _tickCount

  /**
   * @return Возвращает ширину мира.
   */
  val width: Double = _width

  /**
   * @return Возвращает высоту мира.
   */
  val height: Double = _height

  /**
   * @return Возвращает шайбу.
   */
  val puck: Puck = _puck

  /**
   * @return Возвращает список игроков (в случайном порядке).
   *         После каждого тика объекты, задающие игроков, пересоздаются.
   */
  val players = _players.clone()

  /**
   * @return Возвращает список хоккеистов (в случайном порядке), включая вратарей и хоккеиста стратегии,
   *         вызвавшей этот метод. После каждого тика объекты, задающие хоккеистов, пересоздаются.
   */
  val hockeyists = _hockeyists.clone()

  /**
   * @return Возвращает вашего игрока.
   */
  def getMyPlayer: Option[Player] = players.find(_.me)

  /**
   * @return Возвращает игрока, соревнующегося с вами.
   */
  def getOpponentPlayer: Option[Player] = players.find(!_.me)
}