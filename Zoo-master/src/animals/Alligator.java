package animals;


import types.Reptile;

/**
 * Write a description of class animals.Alligator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Alligator
     */
    public Alligator()
    {
        super("Alligator", "large scaly lizard");
        this.age = "";
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
        return "bellows";
    }



}
