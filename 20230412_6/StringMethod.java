package k20230412;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "    tjoeunit    ";
//		length() : 문자열을 구성하는 문자의 개수를 얻어옴
		System.out.println("문자 개수 : " + str.length());
		
		str = "    tjoeunit    ";
		System.out.println(str);
//		trim() : 문자열 앞, 뒤의 불필요한 빈칸(공백)을 제거함
		System.out.println(str.trim()); 
		System.out.println("불필요한 빈칸을 제거한 문자 개수 : " + str.trim().length());
		
		System.out.print("문자열 입력: ");
//		데이터 입력 단계에서 불필요한 공백을 제거하고 입력받으려면 아래와 같이 trim() 메소드를
//		사용하면 된다.
//		String name = sc.nextLine().trim();
//		System.out.println(name);

		System.out.println("========================================================");
		
		str = "123-45678-12345";
		System.out.println("앞쪽 '-'의 index: " + str.indexOf("-")); 
		System.out.println("뒤쪽 '-'의 index: " + str.lastIndexOf("-"));
		String code = str.substring(str.indexOf("-") + 1, str.lastIndexOf("-")); // str.substring(4, 9);
		System.out.println(code.length());
		
		String str2 = "123-45678-12345";
		System.out.println(str2.trim());
		
		String newCode = str.substring(0, str.indexOf("-") + 1);
//		for (int i=0; i<code.length(); i++) {  // 1번째 방법
//			newCode += "*";
//		}
		newCode += "*".repeat(code.length());  // 2번째 방법
		newCode += str.substring(str.lastIndexOf("-"));
		System.out.println(newCode);
		
		String[] newCode2 = str.split("-"); // split() => 구분자 하나만 쓸 수 있음
		System.out.println(Arrays.toString(newCode2));
		System.out.printf("%s-%s-%s\n", newCode2[0], "*".repeat(newCode2[1].length()), newCode2[2]);
		newCode = String.format("%s-%s-%s", newCode2[0], "*".repeat(newCode2[1].length()), newCode2[2]);
		System.out.println(newCode);
	}
}
