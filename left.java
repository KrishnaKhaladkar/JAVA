// Java program to left rotate an Array by 3 elements

public class left {

        public static void main(String[] args) {
              
               int[] a = {1,2,3,4,5};
              
               int size = a.length;
              
               int n = 3;
              
               for(int j=0;j <n;j++) {
                     
                      int first = a[0];
                     
                      for(int i=0;i <size-1;i++) {
                           
                            a[i] = a[i+1];
                           
                     }
                     
                      a[size-1] = first;
              
              }
              
              System.out.println(Arrays.toString(a));
         
       }

}