package k20230413;

import java.util.Scanner;

public class CompanyNoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사업자등록번호 10자리를 '-'없이 입력하세요: ");
		String comp = sc.nextLine().trim();
		
		String check = "137137135";
		int sum = 0;
//		네이버 사업자등록번호 => 2208162517
//		사업자등록번호의 9번째 자리까지 각 자리의 숫자와 가중치를 곱한 결과의 1자리 합계를 계산
		for(int i=0; i<9; i++) {
			sum += Integer.parseInt(comp.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "") % 10;
			
		}
		
//		사업자등록번호의 9번째 자리에 가중치를 곱한 결과의 10의 자리를 더함
		sum += Integer.parseInt(comp.charAt(8) + "") * Integer.parseInt(check.charAt(8) + "") / 10;
		System.out.println(sum);
		
//		사업자등록번호의 가중치와 9번째 자리까지 연산 결과에 사업자등록번호의 10번째 자리의 숫자와 더함
		sum += comp.charAt(9) - 48;
		
//		최종 결과가 10의 배수이면 정상, 그렇지 않으면 오류
		System.out.println(sum % 10 == 0 ? "정상" : "오류");
		
	}
}
