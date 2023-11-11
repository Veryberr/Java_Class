package k20230406;

import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
//		키보드로 1문자 입력받기
		System.out.print("continue?(y/n) ");
		char confirm = scanner.nextLine().charAt(0); // 문자열에서 맨 앞의 문자 하나만 입력받음
		System.out.println(confirm);
		
	}
	
}
