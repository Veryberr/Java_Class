package k20230411;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
		
//		int[] bubble = {8, 3, 4, 9, 1};
		int[] bubble = {9, 1, 3, 4, 8};
		System.out.println(Arrays.toString(bubble));
		
		for(int i=0; i<bubble.length; i++) {  // for(int i=0; i<bubble.length - 1; i++) 회전수 제어
			for(int j=1; j<bubble.length-i; j++) {  // for(int j=0; j<bubble.length - 1 - i; j++) 비교 위치 설정
//				System.out.printf("i = %d, j = %d\n", bubble[i], bubble[j]);
				if(bubble[j-1] > bubble[j]) { // if(bubble[j] > bubble[j + 1])   // "<" 내림차순 정렬
					int temp = bubble[j-1];  // int temp = buuble[j];
					bubble[j-1] = bubble[j];  // bubble[j] = bubble[j + 1];
					bubble[j] = temp;  // bubble[j + 1] = temp;
				}
			}
			System.out.println(i + 1 + "회전 결과 : " + Arrays.toString(bubble));
		}
		System.out.println("정렬 결과 : " + Arrays.toString(bubble));
		
	}
	
}
