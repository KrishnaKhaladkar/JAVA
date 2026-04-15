//Java program to remove white spaces in the given string text

public class removespaces {

        public static void main(String[] args) {
          
              String str = "A   B   C    D" ;
              
              String str2 = str.replaceAll("\\s","");
              
              System.out.println(str2);

       }

}