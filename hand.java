import java.util.InputMismatchException;
import java.util.Scanner;

public class hand {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        int count;
        int count1;
        boolean condition = true;
        boolean conditiony=true;
        boolean con=true;
        System.out.println("Enter a value for x : ");
        while (condition){
            try {
                x = scanner.nextDouble();
                System.out.println("x is "+x);
                condition = false;
            } catch (InputMismatchException i) {
                System.out.println("only integers allowed, Please enter a value of x again : ");
                for (count = 1; count <= 3; count++) {

                    if (count == 3) {
                        System.out.println("You have exceeded your attempts !!");
                    }

                }
                scanner.nextLine();
            }
        }
        System.out.println("Enter a value for y : ");

        while(conditiony) {
            try {
                y = scanner.nextDouble();
                System.out.println("y is "+y);
                conditiony=false;
            } catch (InputMismatchException k) {
                System.out.println("Only integers allowed  , Please enter a value for y again : ");
            }
            scanner.nextLine();
        }
        while(con) {
            try {
                z = x / y;
                System.out.println("x/y is " + z);
                con = false;
            } catch (ArithmeticException e) {
                System.out.println("zero division not allowed");
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}




