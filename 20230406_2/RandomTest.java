package k20230406;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
//		Math.random() : 0 이상이고 1 미만인 무작위 수 
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println((int) (Math.random() * 45) + 1);
		System.out.println("=============================================");
//		Random 클래스
		Random random = new Random();
		System.out.println(random.nextDouble()); // Math.random()과 동일
		
		System.out.println(random.nextInt(45) + 1);
		System.out.println(random.nextInt(45) + 1);
		System.out.println(random.nextInt(45) + 1);
		System.out.println(random.nextInt(45) + 1);
		System.out.println(random.nextInt(45) + 1);
		System.out.println(random.nextInt(45) + 1);
		
	}
}
