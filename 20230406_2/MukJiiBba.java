package k20230406;

import java.util.Random;
import java.util.Scanner;

public class MukJiiBba {

	public static void main(String[] args) {
		
//		가위(1), 바위(2), 보(3)
		Random random = new Random();
		
		int cpu = random.nextInt(3) + 1;
//		System.out.println(cpu);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) : ");
		int user = scanner.nextInt();
		
		
		
		if(cpu == user) {
			System.out.println("비겼다.");
		}else if((cpu == 1 && user == 2) || (cpu == 2 && user == 3) || (cpu == 3 && user == 1)) {
			System.out.println("이겼다.");
		}else {
			System.out.println("졌다.");
		}
		
	}
	
}
