//  Java program to sort an Array in descending order using built-in functions

public class ArraySort {

     public static void main(String[] args)  {
           
           Integer[] ar = {9,3,1,2,6,5,4,8,7};
           
           Arrays.sort(ar,Collections.reverseOrder());
           
           System.out.println(Arrays.toString(ar));
           
    }
           
}