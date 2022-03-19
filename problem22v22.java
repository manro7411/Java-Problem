import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        int r = word.length();
        int sum = 0;
        for (int i = 0; i < r; i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                sum += (word.charAt(i) - 96) - i;

            }
        }
        System.out.println(sum);
    }
}