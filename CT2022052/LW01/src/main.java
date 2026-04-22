import java.util.Scanner;

public class main {
    static void main(String[] args) {
        System.out.println("kavindu");
        System.out.println("\t   kala\n\t   loku\n\t   kavi");

        String country = "Sri Lanka";
        System.out.println("I Love"+country);
        System.out.println(country.indexOf("i"));
        System.out.println(country.length());
        System.out.println(country.substring(4,9));
        Scanner x = new Scanner(System.in);
        System.out.println("Input fname");
        String fname = x.next();
        System.out.println("Enter you mname");
        String mname = x.next();
        System.out.println("Enter your lname");
        String lname = x.next();
        System.out.println("enter you age");
        int age = x.nextInt();
        System.out.println("Name is "+fname.substring(0,1)+"."+mname.substring(0,1)+". "+lname);
        System.out.println("Age is "+age);
    }
}
