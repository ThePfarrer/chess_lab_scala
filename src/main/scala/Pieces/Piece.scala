package Pieces

import lab.chess.Col
import lab.chess.Col.Col

import io.AnsiColor._

abstract class Piece {
  protected var letterDisplay: Char
  protected var color: Col
  protected var hasBeenMoved = false

//  def this(color: Col) = {
//    this()
//    this.color = color
//  }

  def setHasBeenMoved = hasBeenMoved = true

  def drawLetterDisplay =
    if (color == Col.Black) {
      print(RED)
      print(" " + letterDisplay + " ")
      print(WHITE)
    } else {
      print(YELLOW)
      print(" " + letterDisplay + " ")
      print(WHITE)
    }

  def getCol: Col = color

  def movementLegal(dx: Int, dy: Int): Boolean

}
