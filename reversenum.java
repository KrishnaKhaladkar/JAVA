// Java program to reverse the given number

public class reversenum {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any digit number:");
              
               int orginalNumber = scanner.nextInt();
              
               int number = orginalNumber;
              
               int reminder;
              
               int reversedNumber = 0;
              
               while(number>0) {
                     
                      reminder = number % 10;
                     
                      reversedNumber = reversedNumber * 10 + reminder;
                     
                      number = number / 10;
                     
              }
              
              System.out.println("Reversed number is: " +reversedNumber);
              
               scanner.close();
       
       }

}