package Java01;

//1~ 100까지 정수를 출력하면서 3,6,9 만들기
//해당정수 대신에 3,6,9 개수만큼 *을 출력

public class EX03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			int one = i / 10; // 1.[i]를 10으로나누었을때
			int two = i % 10; // 2.[i]를 10으로 나누었을때 나머지값

			// ||or
			boolean one369 = one == 3 || one == 6 || one == 9; // 1.이 3,6,9,와 같을경우는
			boolean two369 = two == 3 || two == 6 || two == 9; // 2.이 3,6,9,와 같을경우는

			// && and
			if (one369 && two369) {
				System.out.println("**");
			}
			if (one369 || two369) {
				System.out.println("*");
			} else {
				System.out.println(i);

			}

		}

	}
}
