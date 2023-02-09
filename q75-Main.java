public class Main
{
    public static void main(String[] args)
    {
       //75. Write a Java program to test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2. Go to the editor
        //Test Data: array = 50, -20, 0, 30, 40, 60, 10
        //Sample Output:
        //false

       int [] TestData = {50,-20,0,30,40,60,10};
       //for (int i=0; i<TestData.length; i++)
       //    System.out.println(TestData[i]);

       if (TestData[0] == TestData[TestData.length-1])
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }





    }
}