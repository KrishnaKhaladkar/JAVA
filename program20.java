//java program to find the sum of all digits in the inputed number..

import java.util.Scanner;

public class program20 {

    public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any number:");
              
               int number = scanner.nextInt();
              
               int sum = 0;
              
               while(number != 0) {
                     
                      sum = sum + number % 10;
                     
                      number = number / 10;
                     
              }
              
              System.out.println("Sum of all digits in the given number is "+sum);
              
               scanner.close();
              
       }
}