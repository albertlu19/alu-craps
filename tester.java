
/**
 * Runs the Craps game
 * Albert Lu
 * 1-24-2019
 */
import java.util.Scanner;
public class tester
{
    public static void main(String[] args){
        Craps test = new Craps();
        boolean running = true;
        Scanner in = new Scanner(System.in);
        while(running){
            System.out.println("Welcome to Craps. Would you like to play? (Y/N)");
            String response = in.nextLine();
            if(response.equalsIgnoreCase("n")){
                running = false;
            }
            else{
                System.out.println("Would you like the directions? (Y/N)");
                String directions = in.nextLine();
                if(!directions.equalsIgnoreCase("n")){
                    System.out.println("Craps is a dice game where you roll two die.");
                    System.out.println("On the first roll, if you roll a 7 or 11 you win,");
                    System.out.println("but if you roll a 2,3, or 12, you lose.");
                    System.out.println("If you roll anything else, it becomes your point.");
                    System.out.println("From then on, if you roll your point you win,");
                    System.out.println("but if you roll a 7 you lose. Have fun!");
                }

                int dorito = 2;
                while(dorito == 2){
                    System.out.println("Press enter to roll");
                    String roll = in.nextLine();
                    dorito = test.winCon();
                    System.out.println(test.response(dorito));
                }

                System.out.println("Would you like to play again? :) Y/N");
                String repeat = in.nextLine();
                if(repeat.equalsIgnoreCase("n")){
                    running = false;
                }
            }
        }
    }
}
