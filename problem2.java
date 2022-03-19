import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        for (int i=0;i<number;i++){
            for(int j=number;j>0;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    } 
}
