import java.util.Scanner;
public class test02{   
public static void main(String args[]){
    Scanner kb = new Scanner(System.in);
    int row=kb.nextInt();   
     int i, j;

for(i=0; i<row; i++)   
{   
for(j=0; j<=i; j++)   
{   
 System.out.print("*");   
}   
System.out.println();   
}   
}   
}  