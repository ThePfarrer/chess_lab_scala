package Pieces

class Castle extends Piece {
  letterDisplay = 'C'

  override def movementLegal(dx: Int, dy: Int): Boolean =
    math.abs(dx) == 0 || math.abs(dy) == 0
}
