package Java01;

import java.util.Scanner;

//영어 : eng , 수학  :math,자바 :java
//순서대로 점수를 입력받아
//성정의 총합계와 평균을 계산하여 출력하는 프로그램을 작성
public class EX01 {
	public static void main(String[] args) {
	
		//입력문
	Scanner sc = new Scanner(System.in);
		int eng = sc.nextInt();
		System.out.println("영어 점수 : " + eng);
		int math = sc.nextInt();
		System.out.println("수학 점수 : " + math);
		int java = sc.nextInt();
		System.out.println("자바 점수 : " + java);
		
		
		int sum = eng + math + java;
		System.out.println("총점 : " + sum);
		
		int total = sum / 3;
		System.out.println("평균 : " + total);

		sc.close();
	}

	

}
