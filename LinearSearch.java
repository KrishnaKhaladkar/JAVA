// Java program implementing Linear Search Algorithm

public class LinearSearch {

     public static void main(String[] args) {
           
           Scanner scanner = new Scanner(System. in);
           
           System. out.println( "Enter any number for searching:");
           
            int num = scanner.nextInt();
           
            scanner.close();
           
            int[] arr = {55,2,9,3,5,7,99,24,36,49,86};
           
            int count = 0;
           
            for( int i=0; i< arr. length-1; i++) {
                
                 if( num== arr[ i]) {
                     
                     System. out.println( "Given number is found at the the index "+i+" in the array");
                      count++;
                     
                }
                
           }
           
            if( count==0) {
                
                System. out.println( "Given number is not found in the array");
                
           }
           
     }

}