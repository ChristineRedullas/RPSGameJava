import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        int playerPoints = 0;
        int compPoints = 0;

        System.out.println("Rock Paper Scissor Game!" + "\nRules: Enter Rock, Paper, or Scissor. \nType 'exit' to exit game");

        String move = scanner.nextLine().toLowerCase();

        if(move.equalsIgnoreCase("exit")) {
            System.exit(0);
        }else{
            String compMove;
            if(randomNum == 0) {
                compMove = "Rock";
            }else if(randomNum == 1) {
                compMove = "Paper";
            }else {
                compMove = "Scissor";
            }

            System.out.println("Computer plays " + compMove);




            System.out.println("Player points: " + playerPoints + "\nComputer points: " + compPoints);
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

//    static int points(){
//        if(playerWin() == true){
//            playerPoints++;
//        }else if(playerWin() == false){
//            compPoints++;
//        }else{
//            System.out.println("It's a tie!");
//        }
//    }
}