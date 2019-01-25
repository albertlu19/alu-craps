
/**
 * This class creates a die that can roll.
 *
 * Albert Lu
 * 1/23/18
 */
public class Die
{
    /**
     * constructor for the Die class
     */
    public Die()
    {
        // initialise instance variables

    }
    /**
     * Rolls a dice. Gets a value 1-6
     */
    public int roll(){
        int random = (int)(Math.random()*6+1);
        return random;
    }

}
