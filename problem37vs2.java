import java.util.Scanner;
public class problem37vs2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                
            System.out.print("*");
            }System.out.println();
        }
    }
    
}
