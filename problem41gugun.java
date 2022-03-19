import java.util.Scanner;
import java.lang.Math;

class problem41gugun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = 0;
        if (x == 2 || x == 3) {
            System.out.print(x);
        } else {
            while (x % 2 == 0) { // กรณี 2
                x /= 2;
                if (c == 0) {
                    System.out.print(2 + " ");
                    c++;
                } else {
                    System.out.print("x " + 2 + " ");
                }
            }
            for (int i = 3; i <= x; i += 2) {
                while (x % i == 0) {
                    x /= i;
                    if (c == 0) {
                        System.out.print(i + " ");
                        c++;
                    } else {
                        System.out.print("x " + i + " ");
                    }
                }
            }
        }
    }
}