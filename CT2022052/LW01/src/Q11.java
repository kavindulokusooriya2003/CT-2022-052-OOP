import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full Name :");
        String fname = s.next();
        String mname = s.next();
        String lname = s.next();

        System.out.println(lname+","+fname+" "+mname.charAt(0)+".");
    }
}
