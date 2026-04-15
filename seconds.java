//  Java program which intakes number of seconds and converts into hours, minutes and seconds

public class seconds {

        public static void main(String[] args) {
          
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter the number of seconds:");
              
               int seconds = scanner.nextInt();
              
               int minutes = seconds/60;
              
               int remainingSeconds = seconds%60;
              
               int hours = minutes/60;
              
               int remainingMinutes = minutes%60;
              
              System.out.println(hours +":" +remainingMinutes +":" +remainingSeconds);
              
              scanner.close();
       
       }

}