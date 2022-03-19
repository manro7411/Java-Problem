import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        for (int i=0;i<b;i++){
            System.out.print("*");
        }System.out.println();
        for (int i=0;i<a-2;i++){
            System.out.print("*");
            for(int x =0;x<b-2;x++){
                System.out.print("-");
            }System.out.println("*");
            for (int y=0;y<b;y++){
                System.out.print("*");
        }System.out.println();
    }
}
}