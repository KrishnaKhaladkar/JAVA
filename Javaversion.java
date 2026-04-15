// Java program to print the Version of Java installed in your machine
public class JavaVersion {

        public static void main(String[] args) {
          
              String JavaVersion = System.getProperty("java.version");
              
              System.out.println("Java version installed in my machine is: "+JavaVersion);
         
       }

}