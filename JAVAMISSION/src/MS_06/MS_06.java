package MS_06;

import java.util.Scanner;

public class MS_06 {

	public static void main(String[] args) {
		
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int lotto[] = new int[6];
		
		for (int m = 0; m < n; m++) {
			System.out.printf("[%d 게임]: ",m+1);
			
			for (int i = 0; i < 6; i++) {
				int random = (int)(Math.random() * 45 + 1);
				lotto[i]= random;
				// 중복 제거
				for (int j=0; j<i; j++) {
					// 중복이 되는 경우
					if(lotto[j]== random) {
						i--;
					}
				}
			}
			
			// 오름차순 정렬
			for (int i = 0; i < lotto.length - 1; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						// swap
						// lotto[i]와 lotto[j] 교환
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}

	}

}
