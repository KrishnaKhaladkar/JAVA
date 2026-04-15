// Java program to receive input from the User and saving into Array

public class userSaving {

        public static void main(String[] args) {
          
           Scanner scanner = new Scanner(System.in);
          
           System. out.println("Enter the size of the array:");
          
           int size = scanner.nextInt();
          
           int[] ar = new int[size];
          
           for(int i=0;i<size;i++) {
              
              System.out.println("Enter number");
              
               ar[i] = scanner.nextInt();
              
           }
          
           System.out.println("Array after storing the elements inputed by User is: "+Arrays.toString(ar)); 
          
           scanner.close();
       
       }

}
