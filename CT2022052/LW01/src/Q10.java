import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Word :");
        String text = s.nextLine();

        int mnum = text.length()/2;
        System.out.println(text.charAt(mnum));
    }
}
