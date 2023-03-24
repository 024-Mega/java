import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writingtoanewfile {
    public static void main(String[] args) {

        //reading from the Text.txt file
        try {
            File fileToRead = new File("C:\\Users\\Kennedy\\Desktop\\caps.txt");

            PrintWriter fileToWrite = new PrintWriter("C:\\Users\\Kennedy\\Desktop\\Out.txt");

            Scanner input = new Scanner(fileToRead);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                fileToWrite.println(line.toUpperCase());
            }


            fileToWrite.close();
            input.close();

            System.out.println("conversion successful");

        } catch (FileNotFoundException e) {
            System.out.println("Error : "+ e.getMessage());
        }

    }
}

