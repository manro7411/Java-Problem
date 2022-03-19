import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] box = new int[n];

        for (int i = 0; i < n; i++) {
            box[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int s = 0;
            int p = sc.nextInt();
            int p2 = sc.nextInt();
            for (int j = p; j <= p2; j++) {
                s += box[j];
            }
            System.out.println(s);
        }

    }
}
