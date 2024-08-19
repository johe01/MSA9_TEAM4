package MS_06;

import java.util.Random;
import java.util.Scanner;

public class MS_06 {

	public static void main(String[] args) {
		int arr[] = new int[6]; // 배열 생성

		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 몇 게임할지 입력받음
		sc.close();
		for (int sum = 0; sum < n; sum++) {
			// 입력 받은 수만큼 반복
			arr[0] = (int) (Math.random() * 45) + 1;
			System.out.println("arr[0]: " + arr[0]);
			System.out.printf("[%d 게임] : ", sum + 1);
			for (int i = 1; i < arr.length; i++) {
				int rand = (int) (Math.random() * 45) + 1;
				System.out.println("r( " + i + " ) : " + rand);
				for (int j = i - 1; j >= 0; j--) {
					if (arr[j] == rand) {
						i--;
						break;
					}
					else if (rand < arr[j]) {
						arr[j + 1] = arr[j];
						arr[j] = rand;
					} else if (rand > arr[j]) {
						arr[j + 1] = rand;
						break;
					}
				}
//				arr[i]= rand;
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}

	}

}
