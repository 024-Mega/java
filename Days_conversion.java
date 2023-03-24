import java.util.Scanner;
public class Days_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the months in terms of days :");
        int daysEntered = scanner.nextInt();
        //get total minutes from time entered
        int totaldays = daysEntered / 24;
        //get remaining seconds from time entered
        int remaindays = daysEntered % 24;
        //get total hours
        int totalmonth = totaldays / 24;
        //get remaining minutes
        //int remainMins = totalMin % 60;
        System.out.println(daysEntered + "days: " + totaldays+ "months  " + totalmonth + "mins  " + remaindays + "sec");

        //close scanner
        scanner.close();
    }
}
