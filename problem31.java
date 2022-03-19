import java.util.Scanner;
public class problem31 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number=kb.nextInt();
        for (int i = number ; i >0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("-");
            }
            for (int j = number +1; j >i; j--) {
                System.out.print("*");
            }System.out.println();
            
        }
     
    }
}