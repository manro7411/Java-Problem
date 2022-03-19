import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int bomb = kb.nextInt();

     if (number<=2 || number==3 && bomb==2) {
        System.out.print("DIE");
     }else{
        for (int i = 1; i <= number; i++) {
            if (i==bomb || i ==bomb+1 || i ==bomb-1) {
                System.out.print("");
            }    
            else{
                System.out.print(i+" ");   
            }
            }
                          
        }
    }
}
