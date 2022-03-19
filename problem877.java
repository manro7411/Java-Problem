import java.util.Scanner;
public class problem877 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long number = kb.nextLong();
       long sum = add(number);
       System.out.println("Sum of digits of " + number + " is " + sum);
    }
  
    
    static long add(long number) {
       
       if (number == 0) {
     return 0;
       }
       
       long lastDigit = number % 10;
       return lastDigit + add(number / 10);
    }
}