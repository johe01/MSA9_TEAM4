package Java01;

import java.util.Scanner;

//정수 하나를 입력 받아, 정수형 변수 n에 초기화.
// 정수 1부터 N까지 홀수의 출력과 각 더한 합계 출력 
// 예시) 1+3+5+7+9 =25...와 짝수의 합계
//그리고 정수 n의 약수를 구하여 출력

public class EX02 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        
///////////////////////홀수////////////////////////////////////
	    	int sum1 = 0;
	        for (int i = 1; i <= N; i++) {
	            if (i % 2 == 1) {
	                System.out.print(i);
	                sum1 += i;
	                if (i < N - 1) {
	                    System.out.print("+");
	                }
	            }
	        }
	        System.out.println(" = " + sum1);
	    
	
///////////////////////짝수///////////////////////////////////
	        int sum2 = 0;
	        for (int j = 1; j <=N; j++) {
	        	if(j % 2 == 0) {
	        		System.out.print(j);
	        		sum2 += j;
	        		if (j < N - 1) {
	        			System.out.print("+");
	        		}
	        	}
	        }
	        System.out.println(" = " + sum2);
///////////////////////약수///////////////////////////////////
	        for (int l = 1; l <=N; l++) {
	        	if(N % l == 0)
	        		System.out.print(l+ " ");
			}	        
	   
}
}
