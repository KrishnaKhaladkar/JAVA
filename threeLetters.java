// Java program to print the last three letters of the given text

public class threeLetters {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System. out.println("Enter any sentence");
              
              String str = scanner.nextLine();
              
               char[] carr = str.toCharArray();
              
               int size = carr.length;
              
              String threeLetters = "";
              
               for(int i=size-1;i>size-4;i--) {
                     
                      threeLetters = carr[i] + threeLetters;
              }
              
              System.out.println("Last three letters of the given text is: "+threeLetters);
              
               scanner.close();
         
       }

}