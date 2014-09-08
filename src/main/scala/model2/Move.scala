package model2

import model2.ActionType.ActionType

class Move {
  var speedUp: Double = .0
  var turn: Double = .0
  var action: ActionType = ActionType.None
  var passPower: Double = 1.0D
  var passAngle: Double = .0
  var teammateIndex: Int = -1

  def getSpeedUp = speedUp
  def getTurn = turn
  def getAction = action
  def getPassPower = passPower
  def getPassAngle = passAngle
  def getTeammateIndex = teammateIndex
}
