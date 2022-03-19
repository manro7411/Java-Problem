import java.util.Scanner;
import java.util.Arrays;
public class problem27 {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        int[] score = new int[sc.nextInt()];
        for(int i=0;i<score.length;i++){
            score[i] = sc.nextInt(); 
        }
        sc.close();
        int[] score2 = new int[score.length];
        for(int i=0;i<score.length;i++){
            score2[i] = score[i];
        }
        Arrays.sort(score);

        float score3[] = {90,70,50,30,10};
        int score4[] = new int[5];
        for(int i=0;i<score3.length;i++){
            score3[i] = (score3[i](score.length +1))/100;
            score4[i] = score[Math.round(score3[i]-1)];
        }
        for(int i=0;i<score2.length;i++){
        System.out.print(score2[i]>=score4[0]?"A " : score2[i]>=score4[1]?"B " : score2[i]>=score4[2]?"C " :score2[i]>=score4[3]?"D ":score2[i]>=score4[4]?"E ":"F " );
        }
    }
}