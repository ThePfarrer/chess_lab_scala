package lab.chess

object Col extends Enumeration {
  type Col = Value
  val Black, White = Value
}

object MovementResult extends Enumeration {
  type MovementResult = Value
  val Hit, LegalMove, NoPieceOnSource, TargetOccupiedByOwnPiece, TargetOutsideBoard, Collision, IllegalMovement = Value
}
