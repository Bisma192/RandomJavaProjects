import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //18. Write a Java method that accept three integers and check whether they are consecutive are not.
        // Return true or false.
        //
        //Expected Output:
        //Input the first number:  15
        //Input the second number:  16
        //Input the third number:  17
        //Check whether the three said numbers are consecutive or not!true

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = input.nextInt();
        System.out.println("Enter second number : ");
        int b = input.nextInt();
        System.out.println("Enter third number : ");
        int c = input.nextInt();

        if (((a + 1 == b) && (b + 1 ==c)) || ((a -1 == b) && (b -1 == c)))
        {
            System.out.println("true. Consecutive");
        } else
        {
            System.out.println("false. Not consecutive");
        }



    }

}