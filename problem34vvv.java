import java.util.Scanner;
public class problem34vvv {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for (int i = 0; i < number; i++) { //บน
            System.out.print("*");

        }for (int i = 0; i < number-1; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j || i + j == number -1 ) {
                    System.out.print();
                    
                } else {
                    
                }
                
            }System.out.println();
            
        }for (int i = 0; i < number; i++) {//ล่าง
            System.out.print("*");
            
        }System.out.println();
    }
}
