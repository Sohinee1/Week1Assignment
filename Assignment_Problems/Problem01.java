import java.util.Scanner;

public class Problem01 {

    public static void playGame(String player1, String player2) {
        if (player1.equals(player2)) {
            System.out.println("Draw");
        } else if ((player1.equals("rock") && player2.equals("scissors"))
                || (player1.equals("paper") && player2.equals("rock"))
                || (player1.equals("scissors") && player2.equals("paper"))) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: ");
        String player1 = sc.nextLine().toLowerCase();

        System.out.print("Player 2: ");
        String player2 = sc.nextLine().toLowerCase();

        playGame(player1, player2);
        sc.close();
    }
}
