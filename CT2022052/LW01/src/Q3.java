import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter your First Name :");
        String fname = scanner.next();
        System.out.println("Eneter your Middle Name :");
        String mname = scanner.next();
        System.out.println("Eneter your Last Name :");
        String lname = scanner.next();
        System.out.println(fname+" "+mname.substring(0,1)+"."+" "+lname);

    }
}
