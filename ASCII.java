// Java program to find the ascii value of the given character

public class ASCII {

        public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any character:"); 
              
               char c = scanner.nextLine().charAt(0);
              
              System.out.println("ASCII value of the given character is: "+(int)c);
              
               scanner.close();
       
       }

}
---