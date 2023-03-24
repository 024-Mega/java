import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading_files {
    public static void main(String[] args) throws FileNotFoundException {
        //read a text file in a folder ;
        File inputFile=new File("test.txt.txt");
       // File fileToDelete=new File("C:\\Users\\TRY\\Desktoptest_on desktop");
        //checking methods for files available
        //inputFile.
//        System.out.println(inputFile.exists());
//        System.out.println(inputFile.getAbsoluteFile());
//        System.out.println(inputFile.length());
//        System.out.println(inputFile.isHidden());
        //fileToDelete.delete();
        //read content on file: pass file variables to scanner
        Scanner input =new Scanner(inputFile);
        //loop through and print line by line content in file
        while(input.hasNextLine())
        {
          System.out.println(input.nextLine());
        }
input.close();
    }
}