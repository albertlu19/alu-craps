
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    private Die d1;
    private Die d2;
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * rolls out an int array which contains the dice
     */
    public int[] roll()
    {
        int[] diceHolder = new int[2];
        diceHolder[0] = d1.roll();
        diceHolder[1] = d2.roll();
        return diceHolder;
    }
}
