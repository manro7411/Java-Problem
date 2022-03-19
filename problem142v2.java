import java.util.Scanner;
class problem142v2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);  
    
        String[] inp = sc.nextLine().split("\\s+");  
        float f1 = Math.round((((Float.parseFloat(inp[0])-32)*5/9)*1.0)/1.0);
        float f2 = Math.round((Float.parseFloat(inp[1])*1.0)/1.0);
        if(f1 == f2){
            System.out.println("Same");
        }else if(f1<f2){
            System.out.println("Lower");
        }else if(f1>f2){
            System.out.println("Higher");
        }

        
    }
  }