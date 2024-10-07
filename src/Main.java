import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void CtoFConverter(String[] args) //CtoFConverter
    {
        double celc = 0.0;
        double farhen = 0.0;
        String trash = "";
        boolean done = true;

        do
        {
            Scanner in = new Scanner(System.in);

            System.out.print("Input a tempurature in Celcius: ");

            if(in.hasNextDouble())
            {
                celc = in.nextInt();
                farhen = (celc * (9/5)) + 32;

                System.out.println(celc + " degrees in celcius is " + farhen + " in farenheit!");
                if(celc > 99)
                    System.out.println("You are at the boiling point of water!");
                if(celc < 1)
                    System.out.println("You are in freezing tempuratures!");

                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("Enter a valid number in not " + trash);
                done = false;
            }


        }while(!done);
    }

    public static void FuelCosts(String[] args)
    {
        double gallons = 0.0;
        double MPG = 0.0;
        double price = 0.0;
        boolean done = false;
        String trash = "";
        double drivePrice = 0.0;
        double distance = 0.0;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("How many gallons of gas can fit in your car? ");


            if(in.hasNextDouble() && in.nextDouble() >= 0)
            {
                gallons = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid volume not " + trash);
            }
        }
        while(!done);

        do {
            System.out.println("What is your car's MPG? ");

            if(in.hasNextDouble() && in.nextDouble() >= 0)
            {
                MPG = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid MPG not " + trash);
                done = false;
            }
        }
        while(!done);
        do {
            System.out.println("What is the current cost of Gas? ");

            if(in.hasNextDouble() && in.nextDouble() >= 0)
            {
                price = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid cost not " + trash);
                done = false;
            }
        }
        while(!done);

        drivePrice = (100/MPG) * price;
        distance = MPG * gallons;

        System.out.println("It would cost you $" + drivePrice + " to drive 100 miles.");
        System.out.println("You can drive a total of " + distance + " miles on one full tank of gas.");

    }

    public static void RectangleInfo(String[] args)
    {
        double height = 0.0;
        double width = 0.0;
        double area = 0.0;
        double number = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter a height: ");

            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble() && in.nextDouble() >= 0)
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid height not: " + trash);
            }
        }while(!done);

        do {
            System.out.println("Enter a width: ");

            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble() && in.nextDouble() >= 0)
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid height not: " + trash);
                done = false;
            }
        }while(!done);

            area = width * height;
        number = (width * width) + (height * height);
        diagonal = Math.sqrt(number);

        System.out.println("The area of these two numbers is " + area);
        System.out.println("The diagonal of these two numbers is " + diagonal);

    }

    public static void HigherOrLower(String[] args)
    {
        int MAX = 10;
        int MIN = 1;
        int choice = 0;
        int randInt = 0;
        String trash = "";
        boolean done = false;

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        randInt = random.nextInt(MAX-MIN)+MIN;

        do
        {
            System.out.println("Choose a number between 1 - 10 (inclusive)");

            if(in.hasNextInt())
            {
                choice = in.nextInt();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Choose a valid integer not: " + trash);
            }
        }while(!done);

        if (randInt == choice)
            System.out.println("You got it right!");
        else if (randInt > choice)
            System.out.println("Sorry the number is greater than yours!");
        else
            System.out.println("Sorry the number is less than yours!");
    }
}