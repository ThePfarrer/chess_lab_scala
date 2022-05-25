package lab.chess

import lab.chess.Col.Col

class Field {
  var col: Col

  def this(col: Col) = {
    this()
    this.col = col
  }

  def drawChessField =
    if (col == Col.White) {
      Console.drawInChessField
    } else {
      drawInChessField
    }

  def drawInChessField =
    if (piece != null) piece.drawLetterDisplay
    else print("   ")

}
