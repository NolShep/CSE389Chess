import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class ChessBoard{

   //Board pieces list
   public static LinkedList<ChessPiece> pieceList = new LinkedList<>();
   
   public static ChessPiece clickedPiece = null;
   public static ChessPiece pieceRemove = null;
   
   //getCords func(return piece)
   public static ChessPiece ChessPieceCords(int xCordIn, int yCordIn){
      for(ChessPiece piece: pieceList){
         if(piece.xCord == xCordIn/90 && piece.yCord == yCordIn/90){
            return piece;
         }
      }
      return null;
   }

   public static void main(String[] args) throws IOException{
   
      //White pieces image list
      Image whitePieces[] = new Image[6];
      
      //White queen
      BufferedImage wtqueenimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wtqueen.png"));
      whitePieces[0] = wtqueenimg.getScaledInstance(88, 94, BufferedImage.SCALE_SMOOTH);
      ChessPiece wtqueen=new ChessPiece(3, 7, "white", "queen", pieceList);

      //White king
      BufferedImage wtkingimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wtking.png"));
      whitePieces[1] = wtkingimg.getScaledInstance(98, 102, BufferedImage.SCALE_SMOOTH);
      ChessPiece wtking=new ChessPiece(4, 7, "white", "king", pieceList);
      
      //White knight
      BufferedImage wthorseimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wthorse.png"));
      whitePieces[2] = wthorseimg.getScaledInstance(92, 98, BufferedImage.SCALE_SMOOTH);
      ChessPiece wthorse=new ChessPiece(1, 7, "white", "knight", pieceList);
      ChessPiece wthorse2=new ChessPiece(6, 7, "white", "knight", pieceList);

      //White bishop
      BufferedImage wtbishopimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wtbishop.png"));
      whitePieces[3] = wtbishopimg.getScaledInstance(92, 95, BufferedImage.SCALE_SMOOTH);
      ChessPiece wtbishop=new ChessPiece(2, 7, "white", "bishop", pieceList);
      ChessPiece wtbishop2=new ChessPiece(5, 7, "white", "bishop", pieceList);
      
      //White rook
      BufferedImage wtcastleimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wtcastle.png"));
      whitePieces[4] = wtcastleimg.getScaledInstance(86, 92, BufferedImage.SCALE_SMOOTH);
      ChessPiece wtcatle=new ChessPiece(0, 7, "white", "rook", pieceList);
      ChessPiece wtcastle2=new ChessPiece(7, 7, "white", "rook", pieceList);

      //White pawn
      BufferedImage wtpawnimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/wtpawn.png"));
      whitePieces[5] = wtpawnimg.getScaledInstance(86, 95, BufferedImage.SCALE_SMOOTH);
      ChessPiece wtpawn=new ChessPiece(1, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn2=new ChessPiece(2, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn3=new ChessPiece(3, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn4=new ChessPiece(4, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn5=new ChessPiece(5, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn6=new ChessPiece(6, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn7=new ChessPiece(7, 6, "white", "pawn", pieceList);
      ChessPiece wtpawn8=new ChessPiece(0, 6, "white", "pawn", pieceList);
        
      
      //Black pieces image list
      Image blackPieces[] = new Image[6];
      
      //Black queen
      BufferedImage bkqueenimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkqueen.png"));
      blackPieces[0] = bkqueenimg.getScaledInstance(90, 86, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkqueen=new ChessPiece(3, 0, "black", "queen", pieceList);

      //Black king
      BufferedImage bkkingimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkking.png"));
      blackPieces[1] = bkkingimg.getScaledInstance(92, 92, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkking=new ChessPiece(4, 0, "black", "king", pieceList);

      //Black knight
      BufferedImage bkhorseimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkhorse.png"));
      blackPieces[2] = bkhorseimg.getScaledInstance(96, 98, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkhorse=new ChessPiece(1, 0, "black", "knight", pieceList);
      ChessPiece bkhorse2=new ChessPiece(6, 0, "black", "knight", pieceList);
      
      //Black bishop
      BufferedImage bkbishopimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkbishop.png"));
      blackPieces[3] = bkbishopimg.getScaledInstance(92, 105, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkbishop=new ChessPiece(2, 0, "black", "bishop", pieceList);
      ChessPiece bkbishop2=new ChessPiece(5, 0, "black", "bishop", pieceList);
      
      //Black rook
      BufferedImage bkcastleimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkcastle.png"));
      blackPieces[4] = bkcastleimg.getScaledInstance(95, 90, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkcastle=new ChessPiece(0, 0, "black", "rook", pieceList);
      ChessPiece bkcastle2=new ChessPiece(7, 0, "black", "rook", pieceList);
        
      //Black pawn
      BufferedImage bkpawnimg = ImageIO.read(new File("/Users/nolanshepherd/Desktop/Pieces/bkpawn.png"));
      blackPieces[5] = bkpawnimg.getScaledInstance(82, 90, BufferedImage.SCALE_SMOOTH);
      ChessPiece bkpawn=new ChessPiece(1, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn2=new ChessPiece(2, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn3=new ChessPiece(3, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn4=new ChessPiece(4, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn5=new ChessPiece(5, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn6=new ChessPiece(6, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn7=new ChessPiece(7, 1, "black", "pawn", pieceList);
      ChessPiece bkpawn8=new ChessPiece(0, 1, "black", "pawn", pieceList);

                    
      //Setting up board 
      JFrame board = new JFrame("Chess Board");
      board.setBounds(200, 50, 720, 720);
    
      //Remove Borders
      board.setUndecorated(true);
      
      //Detail inside board window
      JPanel window = new JPanel(){
         public void paint(Graphics window){
         
            boolean indexBoard = true;
            int boardLength = 8;
            int i=0; 
            
            //Board GUI Setup
            while(i<8){
               int j = 0;
               while(j<8){
                  
                  if(indexBoard){
                    window.setColor(new Color(119, 148, 85));
                    window.fillRect(j*90, i*90, 90, 90);
                  }
                  
                  else{
                     window.setColor(Color.white); 
                     window.fillRect(j*90, i*90, 90, 90); 
                  }
                  
                  if(indexBoard == true){
                     indexBoard = false;
                  }
                  else{ indexBoard = true;}
                  j++;
                  }
                  
               if(indexBoard == true){
                  indexBoard = false;
               }
               else{ indexBoard = true;}
               i++;
               
               for(ChessPiece piece: pieceList){
                  int index = 0;
                  if(piece.name.equals("queen")){
                     index = 0;
                  }
                  if(piece.name.equals("king")){
                     index = 1;
                  }
                  if(piece.name.equals("knight")){
                     index = 2;
                  }
                  if(piece.name.equals("bishop")){
                     index = 3;
                  }
                  if(piece.name.equals("rook")){
                     index = 4;
                  }
                  if(piece.name.equals("pawn")){
                     index = 5;
                  }
                  //Check for black or white piece image
                  if(piece.color.equals("black")){
                     window.drawImage(blackPieces[index], piece.xCordMove, piece.yCordMove, this);
                  }
                  if(piece.color.equals("white")){
                     window.drawImage(whitePieces[index], piece.xCordMove, piece.yCordMove, this);
                  }
               }              
               }
         
            }
         };
      
      //JFrame Setup
      board.add(window);
      board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      board.setVisible(true);
      
      //Mouse input
      board.addMouseMotionListener(new MouseMotionListener(){
         public void mouseDragged(MouseEvent e){
            //Re-pain new board with new cords
            if(clickedPiece != null){
               clickedPiece.xCordMove = e.getX() - 45;
               clickedPiece.yCordMove = e.getY() - 45;
               board.repaint();
            }
         }
         public void mouseMoved(MouseEvent e){
            //Apart of addMouseMotionListener but not needed
         
         }
      });
      
      board.addMouseListener(new MouseListener(){
         public void mouseClicked(MouseEvent e){
            //Apart of addMouseListener but not needed
         }
         public void mousePressed(MouseEvent e){
            clickedPiece = ChessPieceCords(e.getX(), e.getY());
         
         }
         public void mouseReleased(MouseEvent e){
            clickedPiece.move(e.getX()/90, e.getY()/90, pieceRemove, pieceList);
            
         }
         public void mouseEntered(MouseEvent e){
            //Apart of addMouseListener but not needed
         
         }
         public void mouseExited(MouseEvent e){
            //Apart of addMouseListener but not needed
         }
      });
     
   }
}