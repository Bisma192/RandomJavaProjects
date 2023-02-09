public class Main
{
    public static void main(String[] args)
    {
        //8. Write a Java program to remove "b" and "ac" from a given string. Go to the editor
        //
        //Sample Output:
        //
        //The given string is: abrambabasc
        //After removing the new string is: aramaasc



        String word = "abrambabasc";
        word = word.replaceAll("b","").replaceAll("ac","");
        System.out.println(word);






    }
}