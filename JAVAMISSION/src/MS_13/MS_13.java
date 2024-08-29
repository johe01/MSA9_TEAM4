package MS_13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MS_13 {

	private static MS_13 instance = new MS_13();
	
	private MS_13() {}
	
	public static MS_13 getInstance() {
		if (instance == null) {
			instance = new MS_13();
		}
		return instance;
	}

	static void lottoRes(ArrayList<Integer> mine, ArrayList<Integer> lotto) {
		
		int sum = 0;
		boolean bonus = false;
		
		for (int i = 0; i < lotto.size() - 1; i++) {
			for (int j = 0; j < mine.size(); j++) {
				if (lotto.get(i) == mine.get(j))
					sum++;
			}
		}
		
		for (int i = 0; i < mine.size(); i++) {
			if (lotto.get(6) == mine.get(i))
				bonus = true;
		}
		
		switch (sum) {
		case 6:
			System.out.println("(1등)");
			break;
		case 5:
			if (bonus)
				System.out.println("(2등)");
			else
				System.out.println("(3등)");
			break;
		case 4:
			System.out.println("(4등)");
			break;
		case 3:
			System.out.println("(5등)");
			break;
		default:
			System.out.println("(낙첨)");
			break;
		}
		
	}

	public static void buyLotto(ArrayList<ArrayList<Integer>> lotto, ArrayList<String> randOption) {
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int m = 0; m < n; m++) {

			System.out.printf("[%d 게임] (1.자동 / 2.수동) : ", m + 1);
			int choice = sc.nextInt();

			if (choice == 1) {
				randOption.add(m, "자  동");
				lotto.add(m, new ArrayList<Integer>());
				for (int i = 0; i < 6; i++) {
					int random = (int) (Math.random() * 45 + 1);
					lotto.get(m).add(random);

					for (int j = 0; j < i; j++) {
						if (lotto.get(m).get(j) == random) {
							lotto.get(m).remove(i);
							i--;
						}
					}
				}
			} else if (choice == 2) {
				randOption.add(m, "수  동");
				lotto.add(m, new ArrayList<Integer>());
				for (int i = 0; i < 6; i++) {
					System.out.printf("%d : ", i + 1);
					int num = sc.nextInt();
					lotto.get(m).add(num);
				}
			} else {
				System.out.println("1 과 2 중에 선택해주세요.");
				m--;
				continue;
			}
			// 정렬 메소드 사용
			lotto.get(m).sort(Comparator.naturalOrder());
			//
			for (int i = 0; i < lotto.get(m).size(); i++) {
				System.out.print(lotto.get(m).get(i) + " ");
			}
			System.out.println();

		}
		sc.close();

		
	}


	
	
}
