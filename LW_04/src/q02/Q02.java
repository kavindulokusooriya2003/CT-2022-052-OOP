package q02;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Q02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0. Magenta");
        System.out.println("1. Cyan");
        System.out.println("2. Red");
        System.out.println("3. Blue");
        System.out.println("4. Green");
        System.out.println("Select one color from the above list :");
        int select = scanner.nextInt();

        switch (select){
            case 0:
                System.out.println("You Selected Magenta.");
                break;
            case 1:
                System.out.println("You Selected Cyan.");
                break;
            case 2:
                System.out.println("You Selected Red.");
                break;
            case 3:
                System.out.println("You Selected Blue.");
                break;
            case 4:
                System.out.println("You Selected Green.");
                break;
            default:
                System.out.println("Invallid Selection");
    }}
}
