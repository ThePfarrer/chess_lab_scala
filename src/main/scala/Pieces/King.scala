package Pieces

import lab.chess.Col.Col

class King(color: Col) extends Piece(color) {
  var letterDisplay = 'K'

  override def movementLegal(dx: Int, dy: Int): Boolean =
    if (math.abs(dx) <= 1 && math.abs(dy) <= 1) {
      hasBeenMoved = true
      true
    } else false
}
