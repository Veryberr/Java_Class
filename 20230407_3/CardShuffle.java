package k20230407;

import java.util.Arrays;
import java.util.Random;

public class CardShuffle {
	
	public static void main(String[] args) {
		
//		두 기억장소에 저장된 값 교환하기
/*		int a = 3, b = 4;
		System.out.println("a = " + a + ", b = " + b);

		int c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + ", b = " + b);
*/
//		cards 라는 int형 배열을 만들고 0 ~ 51로 초기화
		int[] cards = new int[52];
		for(int i=0; i<cards.length; i++) {
			cards[i] = i;
		}
//		System.out.println(Arrays.toString(cards));
		
		
//		카드 출력에 사용할 숫자와 무늬를 기억하는 배열 만든다.
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // 10이 두자리라 String 
		String[] symbol = {"♠", "◇", "♥", "♧"};
		
		
//		섞기전 상태 출력
		extracted(cards, number, symbol);
		System.out.println("================섞기 전=================");
		
//		섞는다.
//		cards[0]와 cards[1] ~ cards[51] 사이의 랜덤한 위치를 선택해서 값을 교환
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(51) + 1; // 51 => 0 ~ 50사이의 랜덤 수
			int temp = cards[0];
			cards[0] = cards[r];
			cards[r] = temp;
		}
		
		extracted(cards, number, symbol); // 리팩토링
		System.out.println("================섞은 후=================");
	
		
	}

	private static void extracted(int[] cards, String[] number, String[] symbol) {
		for(int i=0; i<cards.length; i++) {
//			System.out.printf("%2d ", cards[i]);
//			System.out.printf("%2s ", number[cards[i] % 13]); // 숫자만 출력 // cards배열은 int, number배열은 String이라 에러 발생
//			System.out.printf("%s ", symbol[cards[i] / 13]); // 무늬만 출력
			System.out.printf("%s%-2s ", symbol[cards[i] / 13], number[cards[i] % 13]);
			
//			숫자 13개를 출력하고 줄 바꿈
			if((i + 1) % 13 == 0) 
				System.out.println();
		}
	}
}
