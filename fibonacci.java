// Java program to print the fibonacci series till the inputed number

public class fibonacci {

        public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any number:");
              
               int num = scanner.nextInt();
              
               int t=0,a=1,b=1;
              
              System.out.print(a +" " +b +" ");
              
               while(t<=num) {
                     
                      t = a+b;
                     
                      if(t>num)
                         break;
                     
                     System.out.print(t +" ");
                     
                      a = b;
                     
                      b = t;
                     
              }
       
               scanner.close();
              
       }

}