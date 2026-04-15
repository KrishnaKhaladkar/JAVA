// Java program which intakes a number and prints whether the given number is even or odd

public class evenodd1 {

        public static void main(String[] args)   {
          
           Scanner scanner = new Scanner(System.in);
              
           System.out.println("Enter any number:");

           int number = scanner.nextInt();
          
           if(number%2==0) {
              
              System.out.println("Given number is an even number");

           } else {
              
              System.out.println("Given number is an odd number");
           }
          
           scanner.close();
       }

}