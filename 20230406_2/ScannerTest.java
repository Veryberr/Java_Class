package k20230406;

import java.util.Scanner; // ctrl + shift + o : 불필요한 임포터 제거

public class ScannerTest {

	public static void main(String[] args) {

//		변수 : 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소
//		변수 이름은 영문자, 숫자, 특수문자(_)만 사용해서 만들 수 있고,
//		첫 글자는 반드시 문자로 시작

//		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화
//		예약어(static과 같이)는 변수 이름으로 사용하면 안됨

//		자료형 변수이름; // 변수만 선언 => 변수에는 쓰레기가 들어있다.
//		자료형 변수이름 = 초기치; // 변수를 선언하고 초기치로 초기화

		int num = 0; // int num; -> num = 100; => 선언 후, 초기화해줘도 됨
		System.out.println(num);

//		"="의 의미는  "=" 오른쪽의 데이터를 "=" 왼쪽의 기억장소에 대입(할당, 배정)시키라는 의미
//		=> 대입문, 할당문, 배정문 => "=="가 같다로 사용
		
//		전체 범위 지정 -> ctrl + shift + F : 들여쓰기 정리
//		shift + tab : 앞으로 탭
		
//		클래스이름 객체이름 = new 생성자(); // 첫 글자 대문자 = 클래스
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 스캐너
		
//		키보드로 입력받은 데이터를 변수에 저장
		System.out.print("주소 : ");
		
		String addr = scanner.nextLine(); 
// 		next() : 한 단어 입력
//		nextLine() : 한 줄 입력
//		스캐너로 키보드로 입력하는 내용을 입력받을 경우 바로 변수에 저장되는 것이 아니고 
//		키보드 버퍼라는 임시 기억장소에 저장된 후 읽어들이는 메소드가 실행될 때 변수에 저장
//		nextLine()은 키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만 키보드 버퍼가 
//		비어있지 않으면 키보드 버퍼의 내용을 끝까지 읽어들임
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.println(name + "님은 " + addr + "에 삽니다.");
		
//		System.out.println(addr);
		
		
		
		
	}
}
































