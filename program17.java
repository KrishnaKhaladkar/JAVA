//java program which intakes width and height of a rectangle and there by print its area.

import java.util.Scanner;

public class program17 {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter width of the Rectangle: ");
              
               double width = scanner.nextDouble();
              
              System.out.println("Enter height of the Rectangle: ");
              
               double height = scanner.nextDouble();
              
              System.out.println("Area of the rectangle is: "+(width *height));
              
              scanner.close();
              
       }

}