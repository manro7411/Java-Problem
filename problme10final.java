import java.util.Scanner;
public class problme10final {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row=kb.nextInt();
        int colum=kb.nextInt();
        for (int i = 0; i < colum; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int i=0;i<row-2;i++){
            System.out.print("*");
            for (int x=0;x<colum-2;x++){
                System.out.print("-");
            }
            System.out.print("*");

            System.out.println();
        }
        for (int i=0;i<colum;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
