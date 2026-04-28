public class TicTacToeApp_UC1 {

    public static void main(String[] args) {

        // Create a 3x3 board using 2D array
        char[][] board = new char[3][3];

        // Initialize all cells with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display the board
        System.out.println("Tic-Tac-Toe Board:");
        printBoard(board);
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
