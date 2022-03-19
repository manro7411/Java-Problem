import java.util.Scanner;

public class problem41  {
   public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int c=0;

      if (number == 2 || number == 3) {
        System.out.println(number);
        while ( number % 2 == 0) {
            number/=2;
            if (c==0) {
                
                System.out.print(2 + " ");
                c++;
            } else {
                System.out.print("x " + 2 + " ");
            }   
        }
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.print(i+" "+"x"+" ");
            number/=i;
         }
      }
      if(number >=2) {
         System.out.print(number);
      }
       
          
       }
   }
}