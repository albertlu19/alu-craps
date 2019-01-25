
/**
 * Craps class. Creates the wincon & the printed lines
 * 
 * Albert Lu
 * 1-22-2019
 */
public class Craps
{
    private Dice d1;
    private int firstRoll;
    private int rollTide;
    private int roll;

    /**
     * Constructor for objects of class Craps
     */
    public Craps()
    {
        d1 = new Dice();
        rollTide = 0;
        firstRoll = 0;
        roll = 0;
    }

    /**
     * Checks to see if the game is over
     * returns 1 if win, 2 if keep going, 3 if loss
     */
    public int winCon()
    {
        int[] dorito = d1.roll();
        roll = dorito[0] + dorito[1];
        if (rollTide == 0){
            firstRoll = roll;
            rollTide = 1;
            if (roll == 7 || roll == 11){
                return 1;
            }
            else if(roll == 2 || roll == 3 || roll == 12){
                return 3;
            }
            else{
                return 2;
            }
        }else{
            if(firstRoll == roll){
                return 1;
            }
            else if(roll == 7){
                return 3;
            }
            else{
                return 2;
            }
        }
    }
    /**
     * Prints out the response to any roll. 
     * param win (Will fill with this.winCon() eventually) takes in whether we won/lost/keep going
     */
    public String response(int win){
        String wResponse = "You rolled a " + roll + ". Congrats! you win!";
        String lResponse = "You rolled a " + roll + " you filthy trash can! Congrats! you lose!";
        String dResponse = "You rolled a " + roll + ". Keep going!";
        if(win==1){
            return wResponse;
        }
        if(win==2){
            return dResponse;
        }
        else{
            return lResponse;
        }
    }

}
