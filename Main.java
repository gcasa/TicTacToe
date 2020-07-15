import java.util.Scanner;
import olc.TicTacToe;

public class Main {
    public static void main(String[] args) {
        // Scanner input;
        // input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        while (game.isGameWon() == false &&
                game.isBoardFull() == false)
        {
            Scanner input;
            input = new Scanner(System.in);
            game.printBoard();
            System.out.printf("Move? ");
            String move = input.nextLine();
            game.markCoordinates(move);
        }
    }
}
