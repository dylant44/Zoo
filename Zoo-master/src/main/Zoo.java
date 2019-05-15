package main;

import main.Animal;
import types.*;
import animals.*;
import  animal_qualities.*;
import Shops.Concessions;
import Shops.Gift_Shop;
import Shops.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
/**
 * Test
 *
 * @author APCSA2014-15
 * @version 2015-03-06
 */
public class Zoo
{
    public static  void main(String[] args) throws InterruptedException
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to the Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            switch(text)
            {
                case "help" :
                    msg = "So far we can visit cages, listen, leave \n"+
                            "buy gifts, buy food, and ask for help.";
                    break;
                case "visit cages" :
                    msg = visitCages(animals);
                    break;
                case "look up" :
                    msg = lookUp(animals);
                    break;
                case "look around" :
                    msg = lookAround(animals);
                    break;
                case "listen" :
                    msg = listen(animals);
                    break;
                case "look down":
                    msg = lookDown(animals);
                    break;
                case "buy gifts":
                    msg = Gift_Shop.checkout(in);
                    break;
                case "buy food":
                    msg = Concessions.checkout(in);
                    break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }

        System.out.println(Math.random() < .8 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");

    }

    private static String visitCages(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " + a.getDesc() + "\n";
        }
        return msg;
    }

    private static String listen(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       "
                    + a.makeNoise() + "\n";
        }
        return msg;
    }

    private static String lookDown(ArrayList<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Swimming)
            {
                Swimming f = (Swimming) a;
                msg += a.getName() + ": \n       "
                        + f.swim() + "\n";
            }
        }
        return msg;

    }

    private static String lookAround(List<Animal> animals) {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Walking)
            {
                Walking w = (Walking) a;
                msg += a.getName() + ": \n       "
                        + w.walk() + "\n";
            }
        }
        return msg;

    }

    private static String lookUp(ArrayList<Animal> animals) {
        String msg = "";

        for(Animal a : animals) {
            if(a instanceof Flying) {
                Flying f = (Flying) a;
                msg += a.getName() + ": \n       "
                        + f.fly() + "\n";
            }
        }
        return msg;

    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    private static void delayDots(int dotAmount) throws InterruptedException
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    private static void delayDots() throws InterruptedException
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    private static void populateAnimals(List<Animal> animals)
    {

        Primate hairy = new Primate();
        animals.add(hairy);
        Chimpanzee george = new Chimpanzee();
        animals.add(george);
        Alligator ally = new Alligator();
        animals.add(ally);
        Orangutan bobo = new Orangutan();
        animals.add(bobo);
        Parrot larry = new Parrot();
        animals.add(larry);
        Ring_Tailed_Lemurs seamer = new Ring_Tailed_Lemurs();
        animals.add(seamer);
        Zebra zeze = new Zebra();
        animals.add(zeze);

    }
}