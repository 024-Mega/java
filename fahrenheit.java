 import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please your temperature : ");
        double temp=scanner.nextDouble();
        double faren=9.0/5*temp+32;
        System.out.println("Your temperature in Degree Celsius is "+temp+ "Degree Celsius");
        System.out.println("Your temperature in Fahrenheit is : "+faren +"F");

    }
}
