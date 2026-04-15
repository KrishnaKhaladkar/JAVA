// Java program to reverse an Array using Java Collections

public class reversearray {

        public static void main(String[] args) {
              
              Integer[] a = {5,2,4,6,1,8};
              
              List<Integer> list = Arrays.asList(a);
              
              Collections.reverse(list);
              
              System.out.println(list);
              
       }

}