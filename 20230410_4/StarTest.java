package k20230410;

public class StarTest {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=0; i<5; i++) { // 열
			for(int j=0; j<i+1; j++) { // j<=i와 동일 출력  // 행
//				System.out.printf("i = %d, j = %d\n", i, j);
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=0; i<5; i++) { // 열
			for(int j=0; j<=4-i; j++) { // j<5-i와 동일 출력  // 행
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i=0; i<5; i++) { 
//			공백
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
//			별
			for(int j=0; j<=i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i=0; i<5; i++) { 
//			공백
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
//			별
			for(int j=0; j<=4-i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
//		*       * 
//		**     **
//		***   ***
//		**** ****
//		*********
		
		for(int i=0; i<5; i++) {
//			별
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
//			공백
			for(int k=0; k<7-i*2; k++) {
				System.out.print(" ");
			}
//			별
			for(int m=0; m<=i; m++) {
				if(m != 4) { // if(m == 4) break;와 동일
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("====================");
		
	}
	
}
