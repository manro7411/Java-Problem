import java.util.Scanner;
public class problem123 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name1 = kb.next(),name2 = kb.next();
        
        if (name1.equals(name2)) {
            System.out.println("Perfect Match");
        } else if(name1.equalsIgnoreCase(name2) || name1.toLowerCase().contains(name2.toLowerCase()) || name2.toLowerCase().contains(name1.toLowerCase())){
            System.out.println("Partial Match");
        }else {
            System.out.println("Not Match");
        }
    }
}