package Pieces

import lab.chess.Col.Col

class Castle(color: Col) extends Piece(color) {
  var letterDisplay = 'C'

  override def movementLegal(dx: Int, dy: Int): Boolean =
    math.abs(dx) == 0 || math.abs(dy) == 0
}
