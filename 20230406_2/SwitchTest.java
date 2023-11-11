package k20230406;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3과목 점수 입력 : ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();	
		
		int total = s1 + s2 + s3;
		double avg = (double) total / 3;
		
	//	key에는 정수를 기억하는 변수 또는 연산 결과가 정수인 수식 사용
	//	JDK 1.7 부터는 key에 문자열도 사용 가능(실수만 사용 불가)
	//	switch (key) {
	//		case value: // ":"임에 주의!!
	//			key와 value가 일치하면 실행할 문장;
	//			...;
	//			[break;] // 필요에 따라 생략 가능
	//		...
	//		[default: // 기타 등등 케이스(if~else문의 else와 비슷)
	//			key와 일치하는 value가 없을 경우 실행할 문장;
	//			...;
	//			break;]
	//	}
		
		switch((int) avg / 10) {
			case 10:
				System.out.println("참 잘했어요");
//				break는 제어문(if는 제외)의 {} 블록을 탈출 
//				<=> continue는 제어문의 {} 블록을 다시 실행
//				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default: // case 5: case 4: case 3: case 2: case 1: case 0:
				System.out.println("F");
				break; // 마지막은 안 써도 됨(C#은 써야 함)
		}
		
		
	}
	
}
