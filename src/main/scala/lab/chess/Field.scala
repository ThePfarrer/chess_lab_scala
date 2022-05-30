package lab.chess

import Pieces.Piece
import lab.chess.Col.Col

import scala.io.AnsiColor._

class Field(col: Col) {
  var piece: Option[Piece] = None

  def drawChessField =
    if (col == Col.White) {
      print(WHITE_B)
      drawInChessField()
      print(BLACK_B)
    } else {
      drawInChessField()
    }

  def drawInChessField() = piece match {
    case None        => print("   ")
    case Some(value) => value.drawLetterDisplay()
  }

}
