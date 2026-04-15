// Java program to print the Sandglass Number Pattern

public class Sandglass {

        public static void main(String[] args) {
              
               for(int i=1;i<=5;i++) {
                     
                      //spaces
                      for(int j=1;j<i;j++) {
                           
                           System.out.print(" ");
                           
                     }
                     
                      //Numbers
                      for(int k=i;k<=5;k++) {
                           
                           System.out.print(k +" ");
                           
                     }
                     
                     System.out.println();
                     
              }
              
               for(int i=4;i>=1;i--) {
                     
                      //spaces
                      for(int j=1;j<i;j++) {
                           
                           System.out.print(" ");
                           
                     }
                     
                      //Numbers
                      for(int k=i;k<=5;k++) {
                           
                           System.out.print(k +" ");
                           
                     }
                     
                     System.out.println();
                     
              }
              
    }
              
}