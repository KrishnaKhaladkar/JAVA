// Java program to print the first half of the given string text

public class firsts {

        public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any text");
              
              String str = scanner.nextLine();
              
               int halfsize = str.length()/2;
              
              System.out.println("First half of the given string is: "+str.substring(0,halfsize));
              
              scanner.close();
         
       }

}

---