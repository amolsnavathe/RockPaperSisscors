//This is just a rock paper scissors game... hope it works well..
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String [] rps = {"r", "p", "s"};
        String CompMove = rps[new Random(). nextInt(rps.length)];
        String PlayerMove;

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your move(r for rock, p for paper, s for scissors):");
            PlayerMove = scanner.nextLine();
            if (PlayerMove.equals("r") || PlayerMove.equals("p") || PlayerMove.equals("s")) {
                break;
            }
            System.out.println(PlayerMove + " is not a valid move");
        }
        System.out.println("Computer Chose: " + CompMove + " You Chose: " +PlayerMove);

        if (PlayerMove.equals(CompMove)) {
            System.out.println("It's a Tie!");
        }
        else if (PlayerMove.equals("r")) {
            if (CompMove.equals("p")){
                System.out.println("You Lose!");
            } else if (CompMove.equals("s")) {
                System.out.println("You Win!");
            }
        }
        else if (PlayerMove.equals("p")) {
            if (CompMove.equals("r")){
                System.out.println("You Win!");
            } else if (CompMove.equals("s")) {
                System.out.println("You Lose!");
            }
        }
        else if (PlayerMove.equals("s")) {
            if (CompMove.equals("p")){
                System.out.println("You Lose!");
            } else if (CompMove.equals("r")) {
                System.out.println("You Win!");
            }
        }
    }
};