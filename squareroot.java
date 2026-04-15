// Java program to find the square root of the given number

public class squareroot {

        public static void main(String[] args) {
          
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any number:");
              
               int num = scanner.nextInt();
              
              System.out.println("Square root of the given number is: "+Math.sqrt(num));
              
               scanner.close();
       
       }

}