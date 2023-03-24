import java.util.Arrays;

public class arrays_practicals {
    public static void main(String[] args) {
        //creating a single dimentional arrays of doubles to take 5 elements
        double marks[]=new double[5];
        //create a single dimentional array of doubles to take 3 elements
        int [] mark =new int[3];
        // create a single dimentional array of string to take 10 elements
        String stdname []=new String[10];

        //create a single dimentional array of doubles and initiate at the same time
        double marks1[]={20.3,20,0.1};
        //print content using arrays.toString()
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(mark));
        System.out.println(Arrays.toString(marks1));
        System.out.println(Arrays.toString(stdname));
        //finding the lenght or size of the array
        System.out.println(marks.length);
        //adding elements to a single dimentional array without looping
        //NOT RECOMMENDED
        //WRONG BCOS IT EXCEEDS THE LENGTH OF THE ARRAY
//        mark [0]=50;
//        mark [1]=68;
//        mark [2]=80;
//        mark [3]=59;
        mark [0]=50;
        mark [1]=68;
        mark [2]=80;

        System.out.println(Arrays.toString(mark));
        //adding content to an array with a loop
        for(int i=0;i<mark.length;i++)
        {
            //at index i , add(i+2)*Math.pow(i,3)
            marks[i]=(i+2)*(Math.pow(i,3));
        }
        //adding content to a single dimentional array using loop
        for(int i=0;i<stdname.length;i++)
        {
            stdname[i]="Student "+i;
        }
        System.out.println("AFTER  ADDING ");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(mark));
        System.out.println(Arrays.toString(marks1));
        System.out.println(Arrays.toString(stdname));
        //SORTING ARRAYS
        Arrays.sort(marks1);

        System.out.println(" AFTER SORTING");
        System.out.println(Arrays.toString(marks1));
        //CATCHING EXCCEPTIONS WHILE LOOPING ARRAYS
        for(int k=0;k<=10; k++){
            try{
                System.out.println(marks1[k]);
            }
            catch(Exception g){
                break;
            }
        }
        //COPY A SINGLE DIMENTIONAL ARRAY TO THE SAME DATA
        //MODIFICATION OF ORIGINAL ARRAY AFFECTS ITS COPY AND VICE VERSA
        System.out.println("Before Copying");
        System.out.println(Arrays.toString(marks));
        double copiedMarks[]=marks;
        copiedMarks[0]=99;
        copiedMarks[4]=199;

        System.out.println("After Copying and modification");
        System.out.println(Arrays.toString(copiedMarks));
        System.out.println(Arrays.toString(marks));
        //CLONING AN ARRAY
        double cloneMars[]=marks.clone();
        System.out.println("Before Clonning");
        System.out.println(Arrays.toString(marks));
        copiedMarks[0]=22;
        copiedMarks[4]=179;




        System.out.println("After Clonning and modification");
        System.out.println(Arrays.toString(cloneMars));
        System.out.println(Arrays.toString(marks));

    }
}
