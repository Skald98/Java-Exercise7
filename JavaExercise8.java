
package javaexercise8;
import java.util.*;

public class JavaExercise8 {

 
      String []TicTacToeBoard=new String[9];
      
      /* 
         We can use a 2D array as a base then we can use a scanner with a for
           loop to fill the array with X or O. Then we can use a if statement 
           to check the winner and then print the winner and change turns with 
            another if statement and finish the game when there are 3 X or O in 
            a line or when all the slots of the array are full
      
      
      
      */
      
      
    //Simple Tic-Tac-Toe game (Work in progress)
    public static void main(String[] args) {
        // TODO code application logic here
        
      char X,O;
        
      Scanner in=new Scanner(System.in);
        
       System.out.println("Welcome to 2 Player Tic-Tac-Toe game");
       System.out.println("One of the two players have to put X or O in a line to win ");
              System.out.println("Player one is X and player 2 is O");
              
              //GUI/Game Board
        	printboard();
                
                for(int i=0;i<9;i++){
                   String TicTacToeBoard=in.nextLine();
            
                    
                    
                    
                    
                }
             /*   
               if (TicTacToeBoard.equals("XXX")) {
                   System.out.println("Winner is Player 1!");
			} else if (TicTacToeBoard.equals("OOO")) {
			  System.out.println("Winner is Player 2!");
			}
                */
                
      //Old Board
       /*
            for(int i=0; i<3;i++){
            System.out.print(" | ");
            System.out.println(" | ");
            
        }
      */
      
    
                
                
        
     
    }
    
    public void printboard(){
        
               //GUI/Game Board

		System.out.println("| " + TicTacToeBoard[0] + " | " + TicTacToeBoard[1] + " | " + TicTacToeBoard[2] + " |");
		System.out.println("----------------------");
		System.out.println("| " + TicTacToeBoard[3] + " | " + TicTacToeBoard[4] + " | " + TicTacToeBoard[5] + " |");
		System.out.println("----------------------");
		System.out.println("| " + TicTacToeBoard[6] + " | " + TicTacToeBoard[7] + " | " + TicTacToeBoard[8] + " |");

    }
    
}
