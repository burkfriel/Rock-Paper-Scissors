import java.util.Scanner;

public class RockPaperSicissors {

    public static void main(String[] largs) {
        Scanner keyboard;

        int playerPicked;
        int computerpicked;
        int computerscore;
        int playerscore;
        computerscore = 0;
        playerscore = 0;
        String again;

        keyboard = new Scanner(System.in);

        do {
            System.out.println("Choose a number between 1-3");
            System.out.println("1 Rock,2 Paper,3 Scissors");
            playerPicked = keyboard.nextInt();
            computerpicked = (int)(Math.random()*3)+1;

            if (computerpicked==1){
                System.out.println("I pick Rock");
            }
            else if (computerpicked==2){
                System.out.println("I pick Paper");
            }
            else if (computerpicked==3){
                System.out.println("I pick Scissors");
            }
            again = "";

            if (playerPicked==computerpicked){
                System.out.println("It is a tie no points.");
            }
            else if (playerPicked==1 && computerpicked==2){
                System.out.println("I win 1 point for me.");
                computerscore+=1;
            }
            else if (playerPicked==1 && computerpicked==3){
                System.out.println("You win that round 1 pint for you.");
                playerscore+=1;
            }
            else if (playerPicked==2 && computerpicked==1){
                System.out.println("You win that round 1 point for you.");
                playerscore+=1;
            }
            else if (playerPicked==2 && computerpicked==3){
                System.out.println("You lose 1 point for me.");
                computerscore+=1;
            }
            else if (playerPicked==3 && computerpicked==1){
                System.out.println("You lose 1 point for me.");
                computerscore+=1;
            }
            else if (playerPicked==3 && computerpicked==2){
                System.out.println("You win 1 point for you.");
                playerscore+=1;
            }

            System.out.println("Your score is "+playerscore+" my score is "+computerscore+".");
            System.out.println("Would you like to play again yes or no.");
            again = keyboard.next().toLowerCase();


        }while(again.equals("yes"));
        System.out.println("Your final score was "+playerscore+".");
        System.out.println("My final score was "+computerscore+".");
        System.out.println("Thank you for playing Rock Paper Scissors.");





    }

}
