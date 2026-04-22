import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Enter the text :");
        String t = text.nextLine();

        int index = t.indexOf("!");

        String part1 = t.substring(0,index);
        String part2 = t.substring(index+1);

        System.out.println(part1.trim());
        System.out.println(part2.trim());
    }
}
