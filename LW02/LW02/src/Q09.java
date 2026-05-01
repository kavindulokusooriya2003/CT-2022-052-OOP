import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        double P,R;
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Invest($):");
        P= scan.nextDouble();
        System.out.println("Enter your InterestRate(%):");
        R= scan.nextDouble();
        System.out.println("Enter years:");
        N= scan.nextInt();

        //Calculations

        double Amount=P*Math.pow((1+(R/100)),N);
        double earn= (Amount-P);

        System.out.println("Final Amount is:"+Amount+"$");
        System.out.println("You Have earned:"+earn+"$");

    }
}
