package MS_06;

import java.util.Random;
import java.util.Scanner;

public class MS_06 {
	
	public static void main(String[] args) {
		int arr[] = new int[6];  // 배열 생성
		
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  	// 몇 게임할지 입력받음
		sc.close(); 
		for (int sum=0; sum<n;sum++) {
			  // 입력 받은 수만큼 반복
			System.out.printf("[%d 게임] : ",sum+1);
			arr[0]=(int) (Math.random() * 45) + 1;
			for (int i = 1; i < arr.length; i++) {  //i=0부터 arr.length(6)만틈 반복
				Random random = new Random();
				int rand = random.nextInt(45)+1; // 난수 받기
				
				for(int j=i-1;j>=0;j--) { 
					if (i==0){
						arr[i]=rand;
					}
					else if(arr[j] == rand) {
						i--;
						break;
					}
				}
				
			}
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();

			
		}

	}

}
