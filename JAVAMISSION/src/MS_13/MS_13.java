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
	
	// private static ArrayList<Integer> lottoList = new ArrayList<Integer>();
	
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

	public static void lottoDraw(ArrayList<Integer> lottoList) {
		System.out.print("당첨 번호 : ");
		// 랜덤 수 6개를 대입
		for (int j = 0; j < 7; j++) {
			int rand = (int) (Math.random() * 45 + 1); // 1~45 랜덤 수

			// 중복 제거
			if (lottoList.contains(rand))
				j--;
			else
				lottoList.add(rand);

		} // -- 랜덤 수 6개 대입 끝

		// 정렬
		Collections.sort(lottoList);

		// 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoList.get(i) + " ");
		}
		System.out.println();
		System.out.println("보너스 번호 : " + lottoList.get(6));
		
	}

	public void resPrint(ArrayList<ArrayList<Integer>> lotto, ArrayList<String> randOption,
			ArrayList<Integer> lottoList) {
		char order = 'A';
		System.out.println("#################### 당첨 결과 ####################");
		for (int i = 0; i < lotto.size(); i++) {
			System.out.print(order++);
			System.out.print(" "+randOption.get(i)+" ");
			for (int j = 0; j < 6; j++) {
				System.out.printf("%02d    ",lotto.get(i).get(j));
			}
			lottoRes(lotto.get(i),lottoList);
			
		}
		System.out.println("################################################");
	}

	public void printReceipt(ArrayList<ArrayList<Integer>> lotto, ArrayList<String> randOption) {
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		String today = sdf.format(cal.getTime());
		
		if (cal.get(cal.DAY_OF_WEEK)==7&&cal.get(cal.HOUR_OF_DAY)>=21) {
			cal.set(cal.DAY_OF_YEAR, (cal.get(cal.DAY_OF_YEAR)+5));
			cal.get(cal.DAY_OF_YEAR);
		}
		
		cal.set(cal.DAY_OF_WEEK, 7);
		cal.set(cal.HOUR_OF_DAY, 21);
		cal.set(cal.MINUTE, 0);
		cal.set(cal.SECOND, 0);
		String Dday = sdf.format(cal.getTime());
		
		int year = cal.get(cal.YEAR);
		int day = cal.get(cal.DAY_OF_MONTH);
		cal.set(cal.YEAR, year + 1);
		cal.set(cal.DAY_OF_MONTH, day + 1);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd일 (E)");
		String dLine = sdf2.format(cal.getTime());

		System.out.println("############# 인생역전 Lottoria ############");
		System.out.println("발행일\t\t: " + today);
		System.out.println("추첨일\t\t: " + Dday);
		System.out.println("지급기한\t\t: " + dLine);
		System.out.println("--------------------------------------------------");
		char alph = 'A';
		for (int i = 0; i < lotto.size(); i++) {
			System.out.print(alph + " " + randOption.get(i) + " ");
			for (int j = 0; j < 6; j++) {
				System.out.printf("%02d\t", lotto.get(i).get(j));
			}
			System.out.println();
			alph++;
		}
		System.out.println("--------------------------------------------------");
		DecimalFormat df = new DecimalFormat("\u00A4#,###");
		System.out.println("금액\t\t\t\t\t  " + df.format(lotto.size() * 1000));
		System.out.println("##################################################");
		System.out.println();
	}
	
	
}
