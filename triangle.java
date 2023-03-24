import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double constant = 0.5;
        System.out.print("Please enter your Length of the base of the triangle : ");
        int length = scanner.nextInt();
        System.out.print("Please enter your Height : ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        double a = length * height;
        double area = constant * a;
        System.out.println("Area of your triangle is : " + area + "cm^2");
    }
}
