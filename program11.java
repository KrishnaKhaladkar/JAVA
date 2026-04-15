//java program which intakes two  numbers and finds the quotient aand remainder

import java.util.Scanner;

public class program11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");

        int secondNumber = scanner.nextInt();

        scanner.close();

        System.out.println("Quotient is : "+(firstNumber/secondNumber));

         System.out.println("Reminder is : "+(firstNumber%secondNumber));
    }
}