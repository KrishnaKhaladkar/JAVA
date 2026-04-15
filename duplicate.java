//  Java program to remove the duplicate charaters in the given String

public class duplicate {

        public static void main(String[] args) {
              
              String str = "coconut";
              
              Set<Character> set = new LinkedHashSet<Character>();
              
               for(int i=0;i <str.length();i++) {
                     
                      set.add(str.charAt(i));
                     
              }
              
              StringBuffer sb = new StringBuffer();
              
               for(Character c : set) {
                     
                  sb.append(c);
                     
              }
              
              System.out.println(sb);
              
       }

}