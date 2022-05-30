package Pieces

import lab.chess.Col.Col

class Queen(color: Col) extends Piece(color) {
  var letterDisplay = 'Q'

  override def movementLegal(dx: Int, dy: Int): Boolean = {
    val (x, y) = (math.abs(dx), math.abs(dy))
    x == 0 || y == 0 || x == y
  }
}
