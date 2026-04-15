// Java program to check whether the String is Anagram of another String by using sorting technique

public class stringAnagram {

        public static void main(String[] args) {
         
           Scanner scanner =  new Scanner(System.in);
          
           System. out.println("Enter first String:" );
          
           String str1 = scanner.nextLine();
          
           System. out.println("Enter second String:" );
          
           String str2 = scanner.nextLine();
          
           str1 = str1.replaceAll( "\\s","" ).toLowerCase();
          
           str2 = str2.replaceAll( "\\s","" ).toLowerCase();
          
           if(anagramCheck(str1,str2)) {
              
              System.out.println("Given strings are anagrams");
              
           } else {
              
              System.out.println("Given strings are not anagrams");
              
           }
          
       }
       
        public static boolean anagramCheck(String str1,String str2) {
              
               char[] caStr1 = str1.toCharArray();
              
               char[] caStr2 = str1.toCharArray();
              
              Arrays.sort(caStr1);
              
              Arrays.sort(caStr2);
              
             return Arrays.equals(caStr1, caStr2);
              
       }

}