import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 2단, 3단
		for(int i = 2; i <= 3; i++) {
			System.out.println("\n" + "구구단을 외우자 " + i + "단" + "\n");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
		}

		// 4단, 5단
		System.out.println("어느 단을 출력하시겠습니까? : ");
		Scanner gugudan = new Scanner(System.in);
		int input = gugudan.nextInt();
		
		for(int i = 1; i <10; i++) {
			int result = input * i; 
			System.out.println(result); 

		}
		
		// 6단
		int i = 6, j = 1; 
		while(j < 10) {
			System.out.println(i + " * " + j + " = " + (i*j));
			j++;
		}
		// 7단
		for(int m = 1; m < 10; m++) {
			System.out.println(7 + " * " + m + " = " + (7*m));
		}
	
		// 8단, 9단 
		System.out.println("구구단 중 출력할 단은? : ");		
		Scanner scanner = new Scanner(System.in);
		int input2 = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + input2);
		
		if((input2 < 2 || input2 > 9)) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		} else {
			for(int n = 1; n < 10; n++) {
			System.out.println(input2 + " * " + n + " = " + (input2 * n));
			}
		}
	
}
}