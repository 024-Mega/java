import java.io.*;
import java.util.Scanner;

public class reading_caps {
    public static void main(String[] args) throws IOException {
        try{
        File file=new File("C:\\Users\\TRY\\Desktop\\caps.txt");
        PrintWriter writer = new PrintWriter("C:\\Users\\TRY\\Desktop\\out.txt");

        Scanner input=new Scanner(file);
        while(input.hasNextLine()){
            String line=input.nextLine();
            writer.println(line.toUpperCase());
        }
        writer.close();
        input.close();
        }
        catch(IOException t){
            System.out.println("SUCCESS");
        }

    }
}
