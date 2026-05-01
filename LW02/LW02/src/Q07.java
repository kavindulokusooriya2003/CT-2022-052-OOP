import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        int w,h;  // w=Weight,h=Height
        double bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight in(Kg):");
        w=scan.nextInt();
        System.out.println("Enter Height in(Cm):");
        h=scan.nextInt();
        bmi=w/Math.pow((h/100.0),2);
        System.out.println("Your BMI Value Is:"+bmi);
        scan.nextLine();

        //Check the condition
        if(bmi>=20 && bmi<=25){
            System.out.println("You are in the normal range.");
        }else{
            System.out.println("You are not in the normal range.");
        }

    }
}
