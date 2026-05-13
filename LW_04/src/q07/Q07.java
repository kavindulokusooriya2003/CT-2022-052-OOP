package q07;

import java.util.Scanner;

public class Q07 {
    static void main(String[] args) {
        int num,length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        num=scan.nextInt();
        length=String.valueOf(num).length();
        if(num>-1){
            System.out.println("Integer Length Is:"+length);
        }else if(num==-1){
            System.out.println("Stopped!");
        }else{
            System.out.println("Invalid Number..Try Again!");
        }

    }
}
