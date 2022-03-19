import java.util.Scanner; 
public class problem3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int fac = 1;
        if (number<=1 && number<=20) {
            for (int i=1;i<=number;i++){
                fac*=i;
        }
        System.out.println(fac);
        }else{
            System.out.println("error");
        }   
    }   
}
