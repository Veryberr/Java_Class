package k20230417;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없음
		int[] data = new int[10];
		
		for(int i=0; i<10; i++) {
			data[i] = i + 1;
		}
		for(int i=0; i<10; i++) {
			System.out.printf("data[%d] = %d\n", i, data[i]);
		}
		
//		배열은 인덱스가 배열의 범위를 벗어나면 ArrayIndexOutOfBoundsException이 발생
//		for(int i=10; i<20; i++) {
//			data[i] = i + 1;
//		} 
		
//		ArrayList는 데이터가 삽입되면 자동으로 크기가 커지고 제거되면 자동으로 크기가 작아짐.
//		중간에 데이터가 삽입되면 삽입되는 위치부터 모든 데이터가 뒤로 이동되고 
//		중간의 데이터가 제거되면 제거된 데이터 다음 위치부터 모든 데이터가 앞으로 이동됨.
		
//		<E>: 제네릭이라 부르며, ArrayList에 저장할 데이터의 타입을 반드시 클래스로 적어야 함.
//		=> 기본 자료형(int, float 등) 사용 불가 => 기본 자료형 데이터를 저장하는 ArrayList를
//		만들어야 할 경우 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용해야 함. => 랩퍼 클래스는
//		기본 자료형의 첫 문자만 대문자로 바꾸면 됨. 단, int는 Integer로 char는 Character로 사용 
//		ArrayList list = new ArrayList(); // JDK 1.4 버전 이전
//		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK 1.5 버전 이후 
		ArrayList<Integer> list = new ArrayList(); // JDK 1.7 버전 이후
		
		for(int i=0; i<10; i++) {
			list.add(i + 1);
		}
		
		for(int i=0; i<10; i++) {
			System.out.printf("list.get(%d) = %2d\n", i, list.get(i));
		}
		
		for(int i=10; i<20; i++) {
			list.add(i + 1);
		}
		
		for(int i=10; i<20; i++) {
			System.out.printf("list.get(%d) = %2d\n", i, list.get(i));
		}
		
//		ArrayList도 인덱스가 범위를 벗어나면 IndexOutOfBoundsException가 발생됨.
//		System.out.println(list.get(20));
		
	}
}
