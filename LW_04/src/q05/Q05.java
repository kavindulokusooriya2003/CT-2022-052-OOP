package q05;

import java.util.Scanner;

public class Q05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        //Entree
        System.out.println("\n     Entree    ");
        System.out.println("1.Tofu Burger - $3.49 ");
        System.out.println("2.Cajun Chicken - $4.59 ");
        System.out.println("3.Buffalo Wings - $3.99");
        System.out.println("4.Rainbow Fillet - $2.99");

        System.out.println("Enter you select Entree menu number :");
        int entree = scanner.nextInt();

        switch (entree){
        case 1:
        System.out.println("You select Tofu Burger");
        total+=3.49;
        break;
        case 2:
        System.out.println("You select Cajun Chicken");
        total+=4.59;
        break;
        case 3:
        System.out.println("You select Buffalo Wings");
        total+=3.99;
        break;
        case 4:
        System.out.println("You select Rainbow Fillet");
        total+=2.99;
        break;
        default:
        System.out.println("you select invalid Entree");
        }
        // Side Dish Menu
        System.out.println("\n    Side Dish Menu    ");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");

        System.out.print("Select Side Dish: ");
        int side = scanner.nextInt();

        switch (side) {

            case 1:
                System.out.println("You selected Rice Cracker");
                total += 0.79;
                break;

            case 2:
                System.out.println("You selected No-Salt Fries");
                total += 0.69;
                break;

            case 3:
                System.out.println("You selected Zucchini");
                total += 1.09;
                break;

            case 4:
                System.out.println("You selected Brown Rice");
                total += 0.59;
                break;

            default:
                System.out.println("Invalid Side Dish Selection");
        }
        // Drink Menu
        System.out.println("\n=== Drink Menu ===");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");

        System.out.print("Select Drink: ");
        int drink = scanner.nextInt();

        switch (drink) {

            case 1:
                System.out.println("You selected Cafe Mocha");
                total += 1.99;
                break;

            case 2:
                System.out.println("You selected Cafe Latte");
                total += 1.90;
                break;

            case 3:
                System.out.println("You selected Espresso");
                total += 2.49;
                break;

            case 4:
                System.out.println("You selected Oolong Tea");
                total += 0.99;
                break;

            default:
                System.out.println("Invalid Drink Selection");
        }

        // Final Bill
        System.out.println("\nTotal Price = $" + total);
    }
}
