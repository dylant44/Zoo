package types;
import animal_qualities.Flying;
import main.*;

public class Bird extends Animal implements Flying {
    public Bird()
    {
        super("bird", "They fly around in the sky");

    }
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Squaking noises";
    }
    public String eat()
    {
        return "worms and seeds";
    }
    public String fly() {return "Fly around with ease";}

}
