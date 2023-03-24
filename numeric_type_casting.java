public class numeric_type_casting {
    public static void main(String[] args) {
        //declaring numeric data type
        int age=18;
        double height=1.8;
        //string variables
        String weight="78.09451";
        String weight2="78";
        //conversion
        double newAge=age;
        int newheight=(int)height;
        double weightDec=Double.parseDouble(weight);
        int weightInt= Integer.parseInt(weight2);
        System.out.println(newAge+" as a double from an integer");
        System.out.println(newheight+" as an integer from a double");
        System.out.println(weightDec+" as a double from an string");
        System.out.println(weightInt+" as an integer from a string");

    }
}
