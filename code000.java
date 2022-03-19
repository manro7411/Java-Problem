public class code000 {
    import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tag = new int[m];
        int[] member = new int[n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            tag[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int give = tag[i] % n;
            if (give < n) {
                member[give] += 1;
            }
            if (member[give] > max)
                max = member[give];
        }
        for (int i = 0; i < n; i++) {
            if (member[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        boolean count = true;
        for (int i = 0; i < n; i++) {
            if (member[i] == 0) {
                System.out.print(i + " ");
                count = false;
            }
        }
        if (count) {
            System.out.println("Everyone receive the gifts.");
        }
    }
}
    
}
