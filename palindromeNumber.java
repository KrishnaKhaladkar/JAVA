//Java Program to check whether the given number is a palindrome

public class palindromeNumber {

        public static void main(String[] args) {
              
           Scanner scanner = new Scanner(System.in);
              
           System.out.println("Enter any number:");
              
           int originalNum = scanner.nextInt();
                           
           int num = originalNum ;

           int reversedNum = 0;
          
           int reminder;
          
          
               while(num >0) {
                     
                 reminder = num % 10;
                     
                 num = num / 10;
                
                 reversedNum = reversedNum * 10 + reminder;
                     
              }
              
               if(reversedNum ==originalNum) {
                     
                     System.out.println("Given number is a palindrome");
                     
              } else {
                     
                     System.out.println("Given number is not a palindrome" );
                     
              }
              
               scanner.close();
              
       }
}