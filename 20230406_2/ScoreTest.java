package k20230406;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		한번에 하나씩 입력 받아서 결과 출력
		/*
		System.out.print("점수1 입력 : ");
		int s1 = scanner.nextInt();
		
		System.out.print("점수2 입력 : ");
		int s2 = scanner.nextInt();
		
		System.out.print("점수3 입력 : ");
		int s3 = scanner.nextInt();
		*/
		
//		띄어쓰기를 경계로 한번에 입력 받아서 결과 출력
		System.out.print("3과목 점수 입력 : ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();	
		
		int total = s1 + s2 + s3;
		double avg = (double) total / 3;
		System.out.printf("점수 3개의 합은 %3d입니다.\n", total);
		System.out.printf("점수 3개의 평균은 %6.2f입니다.\n", avg);
		
		if(avg >= 90) {
			System.out.println("A학점입니다.");
		}else if(avg >= 80) { // if(avg >= 80 && avg < 90)
			System.out.println("B학점입니다.");
		}else if(avg >= 70) {
			System.out.println("C학점입니다.");
		}else if(avg >= 60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		

	}
}













