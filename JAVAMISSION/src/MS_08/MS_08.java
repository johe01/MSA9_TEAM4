package MS_08;

import java.util.Scanner;

public class MS_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int [n][n];
		int sum=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (0==i%2) {
					arr[i][j]=sum;
				}else {
					arr[i][n-1-j]=sum;
				}
				sum++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
