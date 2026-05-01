import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm,totalInches,inches;
        int feet;

        // Input in centimeters
        System.out.print("Enter length in centimeters: ");
        cm = input.nextDouble();

        // Convert cm to inches
        totalInches = cm / 2.54;

        // Convert inches to feet and inches
        feet = (int) (totalInches / 12);
        inches = totalInches % 12;

        // Result
        System.out.println("Feet: " +feet);
        System.out.println("Inches: " +inches);
    }
}
