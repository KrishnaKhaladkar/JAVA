//Java program which intakes 6 numbers as input and prints their average.

import java.util.Scanner;
public class program15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        System.out.println("Enter fourth number:");
        int fourthNumber = scanner.nextInt();
              
        System.out.println("Enter fifth number:");
        int fifthNumber = scanner.nextInt();
              
        System.out.println("Enter sixth number:");
        int sixthNumber = scanner.nextInt();
              
        System.out.println("Average of all inputed numbers is: "+(firstNumber+ secondNumber+thirdNumber +fourthNumber +fifthNumber +sixthNumber )/6);



    }
}