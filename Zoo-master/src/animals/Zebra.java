package animals;
import types.Primate;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Zebra
     */
    public Zebra()
    {
        super("Zebra", "black and white striped horse");
        this.age = "young";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * 
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "neighs";
    }

    
    
}
