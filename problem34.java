import java.util.Scanner;
public class problem34 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
                
            }System.out.println();
            
        }
    }

    
}