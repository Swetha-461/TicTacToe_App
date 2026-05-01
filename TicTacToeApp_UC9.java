public class TicTacToeApp_UC9 {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'-', 'O', '-'},
        {'O', '-', 'O'}
    };

    public static void main(String[] args) {
        System.out.println(hasWon('X'));
    }

    static boolean hasWon(char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            boolean rowWin = board[i][0] == symbol &&
                             board[i][1] == symbol &&
                             board[i][2] == symbol;
            if (rowWin) return true;
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            boolean colWin = board[0][j] == symbol &&
                             board[1][j] == symbol &&
                             board[2][j] == symbol;
            if (colWin) return true;
        }

        // Check diagonals
        boolean diag1 = board[0][0] == symbol &&
                        board[1][1] == symbol &&
                        board[2][2] == symbol;

        boolean diag2 = board[0][2] == symbol &&
                        board[1][1] == symbol &&
                        board[2][0] == symbol;

        return diag1 || diag2;
    }
}