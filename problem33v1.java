import java.util.Scanner;
public class problem33v1
{
    public static void main(String args[]) 
    {
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;

        //section1
        for (j = 1; j <= n; j++) 
        {   
            for (i = 1; i <= space; i++) 
            {
                System.out.print("-");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            for (int k = n-1; k >=0; k--) {
                for (int k2 = 0; k2 <=k; k2++) {
                    System.out.print("-");
                }
            }
        }
        space = 1;

        // section2 
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print("-");
            }
            space++;

            //section3
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}