//Java Program to Find the perimeter of the circle.

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the Radius of the Circle:");
              
               int radius = scanner.nextInt();
              
              System.out.println("Perimeter of the circle is: "+(2*Math.PI*radius));
              
              scanner.close();
    }
}