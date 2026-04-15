 // Java program to count the number of even and odd digits in the given number

 public class evenodd {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any digit number:");
              
               int number = scanner.nextInt();
              
               int evenCount = 0;
               int oddCount = 0;
               int reminder;
              
               while(number>0) {
                     
                      reminder = number % 10;
                     
                      if(reminder % 2 == 0) {
                           
                            evenCount++;
                           
                     } else {
                           
                            oddCount++;
                           
                     }
                           
                      number = number / 10;      
                           
              }
              
              System.out.println("The number of even digits in the number is: "+evenCount);
              System.out.println("The number of odd digits in the number is: "+oddCount);
              
               scanner.close();
              
       }

}