import java.util.Scanner;


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
}