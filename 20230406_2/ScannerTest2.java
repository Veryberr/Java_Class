package k20230406;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = scanner.nextInt();
//		String age = scanner.nextLine();
		
//		nextInt(), nextDouble() 등 문자열이 아닌 데이터를 읽어들이는 메소드는 메소드 자신이
//		읽어들일 데이터만 읽어들임. => 마지막의 엔터키는 읽어들이지 않는다.
		
//		키보드 버퍼를 비우는 작업 필요
		scanner.nextLine();

		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		System.out.println(name + "님은 내년에 " + (age + 1) + "살 입니다.");
	}

}
