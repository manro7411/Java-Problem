import java.util.Arrays;
import java.util.Scanner;
public class problem22 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine().toLowerCase();
        int r = word.length();
        int sum = 0;
        for (int i = 0; i < r; i++) {
            Arrays.binarySearch(a, key)
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' ) {
                sum =+ (word.charAt(i) - 96) - i;   
            }
        }
        System.out.println(sum);
    }
}