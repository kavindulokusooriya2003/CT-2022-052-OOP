import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double loanAmount,annualInterestRate,monthlyInterestRate,monthlyPayment,totalPayment;
        int loanPeriod,numberOfPayments;
        final int MONTHS_IN_YEAR = 12;

        // Input values
        System.out.print("Enter loan amount: ");
        loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate(%): ");
        annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period(yr): ");
        loanPeriod = input.nextInt();

        // Step 1
        monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        // Step 2
        numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        // Step 3
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        // Step 4
        totalPayment = monthlyPayment * numberOfPayments;

        // Final output
        System.out.println("Monthly Payment:Rs."+monthlyPayment);
        System.out.println("Total Payment:Rs."+totalPayment);

    }
}
