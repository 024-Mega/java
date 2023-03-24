 import java.util.Scanner;
public class Text_quiz {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
      //  int a=2;
        //int b=3;
        System.out.println("Please enter a number:");
        int numEntered=scanner.nextInt();
        if(numEntered%2==0) {
            System.out.println("Shirt");
        }
        else if(numEntered%3==0){
            System.out.println("Trouser");
        }
        else{
            System.out.println("Iron");
        }
        }
    }

