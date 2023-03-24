import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class reading_from_sites {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://elearning.umat.edu.gh/");
        Scanner jay=new Scanner(url.openStream());
        while(jay.hasNextLine()){
            System.out.println(jay.nextLine());
        }
        jay.close();
    }
}
