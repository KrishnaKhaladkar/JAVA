// Java program to print all the prime numbers between 1 and 100

public class isPrime {

        public static void main(String[] args) {
              
               for(int i=2;i<100;i++) {
                     
                      boolean isPrime = true;
                     
                      for(int j=2;j<i;j++) {
                           
                            if(i%j == 0) {
                                  
                                   isPrime = false;
                                  
                           }
                           
                     }
                     
                      if(isPrime) {
                           
                           System.out.print(i +" ");
                     }
                     
              }
              
       }

}