package k20230407;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("완전수인가 판단할 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
//		약수 출력
		for(int i=1; i<=number; i++) {
			if(number % i == 0)
				System.out.println(i);
		}
		
//		모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 가장 큰 수는 
//		자신의 절반을 넘지 않음
		int sum = 0; // 자기 자신을 제외한 약수의 합계를 기억할 변수
		for(int i=1; i<=number/2; i++) {
//			입력한 숫자의 약수 판단
			if(number % i == 0) {
//				System.out.println(i);
				sum += i; // 약수의 합계를 계산
			}
		}
		
//		완전수인가(자신을 제외한 약수의 합이 자기 자신과 같은가) 판단
		if(number == sum) {
			System.out.println(number + "는 완전수입니다.");
		}else {
			System.out.println(number + "는(은) 완전수가 아닙니다.");
		}
		
		System.out.println("=============================");
		int[] num = {5, 56, 6, 28, 496, 8128};
		int sum2;		
		for(int i=0; i<num.length; i++) {
			sum2 = 0;
			for(int j=1; j<=num[i]/2; j++) {
				if(num[i] % j == 0) {
					sum2 += j;
				}
				
			}
			if(num[i] == sum2) {
				System.out.println(num[i] + "는 완전수입니다.");
			}else {
				System.out.println(num[i] + "는(은) 완전수가 아닙니다.");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
