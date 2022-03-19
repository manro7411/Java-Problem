import java.util.Scanner;
public class problem110 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int number2 = kb.nextInt();
        int count=0;
         

        for (int i = number ; i <=number2; i++) {
            count+=i;    
        }System.out.println(count);
    }
}
