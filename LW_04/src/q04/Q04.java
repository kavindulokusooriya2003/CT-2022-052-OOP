package q04;

import java.util.Scanner;

public class Q04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year :");
        int yr = scanner.nextInt();
        if(((yr%4)==0) && ((yr%100)!=0)){
                System.out.println(yr+" "+"is a Leap Year");
            }else if ((yr%400)==0) {
                System.out.println(yr+" "+"is a Leap Year");
            }
        else{
            System.out.println(yr+" "+"is Not a Leap Year");
        }
    }}

