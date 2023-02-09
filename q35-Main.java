import java.security.KeyStore;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
//Sample array: [1,2,4,5,6]
//Target value: 6.

        int[] Numb = {1, 2, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.println("Type a total you want to achieve: ");
        int Total = input.nextInt();

        int i;//number in array
        //numb.length ==hw many numbers in list
        //change the starting number

        for (int j = 0; j< Numb.length; j++)//changes value of j after for loop has finished
        {
            for (i = 0; i < Numb.length; i++)//uses 'j' to iterate through all the numbers
            {
                if (Numb[i] + Numb[j] == Total)
                {
                    System.out.println(Numb[i] + "+" + Numb[j] + "=" + Total);
                }
            }

        }
    }
}