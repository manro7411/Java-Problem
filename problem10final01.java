import java.util.Scanner;
public class problem10final01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row=kb.nextInt();
        int column=kb.nextInt();

        for (int i = 0; i < column ; i++) {
            System.out.print("*");
            
        }System.out.println();
        for (int i = 0; i < row-2; i++) {//tota row = 3
            System.out.print("*");
            for (int j = 0; j < column-2; j++) {
                System.out.print("-");
            }
            System.out.print("*");

            System.out.println();
        }
       

        for (int i = 0; i < column; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
