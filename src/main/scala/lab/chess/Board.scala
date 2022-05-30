package lab.chess

import Pieces._
import lab.chess.MovementResult.MovementResult

class Board {
  val field = Array.ofDim[Field](8, 8)

  for {
    i <- 0 to 7
    j <- 0 to 7
  } {
    if ((i + j) % 2 == 0) field(i)(j) = new Field(Col.White)
    else field(i)(j) = new Field(Col.White)
  }

  def drawChessBoard(): Unit = {
    val topLine      = "┌───┬───┬───┬───┬───┬───┬───┬───┐"
    val verticalLine = "│"
    val inBetween    = "├───┼───┼───┼───┼───┼───┼───┼───┤"
    val bottomLine   = "└───┴───┴───┴───┴───┴───┴───┴───┘"
    println(topLine)
    for (i <- 0 to 7) {
      print(verticalLine)
      for (j <- 0 to 7) {
        field(i)(j).drawInChessField()
        print(verticalLine)
      }
      if (i != 7) println("\n" + inBetween)
    }
    println("\n" + bottomLine)
  }

  def getPiece(x1: Int, y1: Int) = field(x1)(y1)

  def move(x1: Int, y1: Int, x2: Int, y2: Int): MovementResult = ???

  // Pawns
  for (i <- 0 until 8) {
    field(1)(i).piece = Some(new Pawn(Col.Black))
    field(6)(i).piece = Some(new Pawn(Col.White))
  }

  // Castle
  field(0)(0).piece = Some(new Castle(Col.Black))
  field(0)(7).piece = Some(new Castle(Col.Black))
  field(7)(0).piece = Some(new Castle(Col.White))
  field(7)(7).piece = Some(new Castle(Col.White))

  // Knight
  field(0)(1).piece = Some(new Knight(Col.Black))
  field(0)(6).piece = Some(new Knight(Col.Black))
  field(7)(1).piece = Some(new Knight(Col.White))
  field(7)(6).piece = Some(new Knight(Col.White))

  // Bishop
  field(0)(2).piece = Some(new Bishop(Col.Black))
  field(0)(5).piece = Some(new Bishop(Col.Black))
  field(7)(2).piece = Some(new Bishop(Col.White))
  field(7)(5).piece = Some(new Bishop(Col.White))

  // Queen
  field(0)(3).piece = Some(new Queen(Col.Black))
  field(7)(3).piece = Some(new Queen(Col.White))

  // King
  field(0)(4).piece = Some(new King(Col.Black))
  field(7)(4).piece = Some(new King(Col.White))

}
