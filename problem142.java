import java.util.Scanner;

public class problem142 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float number01 = kb.nextFloat();
        float number02 = kb.nextFloat();
        float number03 = ((number02*9)/5) + 32;

        if (number01>number03) {
            System.out.println("Higher");
        } else if (number01<number03) {
            System.out.println("Lower"); 
        }else if (number01==number03){
            System.out.println("Same");
        }
    }
}
