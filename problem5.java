import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number=kb.nextInt();
        int total=number/2;
        int i;
        int m=0;
        if (total==0 && total==1) {
            System.out.println("Yes");
        } else {
            for(i=2;i<=m;i++){      
                if(number%i==0){      
                 System.out.println("No");  
        }
    }
        }
    }
}
