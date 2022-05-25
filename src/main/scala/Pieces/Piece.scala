package Pieces

import lab.chess.Col
import lab.chess.Col.Col

abstract class Piece {
  protected val letterDisplay: Char
  protected var color: Col
  protected var hasBeenMoved = false

  def this(color: Col) = {
    this()
    this.color = color
  }

  def setHasBeenMoved() = hasBeenMoved = true

  def drawLetterDisplay() =
    if (color == Col.Black) {
      print()
    }

  def getCol(): Col = color

  def movementLegal(dx: Int, dy: Int)

}
