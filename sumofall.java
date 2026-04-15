// Java program to find the sum of all the elements in the Array

public class sumofall {

        public static void main(String[] args) {
              
               int[] a = {3,2,5,8,6,9,7};
              
               int sum = 0;
              
               for(int t : a) {
                     
                      sum = sum + t;
                     
              }
              
              System.out.println("Sum of all the elements in the array is: " +sum);
              
       }

}