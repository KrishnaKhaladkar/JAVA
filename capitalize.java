// Java program to capitalize the first letter of each word in the given statement

public class capitalize {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any statement:");
              
              String orignalStatement = scanner.nextLine();
              
               scanner.close();
              
               //Logic for capitalizing each and every word of the given statement
              
              String[] words = orignalStatement.split(" "); 
              
              String finalStatement = "";
              
               for(String word : words) { 
                     
                      char[] ca = word.toCharArray();  
                     
                      char c = ca[0];
                     
                     String firstChar = String.valueOf(c).toUpperCase();
                     
                     String capitializedWord = firstChar; 
                     
                      for(int i=1;i<ca.length;i++) {
                           
                            capitializedWord = capitializedWord + ca[i]; 
                           
                     }
                     
                      finalStatement = finalStatement + capitializedWord +" "; 
                     
              }
              
              System.out.println(finalStatement);
              
       }

}