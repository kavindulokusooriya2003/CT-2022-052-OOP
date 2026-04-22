import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the text :");
        String text = s.nextLine();

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));

    }
}
