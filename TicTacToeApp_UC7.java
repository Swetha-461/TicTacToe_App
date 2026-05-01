import java.util.Random;

public class TicTacToeApp_UC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    // Method for computer move
    static void computerMove() {
        Random random = new Random();
        int slot;
        int row, col;

        while (true) {
            // Generate random slot (1–9)
            slot = random.nextInt(9) + 1;

            // Convert slot to row & column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if move is valid
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    // Method to print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}