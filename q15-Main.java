import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main
{
    public static void main(String[] args)
    {
//Write a Java program to add some hours to the current time.
        LocalDateTime LocalDate = LocalDateTime.now();
        System.out.println(LocalDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf.format(LocalDate));
        System.out.println(dtf.format(LocalDate.plusHours(1)));




    }
}