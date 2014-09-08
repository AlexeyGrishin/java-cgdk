package model2

import model2.ActionType.ActionType
import model2.HockeyistState.HockeyistState
import model2.HockeyistType.HockeyistType

class Hockeyist(
                 id: Long,
                 val playerId: Long,
                 val teammateIndex: Int,
                 mass: Double,
                 radius: Double,
                 x: Double,
                 y: Double,
                 speedX: Double,
                 speedY: Double,
                 angle: Double,
                 angularSpeed: Double,
                 val teammate: Boolean,
                 val `type`: HockeyistType,
                 val strength: Int,
                 val endurance: Int,
                 val dexterity: Int,
                 val agility: Int,
                 val stamina: Double,
                 val state: HockeyistState,
                 val originalPositionIndex: Int,
                 val remainingKnockdownTicks: Int,
                 val remainingCooldownTicks: Int,
                 val swingTicks: Int,
                 val lastAction: ActionType,
                 val lastActionTick: Integer)
  extends Unit(id, mass, radius, x, y, speedX, speedY, angle, angularSpeed) {
}
