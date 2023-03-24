public class test_constructor {
    public static void main(String[] args) {
        constructors rec1=new constructors();
        System.out.println("FIRST CONSTRUCTOR");
        System.out.println(rec1.First_Name);
        System.out.println(rec1.Last_Name);
        constructors rec2=new constructors();


        System.out.println("SECOND CONSTRUCTOR");
        System.out.println(rec2.First_Name);
        System.out.println(rec2.Last_Name);
        System.out.println(rec2.Age);


        constructors rec3=new constructors();
        System.out.println("THIRD CONSTRUCTOR");
        System.out.println(rec3.First_Name);
        System.out.println(rec3.Last_Name);
        System.out.println(rec3.Age);
        System.out.println(rec3.CWA);
        System.out.println(rec3.Gender);
        System.out.println(rec3.Course);
        System.out.println(rec3.Hall);
        System.out.println(rec3.Department);


        constructors rec4=new constructors("Harrison","Seyram");
        System.out.println("METHOD TO CHANGE ANY FIELD");
        System.out.println(rec4.First_Name);
        System.out.println(rec4.Last_Name);

        constructors rec5=new constructors("Qasty","Cream",20);
        System.out.println("METHOD TO CHANGE ANY FIELD");
        System.out.println(rec5.First_Name);
        System.out.println(rec5.Last_Name);
        System.out.println(rec5.Age);
        constructors rec6=new constructors("Enoch","Jay",19,78.8,"Male","Thermodynamics","Renewable Energy Department","Gold Hall",9121,3,"Kumasi-Ahodwo");
        System.out.println("METHOD TO CHANGE ANY FIELD");
        System.out.println(rec5.First_Name);
        System.out.println(rec5.Last_Name);
        System.out.println(rec5.Age);
        System.out.println(rec5.CWA);
        System.out.println(rec5.Gender);
        System.out.println(rec5.Course);
        System.out.println(rec5.Department);

        constructors rec7=new constructors("Enoch","Jay",19,78.8,"Male","Thermodynamics","Renewable Energy Department","Gold Hall",9019,2,"Kumasi-Ahodwo");
        System.out.println("METHOD TO GET THE VALUE  OF ANY FIELD");
        System.out.println("First Name: "+rec6.First_Name);
        System.out.println("Last Name: "+rec6.Last_Name);
        System.out.println("Age: "+rec6.Age);
        System.out.println("CWA: "+rec6.CWA);
        System.out.println("Gender: "+rec6.Gender);
        System.out.println("Course: "+rec6.Course);
        System.out.println("Department: "+rec6.Department);
        System.out.println("Hometown: "+rec6.Hometown);
        System.out.println("Index Number: "+rec6.Index_Number);
        System.out.println("Year: "+rec6.Year);
        System.out.println("Hall: "+rec6.Hall);

    }
}
