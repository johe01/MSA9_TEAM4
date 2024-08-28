package MS_13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MS_13 {

	public static void main(String[] args) {

		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lotto = new ArrayList<ArrayList<Integer>>();
		ArrayList<String> randOption = new ArrayList<String>();
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
		// - 입력 완료

		// 당첨번호
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		String today = sdf.format(cal.getTime());
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd일 (E)");

		System.out.println("############# 인생역전 Lottoria ############");
		System.out.println("발행일\t\t: " + today);
		cal.set(cal.DAY_OF_WEEK, 7);
		cal.set(cal.HOUR_OF_DAY, 21);
		cal.set(cal.MINUTE, 0);
		cal.set(cal.SECOND, 0);
		String Dday = sdf.format(cal.getTime());
		System.out.println("추첨일\t\t: " + Dday);
		int year = cal.get(cal.YEAR);
		int day = cal.get(cal.DAY_OF_MONTH);
		cal.set(cal.YEAR, year + 1);
		cal.set(cal.DAY_OF_MONTH, day + 1);
		String dLine = sdf2.format(cal.getTime());
		System.out.println("지급기한\t\t: " + dLine);
		System.out.println("--------------------------------------------------");
		char alph = 'A';
		for (int i = 0; i < lotto.size(); i++) {
			System.out.print(alph + " " + randOption.get(i) + " ");
			for (int j = 0; j < 6; j++) {
				System.out.printf("%02d\t", lotto.get(i).get(j));
			}
			System.out.println();
			alph += 1;
		}
		System.out.println("--------------------------------------------------");
		DecimalFormat df = new DecimalFormat("\u00A4#,###");
		System.out.println("금액\t\t\t\t\t  " + df.format(n * 1000));
		System.out.println("##################################################");
		System.out.println();
		System.out.print("당첨 번호 : ");

		ArrayList<Integer> lottoList = new ArrayList<Integer>();

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
		
		char order = 'A';
		System.out.println("#################### 당첨 결과 ####################");
		for (int i = 0; i < lotto.size(); i++) {
			
		}
	}
}
