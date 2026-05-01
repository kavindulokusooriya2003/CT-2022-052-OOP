import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        double v,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=scan.nextDouble();
        //Calculate the volume
        v=(4.0/3.0) * (Math.PI*Math.pow(r,3));
        System.out.println("The volume of a sphere is:"+v);

    }
}
