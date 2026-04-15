

import java.util.Scanner;

public class program19 {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter width of the rectangle:");
               int width = scanner.nextInt();
              
              System.out.println("Enter height of the rectangle:");
               int height = scanner.nextInt();
              
              System.out.println("Perimeter of the rectangle: "+2*(width +height ));
              
       }

}