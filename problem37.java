import java.util.Scanner;
public class problem37 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.print("*");

        for (int i = 0; i < number-2; i++) {
            System.out.print("-");
        }System.out.print("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        for (int i = 0; i < number-3; i++) {
            System.out.print("-");
            
        }System.out.print("*");
        System.out.println();
        System.out.print("*");
        for (int i = 2; i < number-2 ; i++) {
            System.out.print("-");
        }System.out.print("*");
        System.out.print("-");
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        for (int i = 0; i < number-3; i++) {
            System.out.print("-");
           
        } System.out.print("*");
        System.out.print("*");
        System.out.println();
        System.out.print("*");
        for (int i = 0; i < number-2; i++) {
            System.out.print("-");
        }System.out.print("*");
        System.out.println();
    }
    
}
