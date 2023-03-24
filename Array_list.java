import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        //CREATING AN ARRAY LIST
        ArrayList<String> stdnames=new ArrayList<>();
        ArrayList<String> newnames=new ArrayList<>();
        ArrayList<Integer> stdmarks=new ArrayList<>();


        //CHECKING METHODS
        //ADDING CONTENT TO ARRAY LIST
        stdnames.add("Jane");
        stdnames.add("Cream");
        stdnames.add("Qasty");
        newnames.add("Janee");
        newnames.add("John");
        newnames.add("Kofi");
        stdmarks.add(20);


        //PRINT THE CONTENT BY CALLING THE NAME OF THE ARRAY LIST
        System.out.println(stdmarks);
        System.out.println(stdnames);
        System.out.println(newnames);


        //REMOVING AN  ELEMENT FROM AN ARRAY LIST
        newnames.remove("Kofi");

        System.out.println(newnames);


        //USING INDEX TO REMOVE
        newnames.remove(1);
        System.out.println(newnames);


        //ADDING  ALL CONTENT OF ONE ARRAY LIST TO THE OTHER
        newnames.addAll(stdnames);
        stdnames.addAll(newnames);
        System.out.println("AFTER ADD ALL");
        System.out.println(stdnames);
        System.out.println(newnames);
        newnames.addAll(stdnames);
        System.out.println(newnames);

        //SORTING
        Collections.sort(stdnames);
        System.out.println(stdnames);
        //REVERSING AN ARRAY
        System.out.println("Reversing");
        Collections.reverse(stdnames);
        System.out.println(stdnames);
        //GETTING THE NUMBER OF STUDENTS
        System.out.println(stdnames.size());

    }
}
