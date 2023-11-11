package k20230412;

import java.util.Scanner;

public class Sosoo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인가 판단할 숫자를 입력하세요: ");
		int n = scanner.nextInt();
//		모든 수는 1로 나누어 떨어지기 때문에 2부터 떨어질 때까지 나누어본다.
		int i;
		for(i=2; i<=n; i++) {
			if(n % i == 0) {
//				나누어서 떨어지면 소수인가 판단하기 위해서 반복을 탈출함
				break;
			}
		}
		
//		소수인가 판단
		if(n == i) {
			System.out.println(n + "은(는) 소수입니다.");
		}else {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		
	}
	
}
