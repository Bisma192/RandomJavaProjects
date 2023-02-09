import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        /*7. Write a Java program to takes the user for a distance (in meters) and the time was taken
         (as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
         kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor

        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804
*/
        System.out.println("Time taken for the Distance");
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        float Meters = input.nextFloat();
        System.out.print("Input hours: ");
        float Hours = input.nextFloat();
        System.out.print("Input minutes: ");
        float Minutes = input.nextFloat();
        System.out.print("Input seconds: ");
        float Seconds = input.nextFloat();

        float TotalSeconds= (((Hours*60)*60) + (Minutes*60) + Seconds);
        float MetersPerSecond = Meters/TotalSeconds;
        System.out.println("Your speed in meters/second is: " + MetersPerSecond);

        float TotalHours = (Hours + (Minutes/60) + ((Seconds/60)/60));
        float Kilometers = Meters/1000;
        float KilometersPerHour = Kilometers/TotalHours;
        System.out.println("Your speed in km/h is: " + KilometersPerHour);

        float Miles = (float) (Kilometers* 0.6214);
        float MilesPerHour = Miles/TotalHours;
        System.out.println("Your speed in miles is : "+ MilesPerHour);





    }
}