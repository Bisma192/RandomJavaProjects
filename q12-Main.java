import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //12. Write a Java program to check whether a number is a Harshad Number or not. Go to the editor
        //In recreational mathematics, a harshad number in a given number base, is an integer that is divisible
        // by the sum of its digits when written in that base.
        //Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200
        // is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1)
        // and 171 is divisible by 9.
        //Expected Output
        //
        //Input a number : 353
        //353 is not a Harshad Number.
        //1. if statement.Get Chosen number
        //2.split chosen number and add all the digits in the chosen number to make Total
        //3. chosen number / total = 0 true or false

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find out if it is a Harshad Number: ");
        int ChosenNumb = input.nextInt();
        String ChosenString = Integer.toString(ChosenNumb);//COVERTED TO STRING
        String[] ChosenStringSplit = ChosenString.split("");//SPLIT

        int total = 0;

        //FORLOOP TO ADD ALL THE NUMBERS TO MAKE TOTAL
        for(int i = 0; i< ChosenStringSplit.length; i++ ){
            total += Integer.parseInt(ChosenStringSplit[i]);
        }
        System.out.println(total);

        //DEVIDE CHOSEN NUMBER BY TOTAL
        if (ChosenNumb%total==0){
            System.out.println("It is a Harshad Number.");
        }
        else {
            System.out.println("It is NOT a Harshad Number.");
        }






    }
}