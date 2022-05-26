package Pieces

import lab.chess.Col

class Pawn extends Piece {
  letterDisplay = 'P'

  override def movementLegal(dx: Int, dy: Int): Boolean = {
    val direction = if (color == Col.White) -1 else 1

    (!hasBeenMoved && dx == (direction * 2) || dx == direction) && dy == 0 || (dx == direction && math.abs(dy) == 1)
  }
}
