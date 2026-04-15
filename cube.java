//Java program to find the Cube of the given number

public class cube {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any number:");
              
              int num = scanner.nextInt();
                           
              System.out.println("Cube of the given number is: "+(num *num *num));
              
              scanner.close();
              
       }

}