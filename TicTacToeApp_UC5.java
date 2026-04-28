public class TicTacToeApp_UC5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // sample test
    }

    static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Check if cell is empty
        return board[row][col] == '-';
    }
}