package Pieces

import lab.chess.Col.Col

class Bishop(color: Col) extends Piece(color) {
  var letterDisplay = 'B'

  override def movementLegal(dx: Int, dy: Int): Boolean =
    math.abs(dx) == math.abs(dy)

}
