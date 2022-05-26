package Pieces

class Knight extends Piece {
  letterDisplay = 'N'

  override def movementLegal(dx: Int, dy: Int): Boolean = {
    val (x, y) = (math.abs(dx), math.abs(dy))
    (x == 2 && y == 1) || (x == 1 && y == 2)
  }
}
