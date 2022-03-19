import java.util.Scanner;
public class problem30 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j=number-1; j>1; j--) {
                
            }for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }System.out.println();
        }   
    }
}
