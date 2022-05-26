package Pieces

class King extends Piece {
  letterDisplay = 'K'

  override def movementLegal(dx: Int, dy: Int): Boolean =
    if (math.abs(dx) <= 1 && math.abs(dy) <= 1) {
      hasBeenMoved = true
      true
    } else false
}
