import java.util.*;

class quiz003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] box = new int[m];
        int[] member = new int[n];
        int max = 0;
        for (int i = 0; i < m; i++) {// input + give
            box[i] = sc.nextInt();
            int give = box[i] % n;// แจกของ
            member[give] += 1;
            if (member[give] > max) {// set max 
                max = member[give];  // max คือกล่องของขวัญมากที่สุดที่สมาชิกมี
            }
        }
        for (int i = 0; i < n; i++) {// ปริ้น max ที่ตำแหน่ง i
            if (member[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        boolean check = true;
        for (int i = 0; i < n; i++) {// ปริ้นคนที่ไม่ได้ 
            if (member[i] == 0) {
                System.out.print(i + " ");
                check = false;
            }
        }
        if (check) {//ปริ้นเมื่อคนได้ครบบทุกคน
            System.out.println("Everyone receive the gifts.");
        }

    }
}