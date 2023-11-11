package k20230407;

public class ForTest {

	public static void main(String[] args) {

//		for {} 블록을 조건이 만족하는 동안 반복해서 실행
//		반복 횟수가 알려져 있는 경우 주로 사용
		
//		for(자료형 변수이름 = 초기치; 조건식; 증감식) {
//			조건이 참인 동안 실행할 문장;
//			...;
//		}
		
		int sum = 0;
//		i를 1로 초기화하고 조건을 비교해 만족할 경우 반복이 시작
//		조건을 만족하면 {} 블록의 내용을 실행하고 i를 증감치 만큼 변경한 후
//		조건을 만족하면 {} 블록을 실행하고 조건을 만족하지 않으면 반복 종료
		for(int i=1; i<=10; i++) {
//			System.out.println(i);
			
//			대입 연산자 : "="과 같이 사용 +=, -=, *=, /=, %=, ...
			sum += i; // sum = sum + i; 와 동일한 식
		}
		System.out.println("1 ~ 10의 합계 : " + sum);
		
//		증감 연산자 : ++(1증가), --(1감소) => 단항 연산자
//		a++ : 사용 후 1증가, a 변수에 저장된 값을 사용(연산)하고 ";"을 만나서 문장이 종료될 때 1 증가
//		++a : 1증가 후 사용, a에 저장된 값을 1증가시키고 사용
//		a-- : 사용 후 1감소, a 변수에 저장된 값을 사용(연산)하고 ";"을 만나서 문장이 종료될 때 1 감소
//		--a : 1감소 후 사용, a에 저장된 값을 1감소시키고 사용
		
		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e); // c언어에서는 마지막 d인 5를 기준으로 계산하여 e = 20
//		배열은 정해진 크기 바꾸지 못함.(C++은 상관없음, c, java) => length
//		array list 값을 넣는대로 크기가 알아서 설정됨(c) => size()
//		linked list(포인터로 연결되어 있는 값들)
	}

}
