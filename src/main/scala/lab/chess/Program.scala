package lab.chess

import lab.chess.Col.Col
import lab.chess.MovementResult.MovementResult

object Program {
  var Turn = Col.White

  def main(args: Array[String]) = {
    val board: Board = new Board()
    board.drawChessBoard

    while (true) {
      println()
    }
  }

  private def movement(myBoard: Board, x1: Int, y1: Int, x2: Int, y2: Int) = {
    print("\u001b[2J")
    val myRes: MovementResult = myBoard.move(x1, y1, x2, y2)
    myBoard.drawChessBoard
    println(myRes)
    Thread.sleep(500)

    if ((myRes == MovementResult.LegalMove) || (myRes == MovementResult.Hit)) changeTurn
  }

  private def changeTurn =
    if (Turn == Col.Black) Turn = Col.White
    else Turn = Col.Black

  private def playerColor(color: Col): String =
    if (color == Col.Black) "Black"
    else "White"

}
