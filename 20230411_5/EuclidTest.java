package k20230411;

import java.util.Scanner;

public class EuclidTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		최대공약수, 최소공배수를 계산할 숫자 2개를 입력받는다.
		System.out.print("숫자 두 개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		입력받은 숫자 2개를 큰수, 작은수로 판단
		int big, small;
		
		if(a > b) {
			big = a;
			small = b;
		}else {
			small = a;
			big = b;
		}
//		System.out.printf("큰수 : %d, 작은수 : %d\n", big, small);
		
//		입력받은 숫자의 크기에 따라서 나눗셈 연산을 실행하는 횟수가 다르므로
//		무한루프를 돌려서 처리한다.
		while(true) {
			int r = big % small;  // 큰수를 작은수로 나눈 나머지를 계산
//			큰수를 작은수로 나누어 떨어지면 작은수가 최대공약수이므로 무한루프 탈출
			if(r == 0) {
				break;
			}
//			큰수를 작은수로 나누어 떨어지지 않았으면 큰수를 기억하던 기억장소에는
//			작은수를 넣어주고 작은수를 기억하던 기억장소에는 나머지를 넣어줌
			big = small;
			small = r;
				
		}
		
//		최대공약수와 최소공배수를 출력함
		System.out.printf("최대공약수 : %d, 최소공배수 : %d\n", small, a * b / small);
	}
	
}
