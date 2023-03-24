import java.util.Scanner;

public class IF_Statements {
    public static void main(String[] args) {
        //Checking if a number is odd
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num= scanner.nextInt();
        if (num%2!=0){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }

    }
}
