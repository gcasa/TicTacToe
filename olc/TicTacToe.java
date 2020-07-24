package olc;

import java.util.Scanner;

/**
    Instructions 
    - Upon completion the program should let two players play Tic Tac Toe 
    - You can implement your own methods when you need to, or modify existing ones 
    - The isGameWon() method has some bugs, you need to find the bugs and fix them 
    - Implement the playing logic in the main function 
    - Thinking of edge cases and handling them is a plus 
    - executing input.nextLine(); in the main function will read input from the console
 */

public class TicTacToe {
    private char board[][] = {
            {'N', 'N', 'N'},
            {'N', 'N', 'N'},
            {'N', 'N', 'N'}};

    private char currentPlayer = 'X';

    public char getCurrentPlayer()
    {
        return currentPlayer;
    }

    public void printBoard() {
      for(int i = 0; i < 3; i++)
      {
        for(int j = 0; j < 3; j++)
        {
          System.out.printf("%c", board[i][j]);
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }

    public boolean isBoardFull() {
        int count = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == 'X' || board[i][j] == 'O')
                {
                    count++;
                }
            }
        }
        return count == 9;
    }

    public boolean markCoordinates(String line) {
      String[] coords = line.split(",");
      int i = Integer.parseInt(coords[0]);
      int j = Integer.parseInt(coords[1]);

      // Check range...
      if (i > 2 || j > 2 || i < 0 || j < 0)
      {
          System.out.println("Out of range");
          return false;
      }

      // Check the board...
      char value = board[i][j];
      if( value == 'N' )
      {
        board[i][j] = currentPlayer;
        return true;
      }
      return false;
    }

    public void alternatePlayer() {
        if (currentPlayer == 'X')
        {
            currentPlayer = 'O';
        }
        else
        {
            currentPlayer = 'X';
        }
    }

    public boolean isGameWon() {
        for (int i = 0; i < board.length; i++) {
            // check rows 
            if ((board[0][i] == board[1][i]) &&
                    (board[1][i] == board[2][i]) &&
                    (board[2][i] == currentPlayer)) {
                return true;
            }
        }

        for (int i = 0; i < board.length; i++) {
            // check cols 
            if ((board[i][0] == board[i][1]) && 
                (board[i][1] == board[i][2]) &&
                    (board[i][2] == currentPlayer))
            {
                return true;
            }
        }

        // check diag
        if((board[0][0] == board[1][1]) && 
           (board[1][1] == board[2][2]) &&
                (board[2][2] == currentPlayer))
        {
            return true;
        }

        if((board[0][2] == board[1][1]) &&
           (board[1][1] == board[2][0]) &&
            (board[2][0] == currentPlayer))
        {
            return true;
        }

        return false;
    }
}
