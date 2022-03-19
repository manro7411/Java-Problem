import java.util.Scanner;
public class problem32 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int name = kb.nextInt();

        for (int i = name; i >=1 ; i--) {
                for (int j = name; j >i; j--) {
                    System.out.print("-");
                }for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }System.out.println();
            }
        }
    }

