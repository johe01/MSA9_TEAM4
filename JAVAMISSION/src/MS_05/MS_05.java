package MS_05;

import java.util.Scanner;

public class MS_05 {
	static int sum = 0;

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("********** 치킨 메뉴판 **********");
			System.out.println("1.\t황금올리브 반반한 치킨");
			System.out.println("2.\t뿌잉클 치킨");
			System.out.println("3.\t처갓집에서 호식이가 만든 치킨");
			System.out.println("0.\t종료");
			System.out.print("********** 번호: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			System.out.println();
			switch (n) {
			case 1:
				System.out.println("'황금올리브 반반한 치킨'이(/가) 주문되었습니다.");
				sum += 1;
				break;
			case 2:
				System.out.println("'뿌잉클 치킨'이(/가) 주문되었습니다.");
				sum += 1;
				break;
			case 3:
				System.out.println("'처갓집에서 호식이가 만든 치킨'이(/가) 주문되었습니다.");
				sum += 1;
				break;
			case 0:
				System.out.printf("총 %d 개의 상품이 주문되었습니다.", sum);
				sc.close();
				break;
			default:
				System.out.println("(0~3) 사이의 번호를 입력해주세요.");
				break;
			}
			System.out.println("\n");
		} while (n != 0);
	}
}
