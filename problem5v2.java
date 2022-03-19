import java.util.Scanner;
public class problem5v2{    
    public static void main(String args[]){    
        Scanner kb = new Scanner(System.in);
     int i,m=0,flag=0;      
     int number = kb.nextInt();    
     m=number/2;      
     if(number==0||number==1){  
      System.out.println("No");      
     }else{  
      for(i=2;i<=m;i++){      
       if(number%i==0){      
        System.out.println("No");      
        flag=1;      
        break;      
       }      
      }      
      if(flag==0)  { System.out.println("Yes"); }  
     }//end of else  
   }    
}   
