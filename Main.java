import java.util.Scanner;
import olc.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        do  {
            Scanner input;
            input = new Scanner(System.in);
            game.printBoard();
            System.out.printf("%c's Move? ", game.getCurrentPlayer());
            String move = input.nextLine();
            game.markCoordinates(move);
            if (game.isGameWon())
            {
                System.out.printf("%c has won!\n", game.getCurrentPlayer());
                break;
            }
            else
            {
                game.alternatePlayer();
            }
        } while (!game.isBoardFull());
    }
}
