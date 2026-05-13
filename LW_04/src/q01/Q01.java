package q01;

import java.util.Scanner;

public class Q01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number 1 :");
        int num1 = scanner.nextInt();
        System.out.println("Input Number 2 :");
        int num2 = scanner.nextInt();
        System.out.println("Input Number 3 :");
        int num3 = scanner.nextInt();

        if (num1 < num2){
             if (num1 < num3) {
                 System.out.println("Minimum num is :"+num1);
             }
             else{
                 System.out.println("Minimum num is :"+num3);
                 }
        }else {
            if(num2 < num3){
                System.out.println("Minimum num is :"+num2);
            }else{
                System.out.println("Minimum num is :"+num3);
            }
        }
    }

    }

