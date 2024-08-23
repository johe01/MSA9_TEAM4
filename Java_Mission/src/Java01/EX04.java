package Java01;

import java.util.Scanner;

//정수 하나를 입력 받아 N에 초기화 시키고
// 5를 입력하면 홀수만큼 커지는 트리 만들기.

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// "*" 출력프로그램
		// "*" 한개씩만 출력하는 반복문
		for (int i = 0; i < N; i++) {
			
			//줄이 늘어날때마다 "*"이  1*2 +1 ,2*2 +1 씩 증가시키는 반복문
			for (int j = 0; j < (i * 2 )+ 1 ; j++) {
				System.out.print("*");

			}
			System.out.println();
		}	sc.close();
	}

}