// Java program logic to compare two arrays without using inbuilt methods

public class comparetwo {

        public static void main(String[] args) {
          
               int[] a = {0,1,2,3,4,5};
              
               int[] b = {0,1,2,3,4,5};
              
               boolean comparisionStatus = true;
              
               if(a.length == b.length) {
                     
                      for(int i=0;i<a.length ;i++) {
                           
                            if(a[i]!=b[i]) {
                                  
                                   comparisionStatus = false;
                                  
                                   break;
                                  
                           }
                           
                     }
                     
              } else {
                     
                      comparisionStatus = false;
                     
              }
              
               if(comparisionStatus) {
                     
                     System.out.println("The given arrays are equal");
                     
              } else {
                     
                     System.out.println("The given arrays are not equal");
                     
              }
              

       }

}