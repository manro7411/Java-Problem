import java.util.Scanner;
public class problem32final {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int name = kb.nextInt();
        
        for (int i = name; i >= 1; i--) {
            System.out.print("-");
        }System.out.println();

    }
}
