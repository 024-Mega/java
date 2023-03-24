import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter an integer : ");
                int num_1 = scanner.nextInt();
                System.out.println("Enter a different number, an integer :");
                int num_2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Your first number is : " + num_1 + "  and your second number is : " + num_2);
                if (num_1 % num_2 == 0) {
                    System.out.println(num_1 + " is a multiple of " + num_2);
                } else {
                    System.out.println(num_1 + " is not a multiple of " + num_2);

                }
            }
        }


