import java.util.Scanner;
public class problem8777
 
{
int sum=0;
int sum(long num)
{
 
if(num!=0)
{
sum+=num%10;
num/=10;
sum(num);
}
return sum;
}
 
public static void main(String arg[])
{
long n,res;
Main s=new Main();
Scanner sc=new Scanner(System.in);
n=sc.nextLong();
 
System.out.println(s.sum(n));
 
}
}