//write a program for intaking two numbers using Scanner and printingtheir sum

import java.util.Scanner;

public class program4 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number :");

    int firstNumber = scanner.nextInt();

    System.out.println("Enter second number :");

    int secondNumber = scanner.nextInt();
    
    scanner.close();
    System.out.println("The sum of "+firstNumber+" and "+secondNumber+" is: "+(firstNumber+secondNumber));
}
}