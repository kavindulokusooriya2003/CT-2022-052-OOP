import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        double c,f;  //c=Celsius,f=Fahrenheit
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit:");
        f= scan.nextDouble();
        c=(5.0/9)*(f-32);
        System.out.println("Value is:"+c);

    }
}
