// Java program to check whether the given number is a power of 4

public class power {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any Number:");
              
               int num = scanner.nextInt();
              
               scanner.close();
              
               boolean status = false;
              
               while(num>0) {
                     
                      int reminder = num % 4;
                     
                      if(reminder!=0) {
                           
                            break;
                           
                     }
                     
                      num = num / 4;
                     
                      if(num ==1){
                           
                           System.out.println("Given number is a power of 4");
                            status = true;
                            break;
                     
                     }
                     
              }
              
               if(!status) {
                     
                     System.out.println("Given number is not a power of 4" );
                     
              }
              
              
       }
       
}

---