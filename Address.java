//Java program to find the IP Address of the given website

public class Address {

        public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter the website");
              
              String website = scanner.nextLine();
              
               try {
                     InetAddress ip = InetAddress.getByName(website);
                     System.out.println("IP Address of the given website is: "+ip);
              } catch(UnknownHostException e) {
                     System.out.println("Given website is not found");
              }
              
               scanner.close();
       }

}