package Pieces

import lab.chess.Col
import lab.chess.Col.{Black, Col}

import io.AnsiColor._

abstract class Piece(color: Col) {
  protected var letterDisplay: Char
  protected var hasBeenMoved = false

  def setHasBeenMoved = hasBeenMoved = true

  def drawLetterDisplay() =
    if (color == Col.Black) {
      print(RED)
      print(" " + letterDisplay + " ")
      print(BLACK)
    } else {
      print(YELLOW)
      print(" " + letterDisplay + " ")
      print(BLACK)
    }

  def getCol: Col = color

  def movementLegal(dx: Int, dy: Int): Boolean

}
