import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String S1=scanner.nextLine();
        System.out.print(" Enter another string : ");
        String S2= scanner.nextLine();
        if(S1.contains(S2))
        {
            System.out.println(S2+" is a substring of "+S1);
        }
        else{
            System.out.println(S2+" is not a substring of "+S1);
        }


    }
}
