import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        //checking the year of birth using the zodiac signs
        Scanner scanner=new Scanner(System.in);
        //ask the user to enter the year of birth
        System.out.println("Enter your year of birth : ");
        int YoB=scanner.nextInt();
        switch(YoB%12)
        {
            case 0:
                System.out.println("You were born in the year of Monkey");
                break;
            case 1:
                System.out.println("You were born in the year of Rooster");
                break;
            case 2:
                System.out.println("You were born in the year of Dog");
                break;
            case 3:
                System.out.println("You were born in the year of Pig");
                break;
            case 4:
                System.out.println("You were born in the year of Rat");
                break;
            case 5:
                System.out.println("You were born in the year of Ox");
                break;
            case 6:
            System.out.println("You were born in the year of Tiger");
                break;
            case 7:
                System.out.println("You were born in the year of Rabbit");
                break;
            case 8:
                System.out.println("You were born in the year of Dragon");
                break;
            case 9:
                System.out.println("You were born in the year of Snake");
                break;
            case 10:
                System.out.println("You were born in the year of Horse");
                break;
            default:
                System.out.println("You were born in the year of Sheep");



        }
    }
}
