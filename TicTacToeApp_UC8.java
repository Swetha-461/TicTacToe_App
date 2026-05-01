public class TicTacToeApp_UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                // simulate human move
            } else {
                System.out.println("Computer's turn");
                // simulate computer move
            }

            // Simulate game end condition (for demo)
            gameOver = checkGameOver();

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over!");
    }

    // Dummy method to stop loop after few iterations
    static int counter = 0;

    static boolean checkGameOver() {
        counter++;
        return counter == 5; // stops after 5 turns (demo purpose)
    }
}