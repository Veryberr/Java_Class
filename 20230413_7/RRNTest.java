package k20230413;

import java.util.Arrays;
import java.util.Scanner;

public class RRNTest {
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		String num = sc.next();
		char[] arr = num.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
		}
		*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주민등록번호를 입력하세요: ");
		
		
		int[] num = {8,3,0,4,2,2,1,1,8,5,6,0,0};
		int sum = 0;
		for(int i=0; i<num.length-1; i++) {
			if(i > 7) {
				num[i] *= i - 6;
			}else {
				num[i] *= (i + 2);
			}
			sum += num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println(sum);
		
		while(true) {
			sum %= 11;
			if(sum <= 10)
				break;
		}
		System.out.println(sum);
		
		if(sum == num[12]) {
			System.out.println("정상");
		}else {
			System.out.println("오류");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
