// Java program to seperately print the even and odd number in the given array

public class evenoddnum {

        public static void main(String[] args) {
              
               int[] a = {3,2,5,8,6,9,7};
              
              System.out.println("The below are the even numbers in the given array");
              
               for(int t : a) {
                     
                      if(t % 2==0) {
                           
                           System.out.print(t +" ");
                           
                     }
                     
              }
              
              System.out.println();
              
              System.out.println("The below are the odd numbers in the given array");
              
               for(int t : a) {
                     
                      if(t %2!=0) {
                           
                           System.out.print(t +" ");
                           
                     }
                     
              }
              
       }

}