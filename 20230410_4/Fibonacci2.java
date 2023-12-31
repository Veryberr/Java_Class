package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
	
//		피보나치 수열의 합계를 계산할 항을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 항수를 입력하세요 : ");
		int n = sc.nextInt();
		
//		입력받은 피보나치 수열의 합계를 계산할 항의 개수만큼 배열을 만든다.
		int[] fibo = new int[n];
//		System.out.println(Arrays.toString(fibo));
//		System.out.println("배열의 크기 : " + fibo.length);
		
//		배열의 0번째, 1번째 인덱스 요소를 각각 1로 초기화시킴
		fibo[0] = 1; 
		fibo[1] = 1; 
		int y = 2; 
		
//		피보나치 수열의 각 항 값으로 배열을 채우고 피보나치 수열의 합계를 계산함
		for(int k=3; k<=n; k++) {
//			fibo[2] = fibo[0] + fibo[1];
			fibo[k-1] = fibo[k-3] + fibo[k-2];
			y += fibo[k-1];
		}
		System.out.println(y + ", " + Arrays.toString(fibo));
		
		System.out.printf("피보나치 수열의 %d번째 항까지의 합계 : %d = ", n, y);
		for(int i=0; i<fibo.length - 1; i++) { 
			System.out.print(fibo[i] + " + ");
		}
		System.out.println(fibo[fibo.length - 1]);

		
		System.out.printf("피보나치 수열의 %d번째 항까지의 합계 : %d = ", n, y);
		for(int i=0; i<fibo.length; i++) { 
			if (i > 0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		System.out.println();
		
	}

}
