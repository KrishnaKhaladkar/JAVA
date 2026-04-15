//  Java program to count number of words in a String

public class count {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any Statement");
              
              String statement = scanner.nextLine();
              
              String[] str = statement.split(" ");
              
              System.out.println("The number of words in the given statement is: "+str.length);
              
               scanner.close();
       }

}

---