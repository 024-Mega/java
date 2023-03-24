public class test_rectangle {
    public static void main(String[] args) {
        rectangular_box_classesandobjects rec1=new rectangular_box_classesandobjects();
        System.out.println(rec1.breadth);
        System.out.println(rec1.height);
        System.out.println(rec1.length);
        //SECOND CONSTRUCTOR
        rectangular_box_classesandobjects rec2=new rectangular_box_classesandobjects(25,60);
        System.out.println("SECOND CONSTRUCTOR");
        System.out.println(rec2.height);
        System.out.println(rec2.length);
        //THIRD CONSTRUCTOR
        rectangular_box_classesandobjects rec3=new rectangular_box_classesandobjects(3,6,5);
        System.out.println("THIRD CONSTRUCTOR");
        //System.out.println(rec3.getLength());
        System.out.println(rec3.sidearea1());
        System.out.println(rec3.sidearea2());
        rectangular_box_classesandobjects rec4=new rectangular_box_classesandobjects(5,6,5);
        System.out.println("FOURTH CONSTRUCTOR");
       // System.out.println(rec4.getLength());
        System.out.println(rec4.sidearea1());
        System.out.println(rec4.sidearea2());
        System.out.println(rec4.sidearea3());

    }
}
