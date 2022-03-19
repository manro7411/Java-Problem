import java.util.Scanner;

/**
 * problem33vv
 */
public class problem33vv {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int space = number-1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }for (int j = 0; j <=i; j++) {
                System.out.print("* ");
             System.out.print("\n");   
             space--;
            }
            
        }
    }
}