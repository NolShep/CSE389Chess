import java.util.*;

public class ChessPiece{

   int xCord, yCord;
   int xCordMove, yCordMove;
   
   String color;
   String name;
   
   LinkedList<ChessPiece> pieceList = new LinkedList<>();
   
   public ChessPiece(int xCord, int yCord, String color, String name, LinkedList<ChessPiece> pieceList){
      this.xCord = xCord;
      this.yCord = yCord;
      this.color = color;
      this.name = name;
      
      xCordMove = xCord * 90;
      yCordMove = yCord * 90;
      
      this.pieceList = pieceList;
      pieceList.add(this);
      
   }
   
   public void move(int xCordIn, int yCordIn, ChessPiece pieceRemove, LinkedList<ChessPiece> pieceList){
      
      //Index for each board spot length (90)
      xCordMove = xCordIn * 90;
      yCordMove = yCordIn * 90;
      
      if(ChessBoard.ChessPieceCords(xCordMove, yCordMove) != null){
         //Get piece and remove from pieces list
         pieceRemove = ChessBoard.ChessPieceCords(xCordMove, yCordMove);
         pieceList.remove(pieceRemove);
         
      }
      //Update new piece cords
      this.xCord = xCordIn;
      this.yCord = yCordIn;
      
   }
}
