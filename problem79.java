import java.util.Scanner;
import java.util.Arrays;
public class problem79 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        double [] number = new double[n];
        double sum=0;
        for (int i = 0; i < number.length; i++) {
            number[i]= kb.nextInt();
            sum+=number[i];
        }
        double avg = sum/n;

        Arrays.sort(number);

        System.out.printf("Summation: "+"%.2f\n",sum);
        System.out.printf("Average: "+"%.2f\n",avg);
        System.out.printf("Max: " +"%.2f\n",number[n-1]);
        System.out.printf("Min: " +"%.2f\n",number[0]);
    }
}
