import java.util.Scanner;
class problem10v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 0; i < col; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int i = 0; i < l - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < col - 2; j++) {
                System.out.print("-");
            }
            System.out.print("*");

            System.out.println();
        }

        for (int i = 0; i < col; i++) {
            System.out.print("*");

        }
        System.out.println();
    }
}
