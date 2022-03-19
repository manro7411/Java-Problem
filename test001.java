import java.util.Scanner;
import java.util.Arrays;
public class test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] name = {sc.nextInt() , sc.nextInt() , sc.nextInt()};
        Arrays.sort(name);
        System.out.println(name[1]);
    }
    
}
