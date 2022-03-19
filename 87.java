import java.util.Scanner;  
public class SumOfDigitsExample6  
{  
//variable that stores the sum              
int sum=0;  
//function that finds the sum of digits of a number  
int sum(int number)  
{  
//executes until the statement returns false      
if(number != 0)  
{  
//finds the last digit from the number and add it to the variable sum          
sum = sum + number % 10;  
//removes the last digit by diving the number by 10  
number = number / 10;  
//function recursively called  
sum(number);  
}  
//returns sum  
return sum;  
}  
public static void main(String args[])  
{  
int number;  
SumOfDigitsExample6 sod = new SumOfDigitsExample6();  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads an integer from the user  
number=sc.nextInt();  
//calling the user-defined method and prints the result   
System.out.println("The sum of digits: "+sod.sum(number));  
}  
}  