package k20230407;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		
//		추첨기를 만든다.
		int[] lotto = new int[45];
		
//		추첨기에 공을 넣는다.
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
//		System.out.print(Arrays.toString(lotto));
		
//		섞는다.
//		수업 코드
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n=================================섞기 전");
		
		
//		내가 적은 코드
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
//		System.out.print(Arrays.toString(lotto));
		
//		수업 코드
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		} 
		System.out.println("\n===========================섞은 후");
		
//		1등 번호를 출력한다.
		System.out.print("1등 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%2d ", lotto[i]);
			
			try {
				Thread.sleep(1000); // 사용자가 의도적으로 멈추게 함(사용자 인터럽트)
//				1초 = 1000
//				0.001초 = 1
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
		System.out.printf("보너스 : %2d ", lotto[6]);
		
	}
	
}
