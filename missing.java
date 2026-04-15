//Java program to find the missing element in the array

public class missing {

        public static void main(String[] args) {
          
               int[] a = {1,2,3,4,6};
              
               //Expected Sum if number is not missed in the array
              
               int sumWithoutMissing = 0;
              
               for(int i=1;i<=6;i++) {
                     
                      sumWithoutMissing = sumWithoutMissing + i;
                     
              }
              
               //Actual Sum when number is missed in the array
              
               int sumWhenMissing = 0;
              
               for(int i=0;i<a.length;i++) {
                     
                      sumWhenMissing = sumWhenMissing + a[i];
                     
              }
              
              System.out.println("Missing number in the array is: "+(sumWithoutMissing- sumWhenMissing));

       }

}