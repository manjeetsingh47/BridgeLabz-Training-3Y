package String.level_2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String GetComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String GetWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Draw";

        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "User" : "Computer";
            case "paper":
                return (computerChoice.equals("rock")) ? "User" : "Computer";
            case "scissors":
                return (computerChoice.equals("paper")) ? "User" : "Computer";
            default:
                return "Invalid";  // Invalid user input
        }
    }

    public static String[][] GetStats(int userWins, int computerWins, int totalGames) {
        double userPercent = totalGames > 0 ? (userWins * 100.0) / totalGames : 0;
        double computerPercent = totalGames > 0 ? (computerWins * 100.0) / totalGames : 0;

        String[][] stats = new String[3][3];
        stats[0][0] = "Player Wins";
        stats[1][0] = "Computer Wins";
        stats[2][0] = "Total Games";

        stats[0][1] = Integer.toString(userWins);
        stats[1][1] = Integer.toString(computerWins);
        stats[2][1] = Integer.toString(totalGames);

        stats[0][2] = String.format("%.2f%%", userPercent);
        stats[1][2] = String.format("%.2f%%", computerPercent);
        stats[2][2] = "100%";

        return stats;
    }

    public static void DisplayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game | User Choice | Computer Choice | Winner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%4d | %-11s | %-15s | %s\n",
                    i + 1,
                    gameResults[i][0],
                    gameResults[i][1],
                    gameResults[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.printf("%-15s | %-10s | %-10s\n", "Category", "Count", "Percentage");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s | %-10s | %-10s\n",
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[][] gameResults = new String[numGames][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors) for game " + (i + 1) + ": ");
            String userChoice = scanner.nextLine().toLowerCase();

            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = GetComputerChoice();
            String winner = GetWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = GetStats(userWins, computerWins, numGames);
        DisplayResults(gameResults, stats);
    }
}

