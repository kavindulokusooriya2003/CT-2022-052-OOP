import java.time.Year;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age,bd,yr;  //bd=Birthyear,yr=CurrentYear
        yr= Year.now().getValue();
        System.out.println("Please Enter your BirthYear:");
        bd= scan.nextInt();
        age=(yr-bd);
        System.out.println("You were born in "+bd+" and will be (are) "+age+" this year.");

    }
}
