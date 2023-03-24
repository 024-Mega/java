import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your mark : ");
        double mark=scanner.nextDouble();
        if ((mark>=80)&&(mark<=100))
        {
            System.out.println(mark+" is 1st Class");
        }
        else if ((mark>=70)&&(mark<80))
        {
            System.out.println(mark+" is 2nd Class Upper");
        }
        else if ((mark>=60)&&(mark<70))
        {
            System.out.println(mark+" is 2nd Class Lower");
        }
        else if ((mark>=50)&& (mark<60))
        {
            System.out.println(mark+" is Pass");
        }
        else if ((mark>=0)&&(mark<49))
        {
        System.out.println("Fail");
        }
        else {
            System.out.println("Invalid mark");
        }
        {

        }

    }
}
