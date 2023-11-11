package k20230411;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합계 : " + sum);
		
//		반복으로 최초 진입시 조건이 거짓이면 {} 블록을 한 번도 실행하지 않음
//		while (조건식) [
//			조건식이 참인 동안 반복할 문장;
//			...;
//		}
		
		sum = 0;
		int i = 1; // i = 0;
		while(i<=10) { // i<10
//			sum += i;
//			i++;
			sum += i++; // ++i;
		}
		System.out.println("1 ~ 10의 합계 : " + sum);
		
//		반복으로 최초 진입시 조건이 거짓이라도 {} 블록을 한 번은 실행함
//		do {			
//			조건식이 참인 동안 반복할 문장;
//			...;
//		}while(조건식);  // ";"을 빼먹으면 안됨
		
		sum = 0;
		i = 0;
//		sum = i = 0;  0을 i에 저장하고 i에 저장된 값을 sum에 저장(변수 선언 시에는 사용 불가(int sum = i = 0;))
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1 ~ 10의 합계 : " + sum);
		
	}
}
