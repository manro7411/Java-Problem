import java.util.Scanner;
public class pause {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    int peak = 0;
    int[] peaks = new int[n];
    for (int i = 0; i < n; i++) {
      ar[i] = sc.nextInt();
    }
    if (n == 1) {
      System.out.println(1);
      System.out.print(ar[0]);
    }

    else {
      for (int i = 0; i < n; i++) {
        if (i != 0 && i != n - 1) {
          if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {
            peaks[peak] = ar[i];
            peak++;
          }
        } else if (i == 0) {
          if (ar[i] > ar[i + 1]) {
            peaks[peak] = ar[i];
            peak++;
          }
        } else if (i == n - 1) {
          if (ar[i] > ar[i - 1]) {
            peaks[peak] = ar[i];
            peak++;
          }
        }
      }

      System.out.println(peak);
      for (int i = 0; i < peak; i++) {
        System.out.print(peaks[i] + " ");
      }
    }
    sc.close();

}
}
