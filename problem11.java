import java.util.Scanner;
class problem11{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int i,j,k;
          for(i=1;i<=n-1;i++) {
              for (j = 1; j <= n - i; j++) {
                  System.out.print("-");
              }
              System.out.print("*");
              if (i == 1) {
                  for (j = 1; j <= n - 1; j++) {
                      System.out.print("*");
                  }
                  System.out.println("");
              } else {
                  for (j = 1; j <= n - 2; j++) {
                      System.out.print("-");
                  }
                  System.out.print("*");
                  for (j = 0; j <= i - 3; j++) {
                      System.out.print("-");
                  }
  
                  System.out.println("*");
              }
          }
          //sec2
          for(i=1;i<=n;i++){
              System.out.print("*");
          }
          for(i=1;i<=n-2;i++){
              System.out.print("-");
          }
          System.out.println("*");
          for(i=1;i<=n-2;i++){
              System.out.print("*");
              for(j=1;j<=n-2;j++){
                  System.out.print("-");
              }
              System.out.print("*");
              for(j=3;j<=n-i;j++){
                  System.out.print("-");
              }
              System.out.println("*");
          }
          for(i=1;i<=n;i++){
              System.out.print("*");
          }
      }
  }