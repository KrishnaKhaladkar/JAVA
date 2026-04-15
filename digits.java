// Java program to count the number of digits in the given number

public class digits {

        public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any digit number:");
              
               int number = scanner.nextInt();
              
               int digitCount = 0;
              
               while(number>0) {
                     
                      number = number / 10;
                     
                      digitCount++;        
                     
              }
              
              System.out.println("The number of digits in the number is: "+digitCount);
              
               scanner.close();
              
       }

}