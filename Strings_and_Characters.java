import java.util.Locale;

public class Strings_and_Characters {
    public static void main(String[] args) {

        //Escape sequences in Java \t  \n  \"  \'  \b
        System.out.println("Testing to see \t Tab");
        System.out.println("Testing to see \n  Newline");
        System.out.println("Testing to see \' Single quote\'" );
        System.out.println("Testing to see \" Double quotes\"");
        //Casting Characters as a number and vise versa

        System.out.println("5256 denotes char "+(char)5256);
        System.out.println("525 denotes char "+(char)525);
        System.out.println("2665 denotes char "+(char)2665);
        System.out.println("202 denotes char "+(char)202);

        //finding characters in numbers
        System.out.println("? denotes : "+(int)'?');
        System.out.println("A denotes  : "+(int)'A');
        System.out.println("+ denotes : "+(int)'+');
        System.out.println("a denotes   : "+(int)'a');

        //Declaration of Characters
        char letter='b';
        char num='2';
        System.out.println("Is "+letter +" a number? "+Character.isDigit(letter));
        System.out.println("Is "+letter +" a letter? "+Character.isDigit(letter));
        System.out.println("Is "+num+" a number? "+Character.isDigit(num));
        System.out.println("Is "+num +" a number? "+Character.isDigit(num));

        //Upper and Lowercase
        System.out.println("Is "+letter +" in uppercase? "+Character.isUpperCase(letter));
        System.out.println("Is "+letter +" in uppercase? "+Character.isLowerCase(letter));
        System.out.println("Converting"+letter +" to uppercase? "+Character.toUpperCase(letter));
        System.out.println("Is "+num +" in uppercase? "+Character.isUpperCase(num));
        //string datatype
        String name="Gaius Erzoah";
        String hometown ="Esiama";
        String name1="  Jane ";
        //length of strings
        System.out.println(name+" is  of length : "+name.length());
        System.out.println(name+" to caps : "+name.toUpperCase());
        System.out.println(name+" to caps : "+name.toUpperCase(Locale.ROOT));
        System.out.println(name+" to lowercase: "+name.toLowerCase());
        System.out.println( name1);
        //comparing Strings
        String FirstName="Gaius";
        String First="GAIUS";
        String surname="ERZOAH";
        System.out.println(FirstName+" is the same as "+First+" ? "+FirstName.equals(First));
        System.out.println(FirstName+" is the same as "+First+" ? "+FirstName.equalsIgnoreCase(First));
        System.out.println(FirstName+" Contains "+First+" ? "+FirstName.contains(First));
        System.out.println(FirstName+" contains "+First+" ? "+FirstName.contains("G"));
        System.out.println(FirstName+" Starts with G "+ FirstName.startsWith("G"));
        System.out.println(FirstName+" ends with s "+ FirstName.endsWith("s"));









    }
}
