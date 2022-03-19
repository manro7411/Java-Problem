import java.util.Scanner;
public class pro34v1 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int num = kb.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num; j < 0; j--) {
                System.out.print("*");
                
            }System.out.println();
            
        }
    }
    
}
