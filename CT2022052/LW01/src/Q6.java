import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        System.out.println("Enter the height :");
        int h = hw.nextInt();
        System.out.println("Enter the width :");
        int w = hw.nextInt();
        hw.nextLine();

        System.out.println("Enter the title :");
        String title = hw.nextLine();

        JFrame frame = new JFrame();
        frame.setSize(w,h);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
