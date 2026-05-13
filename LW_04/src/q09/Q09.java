package q09;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();

    }
}}
