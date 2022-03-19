import java.util.Scanner;
public class quizzzzz01 {  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int column = kb.nextInt();
        int friend = kb.nextInt();
        int number01=friend;
        //int count=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(number01/friend%10);
                number01++;
/*
                if (count%friend==0) {
                    number01++;
                }System.out.print(number01%10);
                count++; */
            }
            System.out.println();
            
        }
    }
}
