 import java.util.Scanner;
public class time_conversion {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your time in seconds :");
        int timeEntered =scanner.nextInt();
        //get total minutes from time entered
        int totalMin=timeEntered/60;
        //get remaining seconds from time entered
        int remainSec=timeEntered%60;
        //get total hours
        int totalHrs=totalMin/60;
        //get remaining minutes
        int remainMins=totalMin%60;
        System.out.println(timeEntered+"secs : "+ totalHrs+"hrs  "+totalMin+"mins  "+remainSec+"sec");

        //close scanner
        scanner.close();
    }
}
