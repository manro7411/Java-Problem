import java.util.Scanner;
public class problem3v2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long number = kb.nextLong();
        long fac = 1 ;
        if (number>=1 && number<=20) {
            for (long i = number ; i > 0; i--) {
                fac*=i;
        }System.out.println(fac);
        }else{
            System.out.println("Error");
        }
    }
}

