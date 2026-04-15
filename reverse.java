// Java program to reverse the elements in the array

public class reverse{

        public static void main(String[] args) {
          
           int[] ar = {5,1,2,3,4};
          
           int temp ;
           int start = 0;
           int end = ar.length -1;
          
           while(start < end) {
              
               temp = ar[start];
              
               ar[start] = ar[end];
              
               ar[end] = temp;
              
               start++;
               end--;
              
           }
          
           System.out.println("Array after reversing its elements is: "+Arrays.toString(ar));
       
       }

}