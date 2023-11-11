package k20230407;

import java.util.Random;

public class DiceTest2 {

	public static void main(String[] args) {
		
//		주사위를 10번 굴려서 발생된 눈의 개수를 센다.
		Random random = new Random();
//		주사위의 눈의 개수를 기억할 변수를 선언하고 0으로 초기화
		int[] num = new int[6];
		
		for(int i=0; i<10; i++) {
//			주사위 눈을 무작위로 발생시킴
//			System.out.println(random.nextInt(6) + 1);
			int dice = random.nextInt(6) + 1;
			System.out.println(dice);
			
//			주사위 눈의 개수를 센다.
			/* if~else문
			if(dice == 1) {
				num1++;
			}else if(dice == 2) {
				num2++;
			}else if(dice == 3) {
				num3++;
			}else if(dice == 4) {
				num4++;
			}else if(dice == 5) {
				num5++;
			}else {
				num6++;
			}
			*/
			
//			switch문
			/*
			switch(dice) {
			case 1:
				num[0]++; break;
			case 2:
				num[1]++; break;
			case 3:
				num[2]++; break;
			case 4:
				num[3]++; break;
			case 5:
				num[4]++; break;
			case 6:
				num[5]++; break;
			}
			*/
			
			num[dice - 1]++;
//			num[random.nextInt(6)]++;
				
		}
		
//		주사위 눈의 개수 출력
//		System.out.println("1의 개수 : " + num[0]);
//		System.out.println("2의 개수 : " + num[1]);
//		System.out.println("3의 개수 : " + num[2]);
//		System.out.println("4의 개수 : " + num[3]);
//		System.out.println("5의 개수 : " + num[4]);
//		System.out.println("6의 개수 : " + num[5]);
		
		for(int i=0; i<num.length; i++) {
			System.out.println(i + 1 + "의 개수 : " + num[i]);
		}
		
	}
}
