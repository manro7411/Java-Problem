import java.util.Scanner;
public class problem37v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.print("*");

        for (int i = 0; i < number-1; i++) {
            System.out.print("-");
        }
        System.out.print("*");
        System.out.println();
        //System.out.print("*");
        for (int i = 0; i < number-2; i++) {
            for (int j = number; j >0; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
            
        }
    }
}

