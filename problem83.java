import java.util.Scanner;
public class problem83 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row=kb.nextInt();
        int column=kb.nextInt();

        for (int i = 0; i < column; i++) {
            System.out.print("*_");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("|_");
            }
            System.out.print("|");
            System.out.println();
        }   
   }   
}

