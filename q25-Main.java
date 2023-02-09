import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
/*26. Write a Java program to display the following character rhombus structure. Go to the editor

Test Data
Input the number: 7
Expected Output :


      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
ABCDEFGFEDCBA
 ABCDEFEDCBA
  ABCDEDCBA
   ABCDCBA
    ABCBA
     ABA
      A

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int G = input.nextInt();
        String space = " ";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lastLetters= "";

        for (int i = 0; i<=(G); i++)//ROWS
        {
            for (int spaces = G - i; spaces > 0; spaces--)//REMOVE SPACES
            {
                System.out.print(" ");

            }
            //remove space  every iteration
            char letter = alphabet.charAt(i);
            System.out.println(lastLetters);
            lastLetters += letter;


        }


    }
}