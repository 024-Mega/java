import java.util.Scanner;

public class more_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string (Main string) : ");
        String S1=scanner.nextLine();
        System.out.print(" Enter another string (S2) : ");
        String S2= scanner.nextLine();
        System.out.print(" Enter another string (S3) : ");
        String S3= scanner.nextLine();
        System.out.print(" Enter another string (S4) : ");
        String S4= scanner.nextLine();

        if((S1.contains(S2)) &&(S1.contains(S3))&&(S1.contains(S4)))
        {
            System.out.println(S2 + ", "+S3+", "+"and "+S4+" are  substrings of "+S1);
        }
        else if((S1.contains(S2)) &&(S1.contains(S3))!=(S1.contains(S4)))
        {
         System.out.println(S2 + " and "+S3+" are  substrings of "+S1 +" but "+S4+" is not a substring of "+S1);
       }

        else if((S1.contains(S2))&&(S1.contains(S4))!=(S1.contains(S3)))
        {
            System.out.println(S2 + " and "+S4+" are  substrings of "+S1 +" but "+S3+" is not a substring of "+S1);
        }
    }
}
