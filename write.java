import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
        try{
        FileWriter ken = new FileWriter("C:\\Users\\TRY\\Desktop\\secrete_message.txt");

           ken.write("Hello");
           ken.append("\n this is just to write to a file");
           ken.close();
        }
        catch(IOException h){

        }
    }
}
