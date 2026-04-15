// Java program to reverse the position of words in the String using Collections


public class position {

        public static void main(String[] args) {
              
              String str = "This is a statement one";
              
              String[] words = str.split(" ");
              
              List<String> list = Arrays.asList(words);
              
              Collections.reverse(list);
              
               for(String word : list) {
                     
                     System.out.print(word +" ");
                     
              }      
              
       }

}

---