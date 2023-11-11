package k20230410;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class PowerballTest {

	public static void main(String[] args) {
		
//		추첨 규칙: 1 ~ 69 중에서 5개, 1 ~ 26 중에서 1개(파워볼 규칙)
		
//		추첨기를 만든다.
		int[] powerball = new int[69];
		
//		추첨기에 공을 넣는다.
		for(int i=0; i<powerball.length; i++) {
			powerball[i] = i+1;
		}
//		System.out.print(Arrays.toString(powerball));
		
//		섞는다.
//		수업 코드
		show(powerball);
		System.out.println("\n=================================섞기 전");
		
		
//		내가 적은 코드
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(68) + 1;
			int temp = powerball[0];
			powerball[0] = powerball[r];
			powerball[r] = temp;
		}
//		System.out.print(Arrays.toString(powerball));
		
		show(powerball); 
		System.out.println("\n===========================섞은 후");
		
//		1등 번호를 출력한다.
		System.out.print("흰공 : ");
		for(int i=0; i<5; i++) {
			System.out.printf("%2d ", powerball[i]);
			
			try {
				Thread.sleep(1000); // 사용자가 의도적으로 멈추게 함(사용자 인터럽트)
//				1초 = 1000
//				0.001초 = 1
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			
		}
		System.out.printf("빨간공 : %2d ", random.nextInt(26) + 1);
		
	}

	private static void show(int[] powerball) {
		for(int i=0; i<powerball.length; i++) {
			System.out.printf("%2d ", powerball[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}
