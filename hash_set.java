import java.util.HashSet;
import java.util.Set;

public class hash_set {
    public static void main(String[] args) {
        //CREATING HASHSET
        HashSet<String> stdnames=new HashSet<>();
        Set<String> newnames=new HashSet<String>();
        HashSet<Double>stdmarks=new HashSet<>();
        //CHECKING METHODS IN HASHSET
        //stdnames
        //ADDING CONTEMT TO HASHSET
        stdnames.add("Bernice");
        stdnames.add("Kenny");
        stdnames.add("John");
        stdnames.add("Eunice");

        newnames.add("Cream");
        newnames.add("Qasty");
        newnames.add("John");
        //PRINTING CONTENT OF HASHSET
        System.out.println("Newnames");
        System.out.println(newnames);
        System.out.println("stdnames");
        System.out.println(stdnames);
//        //FINDING THE INTERSECTION OF SETS
//        stdnames.retainAll(newnames);
//        System.out.println("After Intersection");
//        System.out.println("stdnames");
//        System.out.println(stdnames);
//        //FINDING THE UNION
//        stdnames.retainAll(newnames);
//        System.out.println("After union");
//        System.out.println("stdnames");
//        System.out.println(stdnames);
        //FINDING SUBTRACTION
        stdnames.retainAll(newnames);
        System.out.println("After subtraction");
        System.out.println("newnames");
        System.out.println(stdnames);


    }
}
