import java.util.Scanner;
public class pro34{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
		int count = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count

		for (int i = 0; i < count; i++) { // ควบคุมจำนวนบรรทัดเท่ากับ count
			for (int j = 0; j < count; j++) { // ควบคุมจำนวนที่จะวาดแต่ละบรรทัด
				if (i == 0 || i == (count - 1)) { // บรรทัดแรกและบรรทัดสุดท้าย
					System.out.print("*");
				} else {
					if (j == 0 || j == (count - 1)) { // ตำแหน่งแรกและตำแหน่งสุดท้าย
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}