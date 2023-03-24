import java.util.Arrays;

public class multi_dimentional_arrays {
    public static void main(String[] args) {
        //CREATING TWO DIMENTIONAL ARRAYS
        double marks[][] = new double[5][2];

        //you can use curly bracket when you want to initialize
        int ages[][] = {{1, 5}, {25, 6}};

        //ADDING CONTENT WITHOUT LOOPING
        marks[0][0] = 56;
        marks[0][1] = 87;

        //ADDING CONTENT WITH LOOPS
        for (int i = 0; i < marks.length; i++) {
            for (int k = 0; k < marks[i].length; k++) {
                marks[i][k] = (3 + i) * (k - 5);
            }
        }

        //GETTING CONTENT FROM A SINGLE DIMENTIONAL ARRAY
        double stdmark = marks[2][1];


        //PRINTING THE CONTENT OF A MULTI-D ARRAY
        System.out.println(Arrays.deepToString(marks));
        System.out.println(Arrays.toString(marks[3]));


        //USING FOR LOOP to print out sd arrray
        for (int k = 0; k < marks.length; k++) {
            System.out.println(Arrays.toString(marks[k]));
        }

        //USING NESTED FOR LOOP
        for (int k = 0; k < marks.length; k++)
        {
            for(int j=0;j<marks[k].length;j++)
            {
                System.out.println(marks[k][j]+" ");
            }
        }
        //JAVA JAGGED MULTI-D ARRAY  DOES NOT HAVE EQUAL COLUMNS
        int newmarks[][]={{20},{65,15,56},{50},{45,23,65,80}};
        System.out.println(Arrays.deepToString(newmarks));
    }
}