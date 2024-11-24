import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerPoints = 0;
        int compPoints = 0;

        System.out.println("Rock Paper Scissor Game! \nRules: Enter Rock, Paper, or Scissor. \nType 'exit' to exit game");

        String move = scanner.nextLine().toLowerCase();


        while (!move.equals("exit")) {

            if (!move.equalsIgnoreCase("rock") && !move.equalsIgnoreCase("paper") && !move.equalsIgnoreCase("scissor")) {
                System.out.println("Invalid move. Try again.");
            }else{

                if(playerWin(move, computerMove(move))){
                    playerPoints++;
                }else if(compWin(move, computerMove(move))){
                    compPoints++;
                }else{
                    System.out.println("Its a tie!");
                }

                System.out.println("Player points: " + playerPoints + "\nComputer points: " + compPoints);
                System.out.println("Your move.");
            }

            move = scanner.nextLine().toLowerCase();

        }

    }

    static String computerMove(String compMove) {
        Random rand = new Random();
        int randomNum = rand.nextInt(3);

        if(randomNum == 0) {
            compMove = "rock";
        }else if(randomNum == 1) {
            compMove = "paper";
        }else {
            compMove = "scissor";
        }
        System.out.println("Computer move: " + compMove);

        return compMove;

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

    static boolean compWin(String move, String compMove){
        if(move.equals("scissor") && compMove.equalsIgnoreCase("rock")) {
            System.out.println("Computer win!");
            return true;
        }else if(move.equals("paper") && compMove.equalsIgnoreCase("scissor")) {
            System.out.println("Computer win!");
            return true;
        }else if(move.equals("rock") && compMove.equalsIgnoreCase("paper")) {
            System.out.println("Computer win!");
            return true;
        }else{
            return false;
        }
    }


}