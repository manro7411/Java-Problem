import java.util.Scanner;
public class problem77 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int countA=kb.nextInt();//begin
        int countB=kb.nextInt();//final

        
        if (countA>countB) {
            System.out.println("Not enough money.");     
        }else if (countA == countB){
            System.out.println("No change for you.");
        }else{
            int total=countB-countA;
        System.out.println("Change: " +total);
        System.out.println("1000THB: "+total / 1000);
        if (total>=1000) {
            total%=1000;
        } System.out.println("500THB: "+total / 500);
        if(total>=500){
            total%=500;
        } System.out.println("100THB: "+total / 100);
        if (total>=100){
            total%=100;
        } System.out.println("50THB: "+total / 50);
        if (total>=50){
            total%=50;
        } System.out.println("20THB: "+total / 20);
        if (total>=20){
            total%=20;
        } System.out.println("10THB: "+total / 10);
        if (total>=10) {
            total%=10;
        }System.out.println("5THB: "+total / 5);
        if (total>=5){
            total%=5;
        } System.out.println("2THB: "+total / 2);
        if (total>=2){
            total%=2;
        }System.out.println("1THB: "+total/1);
        if (total>=1) {
        }
    }
    }
}

