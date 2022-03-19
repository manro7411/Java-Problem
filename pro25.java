import java.util.Scanner;
public class pro25 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num01 = kb.nextInt();
        int num02 = kb.nextInt();

        int max,min;

        if (num01>=num02) {
            max = num01;
            min = num02;
            
        } else {
            max = num02;
            min = num01;
        }
        int count = max ; 
        while (count>=min) {
            for (int i = max; i >=count; i--) {
                System.out.print(i+" ");
                
            }
            count--;
            
        }
    }
    
}
