//  Java program to convert the given String text to lower case

public class toLowerCase {

        public static void main(String[] args) {
          
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any String text:");
              
              String str = scanner.nextLine();
              
              System.out.println(str.toLowerCase());
              
              scanner.close();
       
       }

}