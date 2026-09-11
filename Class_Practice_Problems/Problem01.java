import java.util.Random;
import java.util.Scanner;

public class Problem01 {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = new String[5];
        String[] computerMoves = new String[5];
        String[] results = new String[5];

        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Round " + (i + 1) + " - Enter Rock, Paper or Scissors: ");
            playerMoves[i] = sc.nextLine();
            computerMoves[i] = moves[random.nextInt(3)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);

            System.out.println("Computer: " + computerMoves[i]);
            System.out.println("Result: " + results[i]);

            if (results[i].equals("Player Wins")) wins++;
            else if (results[i].equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("\nRound | Player Move | Computer Move | Result");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "     | " + playerMoves[i] + "       | "
                    + computerMoves[i] + "       | " + results[i]);
        }

        double winPercentage = (wins / 5.0) * 100;
        System.out.printf("\nWins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }
}
