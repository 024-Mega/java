import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //floating points division by zero
        System.out.println(2.1 / 0.0);
        System.out.println(-2.1 / 0.0);
        System.out.println(0.0 / 0.0);
        int x = 0;
        int y = 0;
        int z = 0;
        boolean condition = true;
        boolean con = true;
        boolean arith = true;
        System.out.println("enter value for x : ");
        while (condition) {
            try {
                x = scanner.nextInt();//input mismatch exception
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Only integers allowed, Enter a value for x again : ");
            }
            scanner.nextLine();
        }
        System.out.println("Enter value for y : ");
        while (con) {
            try {
                y = scanner.nextInt();//input mismatch exception
                con = false;
            } catch (InputMismatchException m) {
                System.out.println("Only integers  allowed , Enter a value for y again : ");
            }
            scanner.nextLine();
        }
        while (arith) {
            try {
                z = y / x;//arithmetic exception

                System.out.println(x + "/" + y + " is " + z);
                arith = false;

            } catch (ArithmeticException kofi) {
                System.out.println("Division by zero not allowed");
                scanner.nextLine();
            }
            scanner.close();
        }
    }
}
