public class rectangular_box_classesandobjects{
    //DATA FIELDS
    double length=1;
    double breadth=1;
    double height=20;
    //CONSTRUCTOR WITH DEFAULT VALUES
    rectangular_box_classesandobjects(){

    }
    //CREATINDG ANOTHER CONTRUCTOR

    /**
     * THIS METHOD IS USED TO CREATE A REC BOX WITH USER DEFINED LENGTH AND HEIGHT
     * @param l
     * @param h
     */
    rectangular_box_classesandobjects(double l,double h){
        length=l;
        height=h;
    }

    /**
     * THIS METHOD IS USED TO CREATE A REC BOX WITH USER DEFINED LENGTH,BREADTH AND HEIGHT
     * @param l
     * @param h
     * @param b
     */
    rectangular_box_classesandobjects( double l,double h,double b){
        length=l;
        height=h;
        breadth=b;
    }
    void setLength(double l){
        length=l;
    }
    void setBreadth(double b){
        breadth=b;
    }
    void setHeight(double h)
    {
        height=h;
    }
    double sidearea1(){
        return length*height;
    }
    double sidearea2() {
        return length * breadth;
    }
//ASSIGNMENT,WRITE A METHOD FOR SIDE AREA3
    double volume(){
        return length*height*breadth;
    }
    double sidearea3(){
        return breadth*height;
    }
    //
}
