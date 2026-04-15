//Java program to count the digits in the given number

public class countdigits {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any digit number:");
              
               int number = scanner.nextInt();
              
               int reminder;
              
               int sumOfDigits = 0;
              
               while(number >0) {
                     
                      reminder = number % 10;
                     
                      sumOfDigits = sumOfDigits + reminder;
                           
                      number = number / 10;      
                           
              }
              
              System.out.println("The sum of digits in the given number is: "+sumOfDigits);
              
               scanner.close();
              
       }

}