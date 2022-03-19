import java.util.Scanner;
public class test83 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number1 = kb.nextInt();
        int number2 = kb.nextInt();

        for (int i = 0; i < number1; i++) {
            for (int j = number2; j > 0; j--) {
                System.out.print("*_");
            }System.out.print("*");
            System.out.println();
        }
    }
    
}
