import java.util.Scanner;
public class basic001 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int number02 = kb.nextInt();
        int [][]newnum = new int[number][number02]; 

        for (int i = 0; i < number; i++) {
            newnum[i] = kb.nextInt();
            System.out.print(newnum[i]);
            
        }
       
    }
    
}
