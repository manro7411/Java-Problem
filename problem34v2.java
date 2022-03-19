import java.util.Scanner;
public class problem34v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        for (int i = 0; i <= (number * 2 + 1); i++) {
            for (int j = 0; j <= (number * 2 + 1); j++) {
                if (i == j) {
                    System.out.print("*");
                } else if (i + j == (number * 2 + 2)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
                System.out.println(); 
            }
        }
    }
    
}
