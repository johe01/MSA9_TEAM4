package MS_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MS_12 {

	public static void main(String[] args) {
		
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for (int m = 0; m < n; m++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			System.out.printf("[%d 게임]: ",m+1);
			
			for (int i = 0; i < 6; i++) {
				int random = (int)(Math.random() * 45 + 1);
				lotto.add(random);
				
				for (int j = 0; j < i; j++) {
					if (lotto.get(j)==random) {
						lotto.remove(i);
						i--;
					}
				}
			}
			// 정렬 메소드 사용
			lotto.sort(Comparator.naturalOrder());
			
			// 정렬 알고리즘 사용
//			for (int i = 0; i < lotto.size()-1; i++) {
//				int minIdx=i;
//				for (int j = i; j < lotto.size(); j++) {
//					if (lotto.get(j)<lotto.get(minIdx)) {
//						minIdx=j;
//					}
//				}
//				int temp=lotto.get(minIdx);
//				lotto.remove(minIdx);
//				lotto.add(i, temp);
//			}
			
			for (int i = 0; i < lotto.size(); i++) {
				System.out.print(lotto.get(i)+" ");
			}
			System.out.println();
			
		}
	}
}
