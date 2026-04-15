// java program which intakes String and prints the duplicate characters along with number of times.

public class program23 {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any English statement:");
              
              String str = scanner.nextLine();
              
              Map<Character,Integer> m = new HashMap<Character,Integer>();
              
               char[] ca = str.toCharArray();
              
               for(Character c : ca) {
                     
                      if(m.containsKey(c)) {
                           
                            m.put(c, m.get(c)+1);
                           
                     } else {

                            m.put(c, 1);

                     }
              
              }
              
               for(Character c : m.keySet()) {
                     
                      if(m.get(c) > 1) {
                           System.out.println("Character "+c+" is repeated: "+m.get(c)+" times");
                     }
              
              }
              
              scanner.close();
              
       }

}