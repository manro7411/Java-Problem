import java.util.Scanner;

import org.w3c.dom.Text;
public class problem29 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         String name = kb.nextLine();
         int number = kb.nextInt();
        for (int i = 0; i < name.length(); i++) {
            if (i%number == 0) {
                System.out.print(name.charAt(i));
            }
        }
    }
    
}
