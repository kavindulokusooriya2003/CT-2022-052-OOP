import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //Q1 part a.

        Scanner k =new Scanner(System.in);
        System.out.println("Input Value A :");
        int A = k.nextInt();
        System.out.println("Input Value B :");
        int B = k.nextInt();
        System.out.println("Input Value C :");
        int C = k.nextInt();
        double out = Math.sqrt((B*B)+(4*A*C));
        System.out.println("Part 1 Answer is :"+out);


        //Q1 part b.

        System.out.println("Input Value X :");
        int X = k.nextInt();
        System.out.println("Input Value Y :");
        int Y = k.nextInt();
        k.nextLine();
        double Asw = Math.sqrt(X+(4*Math.pow(Y,3)));
        System.out.println("Part 2 Answer is :"+Asw);



        //Q1 part c.


        double Valu = Math.cbrt(X*Y);
        System.out.println("Part 3 Answer is :"+Valu);


        //Q1 part d.


        System.out.println("Input Value of radius :");
        int r = k.nextInt();
        double area = Math.PI*(Math.pow(r,2));
        System.out.println("Part 4 Answer is :"+area);
    }
}
