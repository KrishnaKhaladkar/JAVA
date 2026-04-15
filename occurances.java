// Java program to find the number of occurances of a character in the given String text

public class occurances {

        public static void main(String[] args)   {
          
               String str = "Arun Motoori";
              
               int before = str.length();
              
               int after = str.replace("o","").length();
              
               System.out.println("Number of occurrences of o in the string is: "+(before-after));

       }

}
