import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number1=kb.nextInt();
        int number2=kb.nextInt();

        for (int i=0;i<number1;i++){
            for (int x=number1;x>0;x--){
                if (i == 0 || i == number1-1 ||
                x == 0 || x == number2+2 || x == number2-2)           
                System.out.print("*");           
            else
                System.out.print("-");   
            }
            System.out.println();
        }
        
    }
    
}
