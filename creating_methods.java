import java.util.ArrayList;

public class creating_methods {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> hometown=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        
        
        names.add("Ibrahim");
        names.add("Fatimah");
        names.add("Gaius");
        names.add("Bernice");
        
        
        hometown.add("Kwashiman");
        hometown.add("Tamale");
        hometown.add("Esiama"); 
        hometown.add("Kumasi");
        
        ages.add(56);
        ages.add(21);
        ages.add(20);
        ages.add(22);
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
