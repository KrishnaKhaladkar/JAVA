// Java Program to left rotate a String by 1 position

public class leftRotate {

        public static void main(String[] args) {
              
              String name= "arun";
              
               char[] ca = name.toCharArray();
              
               char first = ca[0];
              
               int size = ca.length ;
              
               for(int i=0;i<size-1;i++) { 
                     
                      ca[i] = ca[i+1];
                     
              }
              
               ca[size-1] = first;
              
              StringBuffer sb = new StringBuffer();
              
               for(char c : ca) {
                     
                  sb.append(c);
                     
              }
              
              System.out.println(sb);
              
       }

}