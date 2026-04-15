// Java program to reverse each and every word in the given String text

public class reverseword {

        public static void main(String[] args) {
          
              String str = "Mr Arun Motoori";
              
              String[] words = str.split(" ");
              
              String reversedStr = "";
              
               for(String word : words) {
                     
                     String reversedWord="";
                     
                      for(int i=word.length()-1;i>=0;i--) {
                           
                            reversedWord = reversedWord + word.charAt(i);
                           
                     }
                     
                      reversedStr = reversedStr +reversedWord +" ";
                     
              }
              
              System.out.println(reversedStr);
              
       
       }

}