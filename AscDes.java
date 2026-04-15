// Java program to sort an ArrayList in Ascending and Descending order

public class AscDes {

     public static void main(String[] args)  {
           
           ArrayList<Integer> alist = new ArrayList<Integer>();
           
            alist.add(9);
            alist.add(5);
            alist.add(1);
            alist.add(3);
           
           Collections.sort(alist);
           
           System.out.println(alist);
           
           Collections.sort(alist,Collections.reverseOrder());
           
           System.out.println(alist);
           
    }
           
}