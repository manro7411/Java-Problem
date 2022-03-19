import java.util.Scanner;
public class problem37vvv {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j ==1 || j == number || j == i ) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }System.out.println();
            
        }
        
    }
}
