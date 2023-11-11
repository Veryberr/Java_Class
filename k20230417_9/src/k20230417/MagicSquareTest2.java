package k20230417;

import java.util.Scanner;

public class MagicSquareTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("마방진을 출력할 행렬의 차수를 3이상의 수로 입력하세요: ");
			n = sc.nextInt();
			if(n >= 3 && n % 2 == 1) {
				break;
			}
			System.out.println("3이상인 홀수를 입력하세요.");
		}
		
//		n행 n열인 2차원 배열을 선언
		int[][] arr = new int[n][n];
//		최초의 "1"이 채워질 자리를 계산함
		int i = 0, j = n / 2; // j = (n - 1) / 2;
		for(int k=1; k<=Math.pow(n, 2); k++) {
			arr[i][j] = k;
			if( k % n == 0) {
				i++;
			}else {
				if(--i == -1) {
					i = n - 1;
				}
				if(++j == n) {
					j = 0;
				}
			}
		}
		
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
