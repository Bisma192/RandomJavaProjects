import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int Guess = 0;
        int turns = 3;
        int runningTotal = 0;

        Random rnd = new Random();

        for (int i = 1; i <= turns; i++)
        {

            int rndPercentage = rnd.nextInt(100) + 1;
            PrintBar(rndPercentage);

            System.out.println("Please guess a number: ");
            Scanner input = new Scanner(System.in);
            Guess = input.nextInt();

            System.out.println(isCorrect(Guess, rndPercentage));

            if (isCorrect(Guess, rndPercentage))
            {
                System.out.println("Correct guess");
            } else
            {
                System.out.println("you were out by " + remaining(rndPercentage, Guess));
                runningTotal += remaining(rndPercentage, Guess);

            }

        }

        int AvgAccuracy = (runningTotal / 3);
        AvgAccuracy = Math.abs(AvgAccuracy);


        System.out.println("average which the scores were off by: " + AvgAccuracy);

        comment(AvgAccuracy);


    }

    //calculates how many remaining out of 100.
    public static int remaining(int rndPercentage, int Guess)
    {
        return (Math.abs(rndPercentage - Guess));

    }

    //prints bar
    public static void PrintBar(int percentage)
    {

        int emptyBar = 100 - percentage;

        System.out.print("|");

        for (int i = 1; i <= percentage; i++)
        {
            System.out.print("+");
        }
        for (int i = 1; i <= emptyBar; i++)
        {
            System.out.print("-");
        }

        System.out.println("|");

        //System.out.println("Debug rand percent = [" + percentage + "]");
    }


    //checks answer returns true or false
    public static boolean isCorrect(int Guess, int rndPercentage)
    {
        return (rndPercentage == Guess);

    }


    //comments depending on how many left over
    public static void comment(int avgScore)
    {

        if (avgScore == 0)
        {
            System.out.println("That's perfect, were you cheating?!");
        } else if (avgScore == 1)
        {
            System.out.println("wow! so close!");

        } else if (avgScore == 2 || avgScore == 3)
        {
            System.out.println("you were only 2 or 3 away!");
        } else if (avgScore >= 4 && avgScore < 10)
        {
            System.out.println("you were less than 10 away!");
        } else if (avgScore >= 10 && avgScore <= 20)
        {
            System.out.println("you were less than 21 away!");
        } else if (avgScore > 20)
        {
            System.out.println("you were more than 20 away!  Try Harder!");
        }


    }


}