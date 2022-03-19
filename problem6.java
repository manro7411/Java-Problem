import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int column=kb.nextInt();
        int row=kb.nextInt();

        for (int i = 0; i < column; i++) {
            for (int j = row; j>0; j--) {
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
