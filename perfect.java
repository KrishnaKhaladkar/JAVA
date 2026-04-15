// Java program to check whether the given number is a perfect number

public class perfect {

     public static void main(String[] args)  {
           
           Scanner scanner = new Scanner(System. in);
           
           System. out.println( "Enter any number:");
           
            int num = scanner.nextInt();
           
            scanner.close();
           
            int sum = 0;
           
            for( int i=1; i< num; i++) {
                
                 if( num% i==0) {
                     
                      sum = sum + i;
                     
                }
                
           }
           
            if( num== sum) {
                
                System. out.println( "Given number is a perfect number");
                
           } else {
                
                System. out.println( "Given number is not a perfect number");
                
           }
           
    }
           
}