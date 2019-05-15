package types;
import animal_qualities.Swimming;
import main.*;

public class Reptile extends Animal implements Swimming {
    public Reptile ()
    {
        super("Reptiles", "They swim around in the water");

    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Clicking noises";
    }
    public String eat()
    {
        return "insects and deer";
    }
    public String swim() {return "Swim around with ease";}

}
