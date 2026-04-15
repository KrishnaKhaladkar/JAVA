// Java Program to print Diamond Number Pattern

public class DiamondNumber {

     public static void main(String[] args) {
           
            int count = 1;
            int start = 0;
            int spaces = 3;
           
            for(int i=1;i<=7;i++) {
                
                 for(int j=1;j<=spaces;j++) {
                     
                     System.out.print(" ");
                     
                }
                
                 if(i<=4) {
                     
                      count = 2*i-1;
                      start = i;
                      spaces--;
                     
                      if(i==4){
                        spaces+=2;
                      }
                
                } else {
                                     
                      count = count-2;
                      start = 8-i;
                      spaces++;
                     
                }
                
                 for(int j=1;j<=count;j++) {
                     
                     System.out.print(start);
                     
                      int middle = count/2+1;
                     
                      if(j<middle) {
                           
                            start--;
                           
                     } else {

                            start++;
                     }
                     
                }
                
                System.out.println();
                
           }
           
           
    }
           
}