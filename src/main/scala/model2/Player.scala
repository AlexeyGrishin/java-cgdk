package model2

class Player(
              val id: Long,
              val me: Boolean,
              val name: String,
              val goalCount: Int,
              val strategyCrashed: Boolean,
              val netTop: Double,
              val netLeft: Double,
              val netBottom: Double,
              val netRight: Double,
              val netFront: Double,
              val netBack: Double,
              val justScoredGoal: Boolean,
              val justMissedGoal: Boolean) {

}