import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //169. Write a Java program to reverse the content of a sentence
        // (assume a single space between two words) without reverse every word. Go to the editor
        //
        //Input a string: The quick brown fox jumps over the lazy dog
        //Result: dog lazy the over jumps fox brown quick The


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String Sentence = input.nextLine();
        //(SPLIT METHOD RETURNS AN ARRAY AND TYPE IN () AT WHICH CHARACTER YOU WANT TO SPLIT)
        String Word[]= Sentence.split(" ");
        System.out.println("Number of words: " + Word.length);
        System.out.println();

        int WordLength= Word.length;
        for (int i=WordLength-1; i>=0; i--)
        {
            System.out.print(Word[i] + " ");
        }





    }
}