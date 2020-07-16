import java.util.Scanner;
import olc.TicTacToe;

public class Main {
    public static void main(String[] args) {
        // Scanner input;
        // input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
         // game.isGameWon() == false && game.isBoardFull() == false)
        do
        {
            Scanner input;
            input = new Scanner(System.in);
            game.printBoard();
            System.out.printf("%c's Move? ", game.getCurrentPlayer());
            String move = input.nextLine();
            game.markCoordinates(move);
        }
        while (game.isBoardFull() == false);
    }
}
