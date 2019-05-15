package animals;

import types.Primate;

public class Ring_Tailed_Lemurs extends Primate {

    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Ring_Tailed_Lemurs()
    {
        super("Ring Tailed Lemurs", "weird monkey with a zebra tail");
        this.age = "elderly";
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
        return "wails and howls";
    }
}
