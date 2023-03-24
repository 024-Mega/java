public class EqualityrelationalOperators {
    public static void main(String[] args) {
        int A=24;
        int B=30;
        System.out.print("Is ("+A+") equal to "+B+"? :");
        System.out.println(A==B);
        System.out.print("Is ("+A+")  not equal to "+B+"? :");
        System.out.println(A!=B);
        System.out.print("Is ("+A+") greater than "+B+"? :");
        System.out.println(A>B);
        System.out.print("Is ("+A+") less than "+B+"? :");
        System.out.println(A<B);

        //ternary operator
        //int x=(A==B)?45:80;
        //if x equals a==b else assign 45 to a and 80 to b
        //exponent functions
        System.out.println(Math.exp(5));//constant E to the exp 5
        System.out.println(Math.log(20));//ln of 20
        System.out.println(Math.log10(20));//log with base 10 of 20
        System.out.println(Math.pow(5,7));//5 raised to power 7
        System.out.println(Math.sqrt(25));//square root of 25
        System.out.println(Math.pow(25,0.3333));//cube root of 25
        System.out.println(Math.pow(25,1.0/3));//cube root of 25
        System.out.println(Math.cbrt(25));//cube root of 225
        //Rounding in java
        System.out.println("round : "+Math.round(89.7952));
        System.out.println("round : "+Math.round(89.1952));
        System.out.println("Rint : "+Math.rint(89.7952));
        System.out.println("Rint: "+Math.rint(89.1952));
        System.out.println("Floor : "+Math.floor(89.7952));
        System.out.println("Floor : "+Math.floor(89.1952));
        System.out.println("Ceil: "+Math.ceil(89.7952));
        System.out.println("round : "+Math.ceil(89.1952));

        //to a preferred decimal place(multiply by a value and later divide by the same number)
        System.out.println("round to dp of choice : "+Math.round((1.0/3)*10000)/10000.0);

        //Finding absolute,maximum and minimum functions in java
        System.out.println("Max: "+Math.max(0.1575,-0.12564));
        System.out.println("Min : "+Math.min(0.1575,-0.12564));
        System.out.println(Math.max(0.1575,Math.max(-0.12564,0.2567)));

        //Generating random  values
        double randNumber=Math.random();
        System.out.println(randNumber);
        System.out.println(randNumber*5);
        System.out.println((int)(randNumber*5));
        System.out.println((int) (randNumber*5)+1);














    }
}
