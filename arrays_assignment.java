public class arrays_assignment {
    public static void main(String[] args ){

        //array for int
        int i;
        int multiples[]=new int[6];
        for( i=1;i< multiples.length;i++){
            multiples[i]=i*2;
            System.out.println(multiples[i]);
        }
        //array for double
        System.out.println("FOR DOUBLE");
        double multiple[]=new double[6];
        for(i=1;i<multiple.length;i++)
        {
            multiple[i]=i*2;
            System.out.println(multiple[i]);
        }
int num[]=new int[2001];
        for(i=1;i<num.length;i++)
        {
            num[i]=i+2000;
            System.out.println(num[i]);
        }
    }
}
