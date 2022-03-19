import java.util.Scanner;
public class problem33 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int grade=kb.nextInt();

        if (grade>=0 && grade<=49) {
            System.out.println("F");
        }else if (grade>=50 && grade<=59){
            System.out.println("D");
        } else if (grade>=60 && grade<=79){
            System.out.println("C");
        } else if (grade>=80 && grade<=89){
            System.out.println("B");
        } else if (grade>=90 && grade<=100){
            System.out.println("A");
        }else{
            System.out.println("error");
        }
    }
}
