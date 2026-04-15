//To check wheather the given input number is even or odd

import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number :");

        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println(num+"number given by user is an even number");
        } else {
            System.out.println(num+"number given by user is an odd number");
        }
    }
}