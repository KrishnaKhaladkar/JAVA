// Java program to convert a String to Date

public class convertDate {

     public static void main(String[] args) throws ParseException {
           
           String str = "2020-Nov-21";
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
           
           Date date = sdf.parse(str);
           
           System.out.println(date);
           
    }
           
}

---