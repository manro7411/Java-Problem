import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for(int i=number;i>0;i--){
            System.out.print("*");
        }System.out.println();
    }
    
}
