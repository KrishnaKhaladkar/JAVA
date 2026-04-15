//  Java program to print right pascal triangle star pattern

public class pascal {

        public static void main(String[] args) {
              
               for(int i=1;i<=5;i++) {
                     
                      for(int j=1;j<=i;j++) {
                           
                           System.out.print("* ");
                           
                     }
                     
                     System.out.println();
                     
              }
              
               for(int i=4;i>0;i--) {
                     
                      for(int j=1;j<=i;j++) {
                           
                           System.out.print("* ");                         
                           
                     }
                     
                     System.out.println();
     
              }
             
       }

}