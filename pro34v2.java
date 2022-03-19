import java.util.Scanner;
public class pro34v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i==j || i+j==number-1 || i==0 ||j==number-1 || j==0 || i == number-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }System.out.println();
        }
    }
}
