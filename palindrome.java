// Java program to check whether the given String text is a Palindrome

public class palindrome {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any text:");
              
              String orginalText = scanner.nextLine();
              
               char[] ca = orginalText.toCharArray();
              
              String reversedText = "";
                                  
               for(int i=ca.length-1;i>=0;i--) {
                     
                      reversedText = reversedText + ca[i];
                     
              }
              
               if(orginalText.equals(reversedText)) {
                     
                     System.out.println("Given Text is a palindrome");
                     
              } else {
                     
                     System.out.println("Given Text is not a palindrome");
                     
              }
              
               scanner.close();
              
       }