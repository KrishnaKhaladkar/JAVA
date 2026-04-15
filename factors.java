//  Java program to find the factors of the number and the count number of factors

public class factors {

        public static void main(String[] args) {
          
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter the number:");
              
               int number = scanner.nextInt();
              
               int countOfFactors = 0;
              
               for(int i=1;i<=number;i++) {
                     
                      if(number %i == 0) {
                           
                           System.out.println(i);
                           
                            countOfFactors++;
                           
                     }
                     
              }
              
              System.out.println("The given number has "+countOfFactors +" factors");
              
               scanner.close();
       
       }

}