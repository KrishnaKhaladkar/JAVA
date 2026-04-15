// Java program to reverse a String

public class program26 {

        public static void main(String[] args) {
              
              String str = "Arun Motoori";

                       String reversedStr="";  
              
               char[] ca = str.toCharArray();
              
               for(int i=ca.length-1;i>=0;i--) {
                     
                  reversedStr = reversedStr+ca[i];
                     
              }

              System.out.println(reversedStr);
      
       }

}