public class TicTacToeApp_UC10 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println(isDraw());
    }

    // Method to check draw condition
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false; // still empty cells → not draw
                }
            }
        }
        return true; // no empty cells → draw
    }
}