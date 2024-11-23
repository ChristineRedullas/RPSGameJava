import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String compMove;
        int playerPoints = 0;
        int compPoints = 0;

        System.out.println("Rock Paper Scissor Game!" + "\nRules: Enter Rock, Paper, or Scissor. \nType 'exit' to exit game");

        String move = scanner.nextLine().toLowerCase();

        while (!move.equals("exit")) {
            int randomNum = rand.nextInt(3);

            if(randomNum == 0) {
                compMove = "rock";
            }else if(randomNum == 1) {
                compMove = "paper";
            }else {
                compMove = "scissor";
            }

            System.out.println("Computer plays " + compMove);


            if (playerWin(move, compMove)) {
                playerPoints++;
            } else {
                if(move.equals(compMove)) {
                    System.out.println("It's a tie!");
                }else{
                    compPoints++;
                }
            }

            System.out.println("Player points: " + playerPoints + "\nComputer points: " + compPoints);

            System.out.println("Your move.");

            move = scanner.nextLine().toLowerCase();


        }




    }

    static boolean playerWin(String move, String compMove){
        if(move.equals("rock") && compMove.equalsIgnoreCase("scissor")) {
            System.out.println("You win!");
            return true;
        }else if(move.equals("scissor") && compMove.equalsIgnoreCase("paper")) {
            System.out.println("You win!");
            return true;
        }else if(move.equals("paper") && compMove.equalsIgnoreCase("rock")) {
            System.out.println("You win!");
            return true;
        }else{
            return false;
        }

    }


}