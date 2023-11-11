package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTest {

	public static void main(String[] args) {
		
		int[] bubble = {9, 1, 3, 4, 8};
		System.out.println(Arrays.toString(bubble));
		
		for(int i=0; i<bubble.length - 1; i++) {  
			
//			flag라는 이름의 변수를 만들어 0으로 초기화
//			int flag = 0;
			boolean isFlag = true;
			
			for(int j=0; j<bubble.length - 1 - i; j++) {  
				if(bubble[j] > bubble[j+1]) { 
					int temp = bubble[j];  
					bubble[j] = bubble[j+1];  
					bubble[j+1] = temp; 
					
//					값 교환이 이루어지면 flag 변수에 1을 저장한다.
//					값 교환이 이루어지면 flag 변수에 false를 저장한다.
//					flag = 1;
					isFlag = false;
					
				}
			}
			
//			정렬이 완료된 경우 값 교환 작업이 진행되지 않기 때문에 flag 변수는 0을 유지
//			정렬이 완료된 경우 값 교환 작업이 진행되지 않기 때문에 flag 변수는 true를 유지
			if(isFlag) {
//				정렬이 완료된 상태라면 더 이상 회전할 필요가 없으므로 i반복을 탈출함
				break;
			}
			
			System.out.println(i + 1 + "회전 결과 : " + Arrays.toString(bubble));
		}
		System.out.println("정렬 결과 : " + Arrays.toString(bubble));
		
	}
	
}
