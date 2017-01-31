import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;/**Calls appropriate Java utilities
 * Created by Rob on 1/21/2017.
 */
public class DurationBetweenDates {

    public static void main(String args[]) {


        Scanner scnr = new Scanner(System.in);

        //Get dates from user
        System.out.println("Please enter first date: ");
        System.out.println("Day (Two digits please): ");
        int firstDay = scnr.nextInt();
        System.out.println("Month (Two digits please): ");
        int firstMonth = scnr.nextInt();
        System.out.println("Year (Four digits please): ");
        int firstYear = scnr.nextInt();
        System.out.println(" ");
        System.out.println("Please enter second date: ");
        System.out.println("Day (Two digits please): ");
        int secondDay = scnr.nextInt();
        System.out.println("Month (Two digits please): ");
        int secondMonth = scnr.nextInt();
        System.out.println("Year (Four digits please): ");
        int secondYear = scnr.nextInt();

        LocalDate startDate = LocalDate.of(firstYear, firstMonth, firstDay);//Establish dates for use with Period
        LocalDate endDate = LocalDate.of(secondYear, secondMonth, secondDay);

        Period diff = Period.between(startDate, endDate); //Use Java utility Period to calculate difference

        System.out.printf("Difference is %d years, %d months and %d days ", //Uses format to print answer
                diff.getYears(), diff.getMonths(), diff.getDays());


    }




}
