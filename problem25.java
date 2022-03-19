import java.util.Scanner; 
public class Main{    
    public static void main(String args[]){    
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int t = sc.nextInt();
        int min,max ;

        if(w>=t){
               max = w;
               min =t;
           }
        
         else {
               max = t;
               min = w; }
        
         int counter = max;
        while(counter>=min){
        for(int i = max; i>= counter; i--){
                   System.out.print(i + " ");
        }
               counter--;
        }
   }
}    