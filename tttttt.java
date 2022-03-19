public class tttttt {
    public static void main(String[] args) {
       int x = 3 , y = 3 , r = 0;
       while (true) {
           if (x==0&&y!=0) {
               y=x;
               y-=1;
           } else if(x!=0&&y!=0){
               x-=1;
         
           }else{
               break;
           }
           r+=x;
       }
       System.out.println(r);
    }
}
