import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius:");
        double c= scan.nextDouble();
        double f=(1.8 * c) + 32;
        System.out.println("Fahrenheit Value is:"+f);

    }
}
