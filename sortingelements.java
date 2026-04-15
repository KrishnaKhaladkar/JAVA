// Java program for sorting the elements in the Array using build-in functions

public class sortingelements {

        public static void main(String[] args) {
          
               int[] a = {8,1,5,9,12,33,23,7,4,3};
              
              System.out.println("Before sorting the array: "+Arrays.toString(a));
              
              Arrays.parallelSort(a);
              
              System.out.println("After sorting the array: " +Arrays.toString(a));

       }

}

---