//  Java program to implement Merge Sort Algorithm

public class MergeSort   {

     public static void main(String[] args) {
           
            int[] arr = {41,62,23,46,2,9,89,25,15,65};
           
           Demo demo = new Demo();
           
            demo.sort(arr,0,arr.length-1);
           
           System.out.println(Arrays.toString(arr));

     }
     
     public void sort(int[] arr,int begin,int end) {
           
            if(begin<end) {
                
                 int middle = (begin+end)/2;
                
                sort(arr,begin,middle);
                
                sort(arr,middle+1,end);
                
                merge(arr,begin,middle,end);
                
           }
           
     }
     
     public void merge(int[] arr,int begin,int middle,int end) {
           
            int leftSize = middle-begin+1;
           
            int rightSize = end-middle;
           
            int[] leftArray = new int[leftSize];
           
            int[] rightArray = new int[rightSize];
           
            for(int i=0;i<leftSize;i++) {
                
                 leftArray[i] = arr[begin+i];
                
           }
           
            for(int j=0;j<rightSize;j++) {
                
                 rightArray[j] = arr[middle+1+j];
                
           }
           
            int i = 0;
            int j = 0;
            int k = begin;
           
            while(i< leftSize && j<rightSize) {
                
                 if(leftArray[i]< rightArray[j]) {
                     
                      arr[k] = leftArray[i];
                     
                      i++;
                     
                } else {
                     
                      arr[k] = rightArray[j];
                     
                      j++;
                     
                }
                
               k++;             
                
           }
           
            while(i<leftSize) {
                
                 arr[k] = leftArray[i];
                
                 i++;
                 k++;
                
           }
           
            while(j<rightSize) {
                
                 arr[k] = rightArray[j];
                
                 j++;
                 k++;
                
           }
           
     }

}