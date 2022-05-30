package Pieces

import lab.chess.Col.Col

class Knight(color: Col) extends Piece(color) {
  var letterDisplay = 'N'

  override def movementLegal(dx: Int, dy: Int): Boolean = {
    val (x, y) = (math.abs(dx), math.abs(dy))
    (x == 2 && y == 1) || (x == 1 && y == 2)
  }
}
