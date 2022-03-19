import java.util.Scanner;
public class problem85 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row =kb.nextInt();
        int column=kb.nextInt(); 
        int[] r = new int[row];
        int[] col = new int[column];

        for (int i = 0; i < r.length; i++) {
            r[row]=kb.nextInt();
            System.out.println(r);
        }
    }
}
