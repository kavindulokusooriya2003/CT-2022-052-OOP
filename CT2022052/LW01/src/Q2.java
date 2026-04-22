import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fname :");
        String fname = scanner.next();
        System.out.println("Enter Lname");
        String lname =scanner.next();
        String Full_name = fname+" "+lname;
        JFrame myWindow = new JFrame(Full_name);
        myWindow.setSize(800,600);
        myWindow.setVisible(true);
    }
}
